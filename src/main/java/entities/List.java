package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class List {
    private String dt ;             //Time of data forecasted, unix, UTC
    private String dt_txt;		//Data/time of calculation, UTC
    private Clouds clouds;
    private Wind wind;
    private Rain rain;
    private Snow snow;
    private Main main;
    @SerializedName("weather")
    private Weather[] weather;	// (more info Weather condition codes)
    @SerializedName("temp")
    private Temp temp;              //Part of the day (n - night, d - day)
    private String sys;

}
