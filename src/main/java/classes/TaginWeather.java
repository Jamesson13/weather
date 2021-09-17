package classes;

public enum TaginWeather {
    CURRENT_WEATHER_DATA("weather"),
    _16_DAY_WEATHER_FORECAST_DATA("forecast/daily"),
    _5_DAY_WEATHER_FORECAST_DATA("forecast"),
    HOURLY_FORECAST_DATA  ("forecast/hourly");


    private String name = "";

    //Constructeur
    TaginWeather(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
