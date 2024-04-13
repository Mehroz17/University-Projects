package mypizza.top;
// it is used in point of sale class as composition
/*
States
1. topping combination
2. topping peporoni
3. pinapple
4. tikka
5. mushroom
6. corn
7. Black olives
 */



public class Topping {
//States
  public  String toppingCombination;
  private final  String topping1 = "pepperoni";
  private final  String topping2 = "pineapple";
  private final  String topping3 = "tikka";
  private final  String topping4 = "mushroom";
  private final  String topping5 = "corn";
  private final  String topping6 = "blackolives";
  {
    toppingCombination = "deal";
}

public String toppingName(int a){
    if(a == 1 ){
      return topping1;
    }
    else if(a == 2){
      return topping2;
    }
    else if(a==3){
      return topping3;
    }
    else if(a == 4){
      return topping4;
    }
    else if(a == 5){
      return topping5;
    }
    else if(a==6){
      return  topping6;
    }
    return "none";
}

public Topping(int a){toppingCombination = toppingName(a);}
public Topping(int a , int b){toppingCombination = toppingName(a)+ " + " + toppingName( b);}
public Topping(int a , int b , int c){toppingCombination = toppingName(a)+ " "+ toppingName(b)+ " "+ toppingName(c);}
public Topping(int a , int b , int c , int d)
{toppingCombination = toppingName(a)+ " "+ toppingName(b)+ " "+ toppingName(c)+" "+  toppingName(d);}
public Topping(int a , int b , int c , int d ,int e)
{toppingCombination = toppingName(a)+ " "+ toppingName(b)+ " "+ toppingName(c)+" "+ toppingName(d)+ " " + toppingName(e); }
public Topping(int a , int b , int c , int d ,int e , int f)
{toppingCombination = toppingName(a)+ " "+ toppingName(b)+ " "+ toppingName(c)+" "+toppingName(d)+ " " + toppingName(e)+ " "+ toppingName(f); }

}
