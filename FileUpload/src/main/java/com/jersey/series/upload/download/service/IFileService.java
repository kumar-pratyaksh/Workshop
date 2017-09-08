package com.jersey.series.upload.download.service;

import java.io.InputStream;

import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

public interface IFileService {

	public Response downloadPdfFile();

	public Response uploadPdfFile(InputStream fileInputStream,
			FormDataContentDisposition fileFormDataContentDisposition);
}
