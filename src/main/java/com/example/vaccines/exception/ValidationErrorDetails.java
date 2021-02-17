package com.example.vaccines.exception;

import java.util.Date;
import java.util.List;

import org.springframework.validation.FieldError;

public class ValidationErrorDetails {
  private Date timestamp;
	private List<FieldError> errors;
	private String details;
	
	public ValidationErrorDetails(Date timestamp, List<FieldError> errors, String details) {
		this.timestamp = timestamp;
		this.errors = errors;
		this.details = details;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public List<FieldError> getErrors() {
		return errors;
	}
	public void setMessage(List<FieldError> errors) {
		this.errors = errors;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
