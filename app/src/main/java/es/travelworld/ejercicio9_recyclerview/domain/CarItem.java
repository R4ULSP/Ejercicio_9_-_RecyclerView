package es.travelworld.ejercicio9_recyclerview.domain;

public class CarItem {

    private final float carPrice;
    private final String carType;
    private final String carName;

    public CarItem(float carPrice, String carType, String carName) {
        this.carPrice = carPrice;
        this.carType = carType;
        this.carName = carName;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarName() {
        return carName;
    }
}
