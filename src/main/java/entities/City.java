package entities;

public class City {

    private String id ; 		//City ID
    private String name;		//City name
    private String country;		//Country code (GB, JP etc.)
    private Coord coord;
    private String timezone;       //Shift in seconds from UTC

    public String getTimezone() {
        return timezone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Coord getCoord() {
        return coord;
    }
}
