package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class CurrentWeather {
    private Coord coord;
    @SerializedName("weather")
    private Weather[]weather; //(more info Weather condition codes)
    private String base ; //Internal parameter
    private Main main ;
    private Wind wind ;
    private Clouds clouds;
    private Rain rain;
    private Snow snow;
    private Sys sys ;
    private String dt ; //Time of data calculation, unix, UTC
    private String id; //City ID
    private String name; //City name
    private String cod ; //Internal parameter
    private String visibility;
    private String timezone ; //Shift in seconds from UTC


    public Coord getCoord() {
        return coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Sys getSys() {
        return sys;
    }

    public String getDt() {
        return dt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCod() {
        return cod;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getTimezone() {
        return timezone;
    }
}
