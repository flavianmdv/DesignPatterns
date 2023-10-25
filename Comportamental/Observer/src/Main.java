public class Main {

    public static void main(String[] args) {
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();
        Subscriber emailSubscriber = new EmailSubscriber("john@example.com");
        Subscriber smsSubscriber = new SMSSubscriber("+1234567890");

        newsAgency.registerSubscriber(emailSubscriber);
        newsAgency.registerSubscriber(smsSubscriber);

        newsAgency.publishNews("Your house is on fire!");

        newsAgency.removeSubscriber(emailSubscriber);

        newsAgency.publishNews("Another breaking news, yout house is on water!");
    }
}