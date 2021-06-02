package controllers;


import java.util.List;

import automobiles.Vehicle;


public interface GarageController<T extends Vehicle> {
	
	T create();
	
	boolean delete();
	
	List<T> readAll();
	
	T update();
}