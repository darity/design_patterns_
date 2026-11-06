package Structural.Facade;

class CPU{
    public void start(){}
}

class Memory{
    public void start(){}
}

class HardDrive{
    public void start(){}
}

class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade(){
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer(){
        cpu.start();
        memory.start();
        hardDrive.start();
    }
}
