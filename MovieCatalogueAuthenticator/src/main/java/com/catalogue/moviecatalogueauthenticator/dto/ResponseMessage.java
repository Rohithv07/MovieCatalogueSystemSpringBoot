package com.catalogue.moviecatalogueauthenticator.dto;

/**
 * Common response message
 * 
 * @author rohithvazhathody
 *
 */
public class ResponseMessage {

	private Object data;
	private int statusCode;
	private String message;

	/**
	 * @param data
	 * @param statusCode
	 * @param message
	 */
	public ResponseMessage(Object data, int statusCode, String message) {
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

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
