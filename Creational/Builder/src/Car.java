class Car {
    private String engine;
    private int seats;
    private boolean tripComputer;
    private boolean GPS;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGPS() {
        return GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }
}