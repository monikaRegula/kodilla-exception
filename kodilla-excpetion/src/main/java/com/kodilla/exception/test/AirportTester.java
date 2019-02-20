package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class AirportTester {
    public static void main(String[] args) {

        Flight flight = new Flight("Wrocław","Berlin");
        Flight flight1 = new Flight("Berlin","Wrocław");
        Flight flight2 = new Flight("Wrocław", "Warszawa");

        Map<String,Boolean> flightMap = new HashMap<>();
        flightMap.put("Berlin",true);
        flightMap.put("Wrocław",false);


        FindingFlight findingFlight = new FindingFlight(flightMap);
        //lot do Berlina możliwy
        findingFlight.findFlight(flight);
        //lot do Wrocławia niemożliwy
        findingFlight.findFlight(flight1);
        //lotniska nie ma na hashmapie
        findingFlight.findFlight(flight2);
    }
}
