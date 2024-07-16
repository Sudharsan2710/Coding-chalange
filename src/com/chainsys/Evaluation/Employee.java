package com.chainsys.Evaluation;

public class Employee {

	private int id;
	private String name;
	private String branch;
	private double rating;
	private boolean companyTransport;

	public Employee(int id, String name, String branch, double rating, boolean companyTransport) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.companyTransport = companyTransport;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean isCompanyTransport() {
		return companyTransport;
	}

	public void setCompanyTransport(boolean companyTransport) {
		this.companyTransport = companyTransport;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", branch=" + branch + ", rating=" + rating
				+ ", companyTransport=" + companyTransport + "]";
	}

}
