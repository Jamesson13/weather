package main;

import classes.Unit;
import entities.CurrentWeather;
import entities.HourlyForecast;
import entities.WeatherForecast;
import entities.WeatherForecastDaily;
import exeptions.WeatherDataServiceException;
import interfaces.IWeatherDataService;
import services.DataServiceFactory;

public class Main {
    public static void main(String[] args) {

        try
        {

            //TEST
            String apiKey ="b4750ec5b8a50652493e6f310812a9fe";
            IWeatherDataService dataService = DataServiceFactory.getWeatherService(DataServiceFactory.service.OPEN_WEATHER_MAP,apiKey);
            dataService.setUnit(Unit.Metric);
            WeatherForecast data =   dataService.GET_5_DAY_WEATHER_FORECAST_DATA_BY_CITY_NAME("London","uk");
            CurrentWeather data1 = dataService.GET_CURRENT_WEATHER_DATA_BY_CITY_NAME("London");
            CurrentWeather data2 = dataService.GET_CURRENT_WEATHER_DATA_BY_CITY_NAME("London","uk");
            //HourlyForecast data3 = dataService.GET_HOURLY_FORECAST_DATA_BY_CITY_NAME("London");
            //HourlyForecast data4 = dataService.GET_HOURLY_FORECAST_DATA_BY_CITY_NAME("London","uk");


        } catch (WeatherDataServiceException e)
        {
            e.printStackTrace();
        }

    }
}
