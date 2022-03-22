package com.training.cg.dp;

public class FactoryDesign {
      public static void main(String[] args) {
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("sms");
		notification.notifyuser();
	}
	
}
//Super class
//Factory Design Pattern: It is creational design pattern:
//It says that crate an interface and let the the subclass deide
//which object to create.

//Singleton Design Pattern: (No multiple objects) when only one instance of a particular class
//instance needed ,we go for singleton design pattern.
//It is also creational design pattern

//Structural Design Pattern

//1.Decorator Design pattern: It allows to add functionality dynamically
// without affecting objects of same class.

//2.Facade Design Pattern:Hides the complexity of the application and provides a simple
//interface Design Pattern

//1.Download the Jar file and put it in classpath
//2.Use Maven: Download dependencies from the configuration file



