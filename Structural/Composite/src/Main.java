public class Main {
    public static void main(String[] args) {
        Component product1 = new Product(10.0);
        Component product2 = new Product(5.0);

        Box box1 = new Box();
        box1.addComponent(product1);
        box1.addComponent(product2);

        Component product3 = new Product(42.0);

        Box mainBox = new Box();
        mainBox.addComponent(box1);
        mainBox.addComponent(product3);

        System.out.println("Total Price: " + mainBox.getPrice());

    }
}