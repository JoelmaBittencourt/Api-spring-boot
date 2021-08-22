package com.myapi.resources.exception;

public class StandarError {

	private Integer status;
	
	private Long timestamp;
	
	private String message;{
		
		
	}
//
	//
	//
	public StandarError(int i, long l) {//talvez de erro
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
}
