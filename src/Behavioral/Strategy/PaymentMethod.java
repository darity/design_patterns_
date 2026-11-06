package Behavioral.Strategy;

// Strategy
interface PaymentMethod {
    void pay();
}

// Concrete Strategy:
class CardPayment implements PaymentMethod{

    @Override
    public void pay() {

    }
}

class PayPalPayment implements PaymentMethod{

    @Override
    public void pay() {

    }
}

class CryptoPayment implements PaymentMethod{

    @Override
    public void pay() {

    }
}

// Context
class Client{
    PaymentMethod paymentMethod;

    public Client(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void pay(){
        paymentMethod.pay();
    }
}