package com.emc.dto;

public class Participants extends EMBase 
{
	
	private String emailid;
	private boolean checkedin;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public boolean isCheckedin() {
		return checkedin;
	}
	public void setCheckedin(boolean checkedin) {
		this.checkedin = checkedin;
	}
}
