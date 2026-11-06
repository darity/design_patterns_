package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent{
    int getSize();
}

class File implements FileSystemComponent{
    private final int size;

    public File(int size){
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

class Directory implements FileSystemComponent{

    private final List<FileSystemComponent> content = new ArrayList<>();

    public void addComponent(FileSystemComponent item){
        content.add(item);
    }

    @Override
    public int getSize() {
        int sum = 0;
        for(FileSystemComponent item: content){
            sum += item.getSize();
        }
        return sum;
    }
}