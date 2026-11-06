package Structural.Adapter;

// client expects this interface
// Target
interface PaymentProcessor{
    void pay(double amount);
}

// interface provided by service
// Adaptee
class ThirdPartyPaymentService{
    void makePayment(double amount){

    }
}

// Adapter implements Target and delegates method call to Adaptee
class Service implements PaymentProcessor{
    ThirdPartyPaymentService service;

    public Service(ThirdPartyPaymentService service){
        this.service = service;
    }

    @Override
    public void pay(double amount) {
        service.makePayment(amount);
    }
}

// Uses Target interface
class Client{

    private final PaymentProcessor paymentProcessor;

    public Client(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void pay(double amount){
        paymentProcessor.pay(amount);
    }

}

class Main{
    static void main(String[] args) {
        ThirdPartyPaymentService thirdParty = new ThirdPartyPaymentService();
        Service service = new Service(thirdParty);

        Client client = new Client(service);
        client.pay(100);
    }
}