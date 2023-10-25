public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        FurnitureClient modernClient = new FurnitureClient(modernFactory);
        modernClient.arrangeFurniture();

        FurnitureClient victorianClient = new FurnitureClient(victorianFactory);
        victorianClient.arrangeFurniture();
    }
}