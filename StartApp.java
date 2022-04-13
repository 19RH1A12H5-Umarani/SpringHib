package com.pt.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.math.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pt.config.AppConfig;
import com.pt.entities.Mobile;
import com.pt.services.MobileService;

public class StartApp {
	public static void main(String[] args) throws InterruptedException, SQLException{
		System.out.println("This is the start of the PT Spring Hibernate application");
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		MobileService mobileService=context.getBean(MobileService.class);
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your choice : ");
		System.out.println("1)Insert 2)Delete 3)Update 4)Select 5)Exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Adding mobile details");
		mobileService.add(new Mobile(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.nextLong()));
		break;
		case 2:System.out.println("Deleting mobile details");
		Mobile m=new Mobile();
		m.setM_num(sc.nextInt());
		mobileService.delete(m);
		break;
		case 3:System.out.println("Updating mobile details");
		mobileService.update(new Mobile(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.nextLong())); 
		break;
		
		case 4:System.out.println("Retriving mobile details");
		List<Mobile> mob=mobileService.selection();
		for(Mobile i:mob) {
			System.out.println(i.getM_num()+"    "+i.getM_name()+"     "+i.getRam()+"     "+i.getColor()+"      "+i.getImei());
		}
		break;
		
		case 5:System.out.println("Existing");
			System.exit(0);
			break;
		}
		}while(true);
		
		/*List<Mobile> mob=mobileService.selection();
		for(Mobile i:mob) {
			System.out.println(i.getM_num()+"    "+i.getM_name()+"     "+i.getRam()+"     "+i.getColor()+"      "+i.getImei());
		}
		Mobile m1=new Mobile();
		m1.setM_num(4);
		/*m1.setM_name("Realme");
		m1.setRam(32);
		//m1.setColor("White");
		 * 
		 	m1.setImei(123321432354l);
		long num=9912571934l;
		//mobileService.delete(m1);
		m1.setColor("Black");
		//mobileService.update(m1);
		mobileService.add(new Mobile(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.nextLong()));*/
		//mobileService.delete(m1);
		
		//context.close();
	}
}
