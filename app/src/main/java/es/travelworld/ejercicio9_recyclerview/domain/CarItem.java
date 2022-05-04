package es.travelworld.ejercicio9_recyclerview.domain;

public class CarItem {

    private final float carPrice;
    private final String carType;
    private final String carName;
    private final ResourcesCar resourcesCar;

    public CarItem(float carPrice, String carType, String carName, ResourcesCar resourcesCar) {
        this.carPrice = carPrice;
        this.carType = carType;
        this.resourcesCar = resourcesCar;
        this.carName = carName;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public String getCarType() {
        return carType;
    }

    public ResourcesCar getResourcesCar() {
        return resourcesCar;
    }

    public String getCarName() {
        return carName;
    }
}
