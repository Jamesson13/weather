package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class WeatherForecast {
    private String code;		//code Internal parameter
    private String message;	// Internal parameter
    private City city;
    @SerializedName("list")
    private List[] list;
    private String cnt;		//Number of lines returned by this API call
}
