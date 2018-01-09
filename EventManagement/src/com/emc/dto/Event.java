package com.emc.dto;

public class Event extends EMBase
{
	private String description;
	private String StartDate;
	private String EndDate;
	private boolean Started;
	
	public Event(long id,String name,String description)
	{
		this.id=id;
		this.name=name;
		this.description=description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public boolean isStarted() {
		return Started;
	}

	public void setStarted(boolean started) {
		Started = started;
	}
}
