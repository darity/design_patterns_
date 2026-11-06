package Structural.Decorator;

interface Coffee{
    double getValue();
    String getName();
}

class ClassicBlend implements Coffee{


    @Override
    public double getValue() {
        return 1.80;
    }

    @Override
    public String getName() {
        return "ClassicBlend Coffee";
    }
}

class PremiumBlend implements Coffee{

    @Override
    public double getValue() {
        return 2.3;
    }

    @Override
    public String getName() {
        return "PremiumBlend Coffee";
    }
}


class Milk implements Coffee{
    Coffee coffee;
    double MILK_PRICE = 0.8;

    public Milk(Coffee coffee){
        this.coffee = coffee;
    }

    public double getValue(){
        return coffee.getValue()+MILK_PRICE;
    }

    public String getName(){
        return coffee.getName() + " with milk";
    }
}

class Sugar implements Coffee{
    Coffee coffee;
    double SUGAR_PRICE = 0.5;

    public Sugar(Coffee coffee){
        this.coffee = coffee;
    }

    public double getValue(){
        return coffee.getValue()+SUGAR_PRICE;
    }

    public String getName(){
        return coffee.getName() + " with sugar";
    }
}

class WhipCream implements Coffee{
    Coffee coffee;
    double WHIP_PRICE = 1.2;

    public WhipCream(Coffee coffee){
        this.coffee = coffee;
    }

    public double getValue(){
        return coffee.getValue()+WHIP_PRICE;
    }

    public String getName(){
        return coffee.getName() + " with whip cream";
    }
}
