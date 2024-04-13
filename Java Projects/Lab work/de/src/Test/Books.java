package Test;

import java.util.ArrayList;

public class Books {
  private ArrayList<String> name = new ArrayList<>();

    public void addName(String name) {
        this.name.add(name) ;
    }

    public void size(){
        System.out.println("the size of array list is "  + name.size());
    }

    public void Get(int n){
        System.out.println("the element at position: " + name.get(n));
    }
}
