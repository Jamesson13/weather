package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class WeatherForecastDaily {
    private City city;
    private String cod;		// Internal parameter
    private String message;	//Internal parameter
    private String cnt;		// Number of lines returned by this API call
    @SerializedName("list")
    private ListDaily[] list;
}
