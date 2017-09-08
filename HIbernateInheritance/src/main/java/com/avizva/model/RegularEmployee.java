package com.avizva.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
// Used for applying single table strategy for inheritance
// @DiscriminatorValue("regular")
@Table(name = "regular2")
public class RegularEmployee extends Employee {

	private int salary;
	private int bonus;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
