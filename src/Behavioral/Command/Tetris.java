package Behavioral.Command;

interface Command{
    void execute();
}

class Down implements Command{

    private final Player player;

    public Down(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveDown();
    }
}

class Left implements Command{
    private final Player player;

    public Left(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveLeft();
    }
}

class Turn implements Command{

    private final Player player;

    public Turn(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveTurn();
    }
}

class Right implements Command{

    private final Player player;

    public Right(Player player){
        this.player = player;
    }

    @Override
    public void execute() {
        player.moveRight();
    }
}

// Invoker
class Controller{
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }
}

// Receiver
class Player{

    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
    public void moveTurn(){}

}

class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Controller controller = new Controller();

        controller.setCommand(new Down(player));
        controller.press();

        controller.setCommand(new Left(player));
        controller.press();

        controller.setCommand(new Right(player));
        controller.press();
    }
}