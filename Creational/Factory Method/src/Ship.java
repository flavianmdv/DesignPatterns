class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea (Ship)");
    }

    @Override
    public String getDescription() {
        return "This is a ship for sea transportation";
    }


}