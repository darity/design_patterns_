package Structural.Flyweight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Flyweight
class TreeType{
    private final String name;
    private final String color;

    public TreeType(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void draw(int x, int y){
        System.out.println("Drawing "+name+" tree ("+color+") at ("+x+","+y+")");
    }
}

// Flyweight factory
class TreeFactory{
    private final HashMap<String, TreeType> treeTypeHashMap = new HashMap<>();

    public TreeType getTreeType(String name, String color){
        String key = name+"_"+color;
        treeTypeHashMap.putIfAbsent(key, new TreeType(name, color));
        return treeTypeHashMap.get(key);
    }
}
// Context
class Tree{
    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(){
        type.draw(x,y);
    }
}

// Client
class Forest{
    private final List<Tree> trees = new ArrayList<>();
    private final TreeFactory treeFactory = new TreeFactory();

    public void plantTree(int x, int y, String name, String color){
        trees.add(new Tree(x,y, treeFactory.getTreeType(name, color)));
    }

    public void draw(){
        for(Tree t: trees){
            t.draw();
        }
    }

}
