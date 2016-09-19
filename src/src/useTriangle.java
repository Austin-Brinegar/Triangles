import java.util.Scanner;

/**
 * Created by Austin on 9/9/2016.
 */
public class useTriangle {

    public static void main(String[] args) {
        String reRun;
        Scanner kb = new Scanner(System.in);
        do{ //instantiate new object, set the lengths, print the type, and ask to run again.
            Triangle tri = new Triangle();
            tri.InputA();
            tri.InputB();
            tri.InputC();
            tri.findAndPrint();
            System.out.println("Enter 'y' to continue or anything else to quit");
            reRun = kb.nextLine(); //allow user to run again or not.
        }while(reRun.equals("y"));
    }


}
