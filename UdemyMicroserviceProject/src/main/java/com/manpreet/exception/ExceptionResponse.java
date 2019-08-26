package com.manpreet.exception;

import java.util.Date;

public class ExceptionResponse {

	private String message;
	private Date timeStamp;
	private String detail;

	public ExceptionResponse(String message, Date timeStamp, String detail) {
		super();
		this.message = message;
		this.timeStamp = timeStamp;
		this.detail = detail;
	}

	public String getMessage() {
		return message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public String getDetail() {
		return detail;
	}
}
