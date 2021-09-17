package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class HourlyForecast {
    private String code;		//code Internal parameter
    private String message; 	// Internal parameter
    private City city;
    private String population;      //Country code (GB, JP etc.
    @SerializedName("list")
    private List[] list;
    private String cnt;		//Number of lines returned by this API call

}
