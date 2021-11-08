package com.example.capstone.service;

import com.example.capstone.model.Capstone;

public class FactorCalculator {

    public double calculateVehicleTypeFactor(String vehicleType){

        double vehicleTypeFactor = 0.00;

        switch(vehicleType){
            case "Cabriolet":
                vehicleTypeFactor = 1.3;
                break;
            case "Coupe":
                vehicleTypeFactor = 1.4;
                break;
            case "Estate":
                vehicleTypeFactor = 1.5;
                break;
            case "Hatchback":
                vehicleTypeFactor = 1.6;
                break;
            case "Other":
                vehicleTypeFactor = 1.7;
                break;
            default:
                vehicleTypeFactor = 100;
                break;
        }
        return vehicleTypeFactor;
    }

    public double calculateEngineSizeFactor(String engineSize){

        double engineSizeFactor = 0;

        switch(engineSize){
            case "1000":
                engineSizeFactor = 1.0;
                break;
            case "1600":
                engineSizeFactor = 1.6;
                break;
            case "2000":
                engineSizeFactor = 2.0;
                break;
            case "2500":
                engineSizeFactor = 2.5;
                break;
            case "3000":
                engineSizeFactor = 3.0;
                break;
            case "Other":
                engineSizeFactor = 3.5;
                break;
            default:
                engineSizeFactor = 100;
                break;
        }
        return engineSizeFactor;
    }

    public double calculateVehicleValueFactor(String value){
        double vehicleValueFactor = 0.0;
        double valueAsDouble = Double.valueOf(value);

        vehicleValueFactor = (valueAsDouble <= 5000 ? 1.0 : 1.2);

        return vehicleValueFactor;
    }

    public double calculateAdditionalDriversFactor(String additionalDrivers){
        double additionalDriversFactor = 0.0;
        double additionalDriversAsDouble = Double.valueOf(additionalDrivers);

        additionalDriversFactor = (additionalDriversAsDouble < 2 ? 1.1 : 1.2);

        return additionalDriversFactor;
    }

    public double calculateCommercialUseFactor(String commercialUse){
        double commercialUseFactor = 0.0;

        commercialUseFactor = (commercialUse.equals("Yes") ? 1.1 : 1.0);

        return commercialUseFactor;
    }

    public double calculateOutsideStateUseFactor(String outsideStateUse){
        double outsideStateUseFactor = 0.0;

        outsideStateUseFactor = (outsideStateUse.equals("Yes") ? 1.1 : 1.0);

        return outsideStateUseFactor;
    }

    public double calculateInsurcanceQuote(Capstone driver){

        double q1 = calculateVehicleTypeFactor(driver.getCarType());
        double q2 = calculateEngineSizeFactor(driver.getEngineSize());
        double q3 = calculateAdditionalDriversFactor(driver.getAdditionalDrivers());
        double q4 = calculateCommercialUseFactor(driver.getCommercialPurposes());
        double q5 = calculateOutsideStateUseFactor(driver.getOutsideState());
        double q6 = calculateVehicleValueFactor(driver.getVehicleValue());


        return 100 * (

                q1 * q2 * q3 * q4 * q5 * q6

        );
    }
}
