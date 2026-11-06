package Creational.AbstractFactory;

interface Button{

}

interface Checkbox{

}

class MacButton implements Button{

}

class MacCheckbox implements Checkbox{

}

class WinButton implements Button{

}

class WinCheckbox implements Checkbox{

}

interface Factory{
    Button createButton();
    Checkbox createCheckbox();
}

class MacFactory implements Factory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

class WinFactory implements Factory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}