package entities;

import com.google.gson.annotations.SerializedName;

public class Coord {
    @SerializedName("lon")
    private String lon ;   //City geo location, latitude
    @SerializedName("lat")
    private String lat ;	//City geo location, latitude

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }
}
