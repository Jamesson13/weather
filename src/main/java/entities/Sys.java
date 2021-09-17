package entities;

import lombok.Getter;

@Getter
public class Sys {
    private String type ;           //Internal parameter
    private String id;              //Internal parameter
    private String message ;        //Internal parameter
    private String country ;        //Country code (GB, JP etc.)
    private String sunrise;         //Sunrise time, unix, UTC
    private String sunset;          //Sunset time, unix, UTC
}
