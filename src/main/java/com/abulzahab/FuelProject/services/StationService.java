package com.abulzahab.FuelProject.services;

import java.util.ArrayList;
import java.util.List;

import com.abulzahab.FuelProject.model.FuelStation;

public class StationService {
	
public static List<FuelStation> allStation = new ArrayList<FuelStation>();

public static List<FuelStation> getAllStation() {
	
	
	allStation.add(new FuelStation(1,"Mahaeny"));
	allStation.add(new FuelStation(2,"Mahatah"));
	allStation.add(new FuelStation(3,"shaf3y"));
    allStation.add(new FuelStation (4,"asddy"));

	
	return allStation;
}

public static void setAllStation(List<FuelStation> allStation) {
	StationService.allStation = allStation;
	
	
}


}
