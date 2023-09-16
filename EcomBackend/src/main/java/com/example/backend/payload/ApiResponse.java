package com.example.backend.payload;

public class ApiResponse {
  private String Messsage;
  private boolean success ;
public String getMesssage() {
	return Messsage;
}
public void setMesssage(String messsage) {
	Messsage = messsage;
}
public boolean isSuccess() {
	return success;
}
public void setSuccess(boolean success) {
	this.success = success;
}
public ApiResponse() {
	super();
}
public ApiResponse(String messsage, boolean success) {
	super();
	Messsage = messsage;
	this.success = success;
}
	
	
	
}
