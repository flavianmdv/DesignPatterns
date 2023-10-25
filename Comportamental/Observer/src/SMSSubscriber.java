class SMSSubscriber implements Subscriber {
    private String phoneNumber;

    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String news) {
        System.out.println("SMS to " + phoneNumber + ": Breaking news - " + news);
    }
}