import java.util.Scanner;

/**
 * Created by Austin on 9/9/2016.
 */
public class Triangle {

    //default constructor
    Triangle(){
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }

    //accept user input and check for negative numbers
    void InputA (){
        Scanner kbF = new Scanner(System.in);
        System.out.println("enter the length of side A: ");
        sideA=kbF.nextDouble();
        while (sideA <= 0) {
            System.out.println("ERROR: must be greater than zero");
            sideA = kbF.nextDouble();
        }
    }

    //accept user input and check for negative numbers
    void InputB (){
        Scanner kbF = new Scanner(System.in);
        System.out.println("enter the length of side B: ");
        sideB=kbF.nextDouble();
        while (sideB <= 0) {
            System.out.println("ERROR: must be greater than zero");
            sideB = kbF.nextDouble();
        }
    }

    //accept user input and check for negative numbers
    void InputC (){
        Scanner kbF = new Scanner(System.in);
        System.out.println("enter the length of side C: ");
        sideC=kbF.nextDouble();
        while (sideC <= 0) {
            System.out.println("ERROR: must be a greater than zero");
            sideC = kbF.nextDouble();
        }
    }

    //check if the triangle is equilateral, return true or false
    boolean isEquilateral(){
        if (sideA == sideB && sideB == sideC) {
            return true;
        }
        return false;
    }

    //check if triangle is Isosceles, return true or false
    boolean isIsosceles(){
        if (sideA == sideB && sideB != sideC && (sideA + sideB) > sideC) {
            return true;
        }
        else if (sideA == sideC && sideB != sideC && (sideA + sideC) > sideB) {
            return true;
        }
        else if (sideA != sideB && sideB == sideC && (sideB + sideC) > sideA) {
            return true;
        }
        return false;
    }

    //check if triangle is Scalene, return true or false
    boolean isScalene(){
        if (sideA != sideB && sideB != sideC) {
            if (sideA > sideB && sideA > sideC && (sideB + sideC) > sideA) {
                return true;
            }
            else if (sideB > sideA && sideB > sideC && (sideA + sideC) > sideB) {
                return true;
            }
            else if (sideC > sideA && sideC > sideB && (sideA + sideB) > sideC) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    //checks type of triangle and prints it
    void findAndPrint(){
        if (isEquilateral()) {
            System.out.println("Your triangle is Equilateral");
        }
        else if (isIsosceles()) {
            System.out.println("Your triangle is Isosceles");
        }
        else if (isScalene()) {
            System.out.println("Your triangle is Scalene");
        }
        else {
            System.out.println("This is not a triangle");
        }
    }

    private double sideA, sideB, sideC; //private variables used in object
}
