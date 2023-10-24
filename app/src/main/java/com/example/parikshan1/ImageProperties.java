package com.example.parikshan1;
import com.google.gson.annotations.SerializedName;

public class ImageProperties {
    @SerializedName("predicted_terrain")
    private String predictedTerrain;

    public String getPredictedTerrain() {
        return predictedTerrain;
    }
}
