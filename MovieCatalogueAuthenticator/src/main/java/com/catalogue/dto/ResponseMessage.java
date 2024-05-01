package com.catalogue.dto;

/**
 * Common response message
 * 
 * @author rohithvazhathody
 *
 */
public class ResponseMessage {

	private Object data;
	private String statusCode;
	private String message;

	/**
	 * @param data
	 * @param statusCode
	 * @param message
	 */
	public ResponseMessage(Object data, String statusCode, String message) {
		super();
		this.data = data;
		this.statusCode = statusCode;
		this.message = message;
	}

	public ResponseMessage() {
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
