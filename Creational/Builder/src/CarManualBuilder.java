class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        reset();
    }

    public void reset() {
        manual = new Manual();
    }

    public void setSeats(int seats) {
        String text = "Document car seat features: " + seats + " seats.";
        manual.setManualText(text);
    }

    public void setEngine(String engine) {
        String text = "Add engine instructions: " + engine;
        manual.setManualText(text);
    }

    public void setTripComputer(boolean tripComputer) {
        String text = "Add trip computer instructions.";
        manual.setManualText(text);
    }

    public void setGPS(boolean GPS) {
        String text = "Add GPS instructions.";
        manual.setManualText(text);
    }

    public Manual getProduct() {
        Manual product = manual;
        reset();
        return product;
    }
}