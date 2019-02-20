package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindingFlight {

   private  Map <String,Boolean> flightMap = new HashMap<>();
    //klucz - String - nazwa lotniska
    //wartość - Boolean - czy można polecieć


    public FindingFlight(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }


    public void findFlight(Flight flight){

        //value to wartość dla rekordu mapy klucza flight.arrivalAirport
        Object value = flightMap.get(flight.arrivalAirport);
        //infromacyjnie w konsoli wyświetlam dane do lotniska
        System.out.println("Lotnisko: "+flight.arrivalAirport+ " boolean: "+value);

        //jeśli lotnisko zawiera się w mapie i wartość jest true to można lecieć
        if ((flightMap.containsKey(flight.arrivalAirport))  &&  value.equals(true)){

            System.out.println("Flight is avaible. Have a nice journey :)" +'\n');
        }
        //jeśli lotnisko zawiera się w mapie ale wartość false to czekamy na lot
        else if ((flightMap.containsKey(flight.arrivalAirport))  &&  value.equals(false)){
            System.out.println("Departure is delayed because of the weather. Please wait. "+ '\n');

        }
        //w innym wypadku wywala wyjątek RouteNotFoundException
        else{
            try {
                throw new RouteNotFoundException();
            } catch (RouteNotFoundException e) {
                System.out.println("It is forbidden to fly. Sorry :(" + '\n');
            }

        }

    }

}
