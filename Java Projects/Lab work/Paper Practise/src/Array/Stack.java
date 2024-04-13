package Array;

public class Stack {
    private int stc[];
    private int tos;

    public Stack(int size) {
        stc = new int [size];
        tos = -1;
    }
    //push
    void push(int item){
        if(tos == stc.length-1)
        {
            System.out.println("Stack is full");
        }
        else
            stc[++tos] = item;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack underflos");
        return 0;}
    else return stc[tos--];
    }
}
