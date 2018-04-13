package com.starWars;

import org.json.JSONObject;

public class Vehicle extends Instance {

    Vehicle(int id, boolean createdFromJSON) {
        super(id, createdFromJSON);
        setResource("vehicles/");
        getData();
    }
    Vehicle(String search){
        super(search);
        setResource("vehicles");
        search();
    }


    @Override
    void assignValues(JSONObject jsonObject) {

    }

    @Override
    public String toString(){
        return super.toString();
    }
}
