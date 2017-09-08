package com.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/university")
public class University {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String send() {
		return "Hello world";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	// @Path("{name}")
	// public String send1(@PathParam(value = "name") String name,
	// @QueryParam(value = "id") int id) {
	public String send1(@MatrixParam("name") String name, @MatrixParam("id") int id) {
		return "<h1>Hello World!!! from " + name + id + " </h1>";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String send2() {
		return "<?xml version='1.0' encoding='UTF-8' standalone='yes'?><employee id='1'><name>KP</name><salary>23423.09234</salary></employee>";
	}

	@GET
	@Path("/file")
	@Produces(MediaType.MULTIPART_FORM_DATA)
	public Response send3() {
		File file = new File("/Users/Pratyaksh.Kumar/Downloads/O'Reilly Head First Servlets and JSP.pdf");
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Diposition", "attachment;filename=DisplayName-FileHandler.pdf");
		return builder.build();
	}

	@POST
	@Path("submit")
	@Produces(MediaType.TEXT_PLAIN)
	public String submit(@FormParam("name") String name, @FormParam("password") String password) {
		return name + " " + password;
	}

	@POST
	@Path("saveFile")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_PLAIN)
	public Response uploadFile(@FormParam("file") InputStream inputStream,
			@FormDataParam("file") FormDataContentDisposition disposition) {
		String fileUploadLocation = "~/" + disposition.getFileName();

		writeToFile(inputStream, fileUploadLocation);
		String out = "File uploaded to " + fileUploadLocation;
		return Response.status(200).entity(out).build();

	}

	private void writeToFile(InputStream inputStream, String fileUploadLocation) {
		// TODO Auto-generated method stub
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(fileUploadLocation);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int num;
		try {
			while ((num = inputStream.read()) != -1) {
				outputStream.write(num);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
