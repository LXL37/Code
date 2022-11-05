package designPattern.structuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Directory{
    private List<Directory> dirs;
    private Integer level;

    public Folder(String name,  Integer level) {
        super(name);
        this.dirs = new ArrayList<>();
        this.level = level;
    }

    public boolean add(Directory directory){
        return this.dirs.add(directory);
    }
    public boolean remove(Directory directory){
        return this.dirs.remove(directory);
    }
    public Directory get(int index){
        return dirs.get(index);
    }
    public void list(){
        for (Directory dir : this.dirs) {
            System.out.println(dir.name);
        }
    }
    @Override
    public void show() {
        System.out.println(this.name);
        for (Directory dir : this.dirs) {
            if (this.level!=null){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
                for (int i = 0; i < this.level; i++) {
                    if (i==0){
                        System.out.print("+");
                    }
                    System.out.print("-");
                }

            }
            dir.show();
        }
    }
}
