package entities;

import lombok.Getter;

@Getter
public class Wind {
    private String speed;	//Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
    private String deg ;	//Wind direction, degrees (meteorological)
}
