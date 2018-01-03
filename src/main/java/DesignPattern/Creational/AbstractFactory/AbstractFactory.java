package main.java.DesignPattern.Creational.AbstractFactory;

public abstract class AbstractFactory {
	   abstract Color getColor(String color);
	   abstract Shape getShape(String shape) ;
	}