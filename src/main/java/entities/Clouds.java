package entities;


import com.google.gson.annotations.SerializedName;


public class Clouds {

    @SerializedName("all")
    private String all; 		//Cloudiness, %

    public String getAll() {
        return all;
    }
}
