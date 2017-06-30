package com.esprit.utils;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Sample implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String job;
	private static final long serialVersionUID = 1L;

	
	public Sample()
	{
		super();
	}
	
	
	public Sample(Integer id, String name, String job)
	{
		super();
		this.id = id;
		this.name = name;
		this.job = job;
	}

	public Sample(String name, String job)
	{
		super();
		this.name = name;
		this.job = job;
	}


	/***************************** Getters & Setters *****************************/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}   
	
	
	
	
}
