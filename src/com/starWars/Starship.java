package com.starWars;

import org.json.JSONException;
import org.json.JSONObject;

public class Starship extends Instance {

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

    }

    @Override
    public String toString(){
        return super.toString();
    }

}
