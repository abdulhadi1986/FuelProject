package com.abulzahab.FuelProject.services;

import java.util.ArrayList;
import java.util.List;

import com.abulzahab.FuelProject.model.Address;

public class AddressService {
	public static List<Address> allAddresses = new ArrayList<Address>(); 
	
	public static List<Address> getAddresses(){
				
		allAddresses.add(new Address(1,"Damascus" , "Midan"));
		allAddresses.add(new Address(2,"Damascus" , "Mazzeh"));
		allAddresses.add(new Address(3,"Homs","Zahra"));
						
		return allAddresses; 
	}

}
