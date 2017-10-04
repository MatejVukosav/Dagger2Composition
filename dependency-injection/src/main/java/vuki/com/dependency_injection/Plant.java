package vuki.com.dependency_injection;

import android.app.Application;

import vuki.com.dependency_injection.di.DaggerPlantComponent;
import vuki.com.dependency_injection.di.PlantComponent;

/**
 * Created by mvukosav
 */
public class Plant {

    PlantComponent plantComponent;

    private static Plant instance;

    private Plant() {

    }

    public static Plant getInstance() {
        if ( instance == null ) {
            instance = new Plant();
        }
        return instance;
    }

    public void init( Application application ) {

        plantComponent = DaggerPlantComponent.builder()
                .build();
    }

    public PlantComponent getPlantComponent() {
        return plantComponent;
    }
}
