package FileHandling.Object;


    import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class M {
        private static final String filepath="Student";

        public static void main(String args[]) {





        }

        public Object ReadObjectFromFile(String filepath) {

            try {

                FileInputStream fileIn = new FileInputStream(filepath);
                ObjectInputStream objectIn = new ObjectInputStream(fileIn);

                Object obj = objectIn.readObject();

                System.out.println("The Object has been read from the file");
                objectIn.close();
                return obj;

            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        }

    }
