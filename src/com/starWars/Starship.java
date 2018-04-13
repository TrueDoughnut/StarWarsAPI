package com.starWars;

import org.json.JSONException;
import org.json.JSONObject;

public class Starship extends Instance {

	String model, starshipClass, manufacturer, costInCredits,
		length, crew, passengers, maxAtmospheringSpeed, hyperdriveRating,
		mglt, cargoCapacity, consumables; 
	
    Starship(int id, boolean createdFromJSON) {
        super(id, createdFromJSON);
        setResource("starships/");
        getData();
    }
    Starship(String search){
        super(search);
        setResource("starships");
        getData();
    }


    @Override
    void assignValues(JSONObject jsonObject) {
		name = jsonObject.getString("name");
		model = jsonObject.getString("model"); 
		starshipClass = jsonObject.getString("starship_class"); 
		manufacturer = jsonObject.getString("manufacturer"); 
		costInCredits = jsonObject.getString("cost_in_credits"); 
		length = jsonObject.getString("length") + "m";
		crew = jsonObject.getString("crew"); 
		passengers = jsonObject.getString("passengers"); 
		maxAtmospheringSpeed = jsonObject.getString("max_atmosphering_speed"); 
		hyperdriveRating = jsonObject.getString("hyperdrive_rating"); 
		mglt = jsonObject.getString("MGLT"); 
		cargoCapacity = jsonObject.getString("cargo_capacity"); 
		consumables = jsonObject.getString("consumables"); 
		
		if(!createdFromJSON){
			getPeopleArray(jsonObject.getJSONArray("pilots")); 
			getFilmsArray(jsonObject.getJSONArray("films")); 
		}
    }

    @Override
    public String toString(){
        String msg = ""; 
		
		msg += "name: " + name
			+ "\nmodel: " + 
		
		return msg; 
    }

}
