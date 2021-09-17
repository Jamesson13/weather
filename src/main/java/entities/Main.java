package entities;

import lombok.Getter;

@Getter
public class Main {
    private String temp; 		//Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
    private String pressure;	//Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data), hPa
    private String humidity;	//Humidity, %
    private String temp_min;	/* Minimum temperature at the moment. This is deviation from current temp
								that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
								Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit. */
    private String temp_max;    /* Maximum temperature at the moment.
								This is deviation from current temp that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
								Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit. */
    private String sea_level;	//Atmospheric pressure on the sea level, hPa
    private String grnd_level;	//Atmospheric pressure on the ground level, hPa
    private String temp_kf ;	//Internal parameter

}
