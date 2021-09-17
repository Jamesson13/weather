package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Rain {
    @SerializedName("3h")
    private String _3h; //Rain volume for last 3 hours, mm

    @SerializedName("1h")
    private String _1h; //Rain volume for the last 1 hour, mm

}
