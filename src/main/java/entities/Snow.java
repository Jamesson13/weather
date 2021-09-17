package entities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Snow {
    @SerializedName("3h")
    private String _3h; // Snow volume for last 3 hours

    @SerializedName("1h")
    private String _1h; //Rain volume for the last 1 hour, mm
}
