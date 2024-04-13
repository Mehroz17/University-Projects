package Array;

public class MainA {
    public static void main(String[] args) {
        Stack ms = new Stack(5);

        for (int i = 0 ; i<5;i++)ms.push(i);
        System.out.println("Stack");
        for(int i =0  ;i<5;i++){
            System.out.println(ms.pop());
        }
    }
}
