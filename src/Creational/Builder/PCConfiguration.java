package Creational.Builder;


class RAM{

}

class CProcessor{

}

class GraphicCard{

}

class OS{

}

class Disc{

}

// Complex Product
class Computer{
    private RAM ram;
    private CProcessor processor;
    private GraphicCard graphicCard;
    private OS os;
    private Disc disc;

    void setRam(RAM ram) {
        this.ram = ram;
    }

    void setProcessor(CProcessor processor) {
        this.processor = processor;
    }

    void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    void setOs(OS os) {
        this.os = os;
    }

    void setDisc(Disc disc) {
        this.disc = disc;
    }
}

interface Builder{
    void buildRAM();
    void buildCProcessor();
    void buildGraphicCard();
    void buildOS();
    void buildDisc();

    Computer build();
}

class ComputerBuilder implements Builder{

    private Computer computer = new Computer();

    @Override
    public void buildRAM() {
        computer.setRam(new RAM());
    }

    @Override
    public void buildCProcessor() {
        computer.setProcessor(new CProcessor());
    }

    @Override
    public void buildGraphicCard() {
        computer.setGraphicCard(new GraphicCard());
    }

    @Override
    public void buildOS() {
        computer.setOs(new OS());
    }

    @Override
    public void buildDisc() {
        computer.setDisc(new Disc());
    }

    @Override
    public Computer build() {
        return computer;
    }
}

//optional:
class Director{
    void buildGamingComputer(Builder builder){
        builder.buildRAM();
        builder.buildCProcessor();
        builder.buildGraphicCard();
        builder.buildOS();
        builder.buildDisc();
    }
}