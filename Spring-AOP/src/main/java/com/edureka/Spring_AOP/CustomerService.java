package com.edureka.Spring_AOP;

public class CustomerService {
	private String name;
	private String url;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", url=" + url + "]";
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
