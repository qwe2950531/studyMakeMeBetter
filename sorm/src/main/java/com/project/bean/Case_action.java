package com.project.bean;
import java.sql.*;
import java.util.*;


public class  Case_action {

	private java.sql.Timestamp update_time;

	private java.sql.Timestamp create_time;

	private Integer is_valid;

	private Integer id;

	private String case_action_name;

	private java.sql.Timestamp search_time;



	public void setUpdate_time(java.sql.Timestamp update_time) {
		this.update_time=update_time;
	}


	public java.sql.Timestamp getUpdate_time() {
		return update_time;
	}

	public void setCreate_time(java.sql.Timestamp create_time) {
		this.create_time=create_time;
	}


	public java.sql.Timestamp getCreate_time() {
		return create_time;
	}

	public void setIs_valid(Integer is_valid) {
		this.is_valid=is_valid;
	}


	public Integer getIs_valid() {
		return is_valid;
	}

	public void setId(Integer id) {
		this.id=id;
	}


	public Integer getId() {
		return id;
	}

	public void setCase_action_name(String case_action_name) {
		this.case_action_name=case_action_name;
	}


	public String getCase_action_name() {
		return case_action_name;
	}

	public void setSearch_time(java.sql.Timestamp search_time) {
		this.search_time=search_time;
	}


	public java.sql.Timestamp getSearch_time() {
		return search_time;
	}


}
