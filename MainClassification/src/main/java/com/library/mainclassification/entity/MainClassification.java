package com.library.mainclassification.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "library_micro_service_main_classification", name = "mainclass")
public class MainClassification implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mainClassId;
	private String mainClassName;


	

	public MainClassification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainClassification(Long mainClassId) {
		super();
		this.mainClassId = mainClassId;
	}

	public Long getMainClassId() {
		return mainClassId;
	}

	public void setMainClassId(Long mainClassId) {
		this.mainClassId = mainClassId;
	}

	public String getMainClassName() {
		return mainClassName;
	}

	public void setMainClassName(String mainClassName) {
		this.mainClassName = mainClassName;
	}

}