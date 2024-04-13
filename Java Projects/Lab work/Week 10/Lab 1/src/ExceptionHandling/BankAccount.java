package ExceptionHandling;

import java.util.IllegalFormatException;

public class BankAccount {
    int withDraw;
    int trancferAmount;
    private String email;

//    public int getWithDraw() {
//        return withDraw;
//    }
//
//    public void setWithDraw(int withDraw) {
//       if(withDraw <0){
//           throw new IllegalArgumentException("Please Amount Greater than 0");
//       }// illegalArgument is the excpetions
//       else
//           this.withDraw = withDraw;
//    }
//
//    public int getTrancferAmount() {
//        return trancferAmount;
//    }
//
//    public void setTrancferAmount(int trancferAmount) {
//        if(withDraw <0){
//            throw new IllegalArgumentException("Please Amount Greater than 0");
//        }// illegalArgument is the excpetions
//        else
//            this.trancferAmount = trancferAmount;
//    }
//


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String reg = " ^(.+)@(.+)$";
        if(email!=reg){
            throw new IllegalArgumentException("Enter valid email");
        }
        else
            this.email = email;
    }
}
