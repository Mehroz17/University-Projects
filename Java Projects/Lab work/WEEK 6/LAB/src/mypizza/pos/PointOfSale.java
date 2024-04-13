package mypizza.pos;
import mypizza.top.Topping;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class PointOfSale {
    //States
   private static String crust ;
    private String size;
   final int prize;
   private  static  LocalDate Date ;
  private String extraTopping ;
  private String alergies;
   Topping pizzatopping;


       public PointOfSale(String size , int topping){
        setToppingCombination(topping);
        this.size = size;
        extraTopping = "none";
        alergies = "none";
        Date = LocalDate.now();
        if(size.toLowerCase().equals("small")){
            this.prize = 200;
        }
        else if(size.toLowerCase(Locale.ROOT).equals("medium")){
            this.prize = 400;
        }
        else if (size.toLowerCase(Locale.ROOT).equals("large")){
            this.prize = 800;
        }
        else{this.prize = 0;}
    }

    public PointOfSale(String size ,int topping, String extraTopping ){
       this.size = size;
       this.extraTopping = extraTopping;
       alergies = "none";
       Date = LocalDate.now();
        setToppingCombination(topping);
        if(size.toLowerCase(Locale.ROOT).equals("small")){
            this.prize = 200+100;
        }
        else if(size.toLowerCase(Locale.ROOT).equals("medium")){
            this.prize = 400+100;
        }
        else if(size.toLowerCase(Locale.ROOT).equals("Large")){
            this.prize = 800+100;
        }
        else{this.prize = 0;}
    }

    public PointOfSale(String size,int topping,String extraTopping , String alergies){
        this.size =size;
        this.alergies =alergies;
        this.extraTopping = extraTopping;
        Date = LocalDate.now();
        setToppingCombination(topping);
        if(size.toLowerCase(Locale.ROOT).equals("small")){
            this.prize = 200;
        }
        else if(size.toLowerCase(Locale.ROOT).equals("medium")){
            this.prize = 400;
        }
        else if(size.toLowerCase(Locale.ROOT).equals("Large")){
            this.prize = 800+100;
        }
        else{this.prize = 0;}
    }

    {
        //LocalDate date = LocalDate.now();
        crust = "Thin Crust";
        extraTopping = "none";
        alergies = "none";
    }
    public void setToppingCombination(int no){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Desired Topping number: ");
        if(no == 1){
            pizzatopping = new Topping(in.nextInt());
        }
        else if(no == 2){
            pizzatopping= new Topping(in.nextInt(),in.nextInt());
        }
        else if(no == 3){
            pizzatopping = new Topping(in.nextInt(),in.nextInt(),in.nextInt());
        }
        else if(no == 4){
            pizzatopping = new Topping(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        }
        else if(no == 5){
            pizzatopping = new Topping(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        }
        else if(no == 6){
            pizzatopping= new Topping(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        }
    }

    public void Shower(){
        System.out.println("Toopings:" +pizzatopping.toppingCombination);
        System.out.println("Size: " + size);
        System.out.println("Crusst:" + crust);
        System.out.println("Order Date: " + Date);
        System.out.println("Extra Toppings:" + extraTopping);
        System.out.println("Alergies:"+ alergies );
        System.out.println("Prize is:"+ prize);
    }
// Getters and setter

    public void setSize(String size) {
        this.size = size;
    }

    public void setExtraTopping(String extraTopping) {
        this.extraTopping = extraTopping;
    }

    public String getExtraTopping() {
        return extraTopping;
    }

    public String getAlergies() {
        return alergies;
    }

    public void setAlergies(String alergies) {
        this.alergies = alergies;
    }

    public Topping getPizzatopping() {
        return pizzatopping;
    }

    public void setPizzatopping(Topping pizzatopping) {
        this.pizzatopping = pizzatopping;
    }
}
