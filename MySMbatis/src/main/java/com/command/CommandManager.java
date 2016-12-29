package com.command;

import java.util.Scanner;

import org.springframework.stereotype.Component;



@Component("commandManager")
public class CommandManager {
	
	public void start() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Manager is started!");
		int cmd=0;
		do {
			System.out.println("type 0 to exit!");
			cmd=sc.nextInt();
		} while (cmd!=0);
		System.out.println("Manager is closed!");
		sc.close();
	}
	
}
