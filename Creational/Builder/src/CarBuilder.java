class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        reset();
    }

    public void reset() {
        car = new Car();
    }

    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    public void setGPS(boolean GPS) {
        car.setGPS(GPS);
    }

    public Car getProduct() {
        Car product = car;
        reset();
        return product;
    }
}