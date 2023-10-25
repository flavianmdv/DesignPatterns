public class Main {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        Transport truck = roadLogistics.createTransport();
        System.out.println(truck.getDescription());

        Logistics seaLogistics = new SeaLogistics();
        Transport ship = seaLogistics.createTransport();
        System.out.println(ship.getDescription());
    }
}