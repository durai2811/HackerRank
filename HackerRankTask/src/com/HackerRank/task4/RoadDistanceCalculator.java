package com.HackerRank.task4;

import com.google.maps.DirectionsApi;
import com.google.maps.DirectionsApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.errors.ApiException;
import com.google.maps.model.DirectionsResult;
import com.google.maps.model.LatLng;

import java.io.IOException;

public class RoadDistanceCalculator {

    public static void main(String[] args) throws IOException, InterruptedException, ApiException {
        /*Remember to set up your Google Cloud project, enable the Directions API, and generate an API key*/
        String api_key ="api_key"; //replace your api key.
        String from ="chennai";
        String destination ="bangalore";
        double currentLat=0.0; // if you gps current location
        double currentLon=0.0;
        //GeoApiContext is created using the API key you provided.
        // This context is used to set up the connection to the Google Maps API.
        GeoApiContext geoApiContext= new GeoApiContext.Builder().apiKey("api_key").build();
        //A DirectionsApiRequest is created using the DirectionsApi class.
        // It specifies the origin (current GPS location) and destination
        // for which you want to calculate road distance.
        DirectionsApiRequest directionsApiRequest;
        if(!from.equals("") && currentLat==0.0 && currentLon ==0.0) {
            directionsApiRequest = DirectionsApi.getDirections(geoApiContext, from, destination);
        }else{
            directionsApiRequest =DirectionsApi.newRequest(geoApiContext)
                    .origin(new LatLng(currentLat,currentLon)).destination(destination);
        }
        //the request.await() method is used to send a request to the Google Maps
        // Directions API and await the response.Once the response is received,
        // it's parsed into a DirectionsResult object.
        DirectionsResult directionsResult=directionsApiRequest.await();
        //The code then extracts the distance in meters from the response and converts it to meters
        long distanceInMeter =directionsResult.routes[0].legs[0].distance.inMeters;
        System.out.println("Road distance from current location to "+distanceInMeter+" m");
        double distanceInKm=distanceInMeter/1000;
        System.out.println("Road distance from current location to "+distanceInMeter+" km");

    }
}
