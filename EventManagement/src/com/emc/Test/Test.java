package com.emc.Test;

import com.emc.dto.Event;
import com.emc.dto.Organiser;

public class Test 
{
	public static void main(String[] args) {
		Organiser o1=new Organiser();
		o1.setId(1234l);
		o1.setName("Czars");
		System.out.println(o1);
System.out.println(o1.getName());
Event e1=new Event(456l,"Vijeth","College day");
System.out.println(e1.getDescription());
	}

}
