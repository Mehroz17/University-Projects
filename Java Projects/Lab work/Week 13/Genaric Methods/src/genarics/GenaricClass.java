package genarics;
// It is an genaric Class
public class GenaricClass <T>{

    //1. States - data
    //2. methods - behavoiurs

    /*Example, a car mode -- 2016,2017,etc (integer values)
     an other car - but it is a car -- vitz,prius,gli,xli,etc..... (String values)
     but the state is same which is "model"
     */

    // To declare
    // we wite any alpabhet after class name in <>


    T model;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
