package interfaces;

import classes.Unit;
import entities.CurrentWeather;
import entities.HourlyForecast;
import entities.WeatherForecast;
import entities.WeatherForecastDaily;
import exeptions.WeatherDataServiceException;

public interface IWeatherDataService {

    public Unit getUnit() ;
    public void setUnit(Unit unit) ;


    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException;
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_CITY_ID(long city_ID ) throws WeatherDataServiceException;
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_GEO_COORD(double lat,double lon) throws WeatherDataServiceException;
    public CurrentWeather GET_CURRENT_WEATHER_DATA_BY_ZIP_CODE(long zip_code,String country_code) throws WeatherDataServiceException;

    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException;
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_CITY_ID(long city_ID) throws WeatherDataServiceException;
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_GEO_COORD(double lat,double lon ) throws WeatherDataServiceException;
    public WeatherForecast GET_5_DAY_WEATHER_FORECAST_DATA_ZIP_CODE(long zip_code,String country_code) throws WeatherDataServiceException;

    //public HourlyForecast GET_HOURLY_FORECAST_DATA_BY_CITY_NAME(String city_name, String country_code) throws WeatherDataServiceException;
    //public HourlyForecast GET_HOURLY_FORECAST_DATA_BY_CITY_NAME(String city_name) throws WeatherDataServiceException;
}
