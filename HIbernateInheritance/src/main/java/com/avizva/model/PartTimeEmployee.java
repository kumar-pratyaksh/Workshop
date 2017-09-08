package com.avizva.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// Used for applying single table strategy for inheritance
// @DiscriminatorValue("part_time")
@Table(name = "parttime2")
public class PartTimeEmployee extends Employee {

	private int payPerHour;
	private int contractPeriod;

	public int getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

}
