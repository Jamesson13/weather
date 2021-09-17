package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ListDaily {

        private String deg;		//Wind direction, degrees (meteorological)
        private String dt;
        private String pressure;	//Atmospheric pressure on the sea level, hPa
        private String clouds;		//Cloudiness, %
        private String speed;		//Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
        private String humidity;	// Humidity, %
        private String rain;	// Precipitation volume, mm
        private String snow;	// Snow volume, mm

        @SerializedName("weather")
        private Weather [] weather;
        @SerializedName("temp")
        private Temp temp;
}
