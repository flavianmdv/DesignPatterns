public class FurnitureClient {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public FurnitureClient(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void arrangeFurniture() {
        chair.sitOn();
        sofa.lieOn();
        coffeeTable.putCoffee();
    }
}