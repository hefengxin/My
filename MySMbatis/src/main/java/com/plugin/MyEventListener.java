package com.plugin;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("listener")
public class MyEventListener implements ApplicationListener<MyEvent> {

	public void onApplicationEvent(MyEvent event) {
		System.out.println("Event is running!");
		
	}

//	@Override
//	public void onApplicationEvent(MyEvent event) {
//		System.out.println("Event is running!");
//	}

}
