package Structural.Bridge;

// Abstraction
abstract class Remote{
    protected Device device;

    public Remote(Device device){
        this.device = device;
    }
    abstract void turnOn();
    abstract void turnOff();
}

// Implementor
interface Device{
    void turnOn();
    void turnOff();
    void mute();
}

// Concrete implementor:
class Tv implements Device{

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void mute() {

    }
}

class Radio implements Device{

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void mute() {

    }
}

// Refined Abstraction:
class BasicRemote extends Remote{

    public BasicRemote(Device device){
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }
}

class AdvancedRemote extends Remote{


    public AdvancedRemote(Device device){
        super(device);
    }


    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    public void mute(){
        device.mute();
    }
}
