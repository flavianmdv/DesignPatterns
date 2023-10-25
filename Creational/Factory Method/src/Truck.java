class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land (Truck)");
    }

    @Override
    public String getDescription() {
        return "This is a truck for land transportation";
    }


}