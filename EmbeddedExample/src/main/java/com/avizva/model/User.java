package com.avizva.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long contact;
	// @Embedded
	// @AttributeOverrides({ @AttributeOverride(name = "city", column =
	// @Column(name = "home_city")),
	// @AttributeOverride(name = "country", column = @Column(name =
	// "home_country")),
	// @AttributeOverride(name = "pin", column = @Column(name = "home_pin")) })
	// private Address homeAddress;
	//
	// @Embedded
	// @AttributeOverrides({ @AttributeOverride(name = "city", column =
	// @Column(name = "office_city")),
	// @AttributeOverride(name = "country", column = @Column(name =
	// "office_country")),
	// @AttributeOverride(name = "pin", column = @Column(name = "office_pin"))
	// })
	// private Address officeAddress;
	@ElementCollection
	@JoinTable(name = "user_address", joinColumns = { @JoinColumn(name = "userId", referencedColumnName = "id") })
	@GenericGenerator(name = "address_id_generator", strategy = "sequence")
	@CollectionId(columns = {
			@Column(name = "addr_id") }, generator = "address_id_generator", type = @Type(type = "int"))
	private List<Address> addresses;

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	// public Address getHomeAddress() {
	// return homeAddress;
	// }
	//
	// public void setHomeAddress(Address homeAddress) {
	// this.homeAddress = homeAddress;
	// }
	//
	// public Address getOfficeAddress() {
	// return officeAddress;
	// }
	//
	// public void setOfficeAddress(Address officeAddress) {
	// this.officeAddress = officeAddress;
	// }

}
