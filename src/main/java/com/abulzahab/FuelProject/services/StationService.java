package com.abulzahab.FuelProject.services;

import java.util.ArrayList;
import java.util.List;

import com.abulzahab.FuelProject.model.FuelStation;

public class StationService {
	
public static List<FuelStation> allStation = new ArrayList<FuelStation>();

public static List<FuelStation> getAllStation() {
	return allStation;
}

public static void setAllStation(List<FuelStation> allStation) {
	StationService.allStation = allStation;
}


}
