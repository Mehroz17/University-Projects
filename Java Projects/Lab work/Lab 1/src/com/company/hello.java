import java.util.Scanner; // This is library is for input
public class hello{
    public static void main(String[] args){
        System.out.println("Hello");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of Book ");
        String book_name = input.nextLine();
        System.out.println("Enter the name of Book Aurthor");
        String book_aurthor = input.nextLine();
        System.out.println("Enter the copies of the Book Present ");
        int cop = input.nextInt();

        //Output
        System.out.println("The book is :"+book_name);
        System.out.println("The book aurhtor is :"+book_aurthor);
        System.out.println("The number of copies of the book presnt  :"+cop);



    }
}
