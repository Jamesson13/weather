package services;

import implement.OpenWeatherMap;
import interfaces.IWeatherDataService;

public class DataServiceFactory {
    public enum service{
        OPEN_WEATHER_MAP;
    }
    public static IWeatherDataService getWeatherService(service i_Service, String appID){
        switch (i_Service){
            case OPEN_WEATHER_MAP:
                return OpenWeatherMap.getInstance(appID);
            default: return null;
        }
    }
}
