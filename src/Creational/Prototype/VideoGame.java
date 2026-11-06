package Creational.Prototype;

interface Enemy{
    Enemy clone();
}

class Skeleton implements Enemy{

    private int health;
    private int damage;

    public Skeleton(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    @Override
    public Enemy clone() {
        return new Skeleton(this.health, this.damage);
    }
}