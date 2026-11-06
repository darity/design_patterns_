package Creational.FactoryMethod;

// Product
interface Enemy{
   void attack();
}

// Concrete Products:
class Goblin implements Enemy{

    @Override
    public void attack() {
        System.out.println("Goblin attacked you...");
    }
}

class Dragon implements Enemy{

    @Override
    public void attack(){
        System.out.println("Dragon attacked you...");
    }
}

class Skeleton implements Enemy{

    @Override
    public void attack(){
        System.out.println("Skeleton attacked you...");
    }
}

// Creator
abstract class EnemyFactory{

    // Factory Method
    protected abstract Enemy createEnemy();

    /*
     * Classic Factory Method implementation:
     * The Creator uses the factory method in its
     * business logic, while ConcreteCreators override
     * it to create different ConcreteProducts.
     */
    public void spawnEnemy(){
        Enemy enemy = createEnemy();
        enemy.attack();
    }

}

// Concrete Creators:
class SkeletonFactory extends EnemyFactory{

    @Override
    protected Enemy createEnemy() {
        return new Skeleton();
    }
}

class DragonFactory extends EnemyFactory{

    @Override
    protected Enemy createEnemy() {
        return new Dragon();
    }
}

class GoblinFactory extends EnemyFactory{

    @Override
    protected Enemy createEnemy() {
        return new Goblin();
    }
}

class Main{
    static void main(String[] args) {
        EnemyFactory enemy = new DragonFactory();
        enemy.spawnEnemy();
    }
}