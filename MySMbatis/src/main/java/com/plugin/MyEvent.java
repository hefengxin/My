package com.plugin;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class MyEvent extends ApplicationEvent {

	public MyEvent(Object source) {
		super(source);
	}
	
}
