package entities;

import lombok.Getter;

@Getter
public class Weather {

    private String id; 				//Weather condition id
    private String main;			//Group of weather parameters (Rain, Snow, Extreme etc.)
    private String description;     //Weather condition within the group
    private String icon;			//Weather icon id
}
