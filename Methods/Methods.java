package home;
import static java.lang.Math.sqrt;
import java.util.Scanner;



//Napisz funkcje która:
//        1. przyjmuje 2 liczby całkowite i podaje ich sumę
//        2. przyjmuje 2 liczby całkowite i podaje ich różnice
//        3. przyjmuje 2 liczby całkowite i podzieli je (pamiętaj o zabezpieczeniu dzielenia przez 0)
//        4. przyjmuje 3 liczby całkowite i poda pierwiastki równania kwadratowego
//        5. przyjmuje odpowiednia ilość liczb(zależy od potrzeb wzoru) i poda pola i obwody figur (kwadrat, prostokąt, trapez, trójkąt prostokątny)


public class Main {

    //ad 1

    public int sum (int a, int b) {

        return a+b;
    }
    //ad 2
    public int diff (int a, int b) {

        return a-b;
    }
    //ad 3
    public float div (int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException ("Cannot divide by 0");
        }
        return (float)a/b;
    }
    //ad 4
    public void element (int a, int b, int c) {
        double x1, x2;
        int delta = b*b-4*a*c;
        if (delta == 0) {
            x1=x2=-b/2*a;
            System.out.println("X1=X2= "+x1);
        }
        else if (delta > 0) {
            x1 = (-b-sqrt(b*b-4*a*c))/2*a;
            x2 = (-b+sqrt(b*b-4*a*c))/2*a;
            System.out.println("X1= "+x1+", X2= "+x2);
        }
        else {
            System.out.println("Funkcja nie ma pierwiastków");
        }

    }
    //ad 5
    public float surface (int a) {
        return a*a;
    }
    public float surface (int a, int b) {
        System.out.println("Wybierz figurę:\n1 - prostokąt\n2 - trójkąt prostokątny");
        Scanner scr = new Scanner(System.in);
        int choice = scr.nextInt();
        if (choice == 1) {
            return a * b;
        } else if (choice == 2) {
            return a * b / 2;
        } else {
            System.out.println("Błędny numer");

        }
        return 0;
    }
    public float surface (int a, int b, int h) {
        return ((a+b)/2)*h;
    }


    public static void main(String[] args) {
	// write your code here

        Main object = new Main();

        System.out.println(object.sum(5,5));
        System.out.println(object.diff(5,3));
        System.out.println(object.div(15,5));
        object.element(5,5,10);
        System.out.println(object.surface(5));
        System.out.println(object.surface(5,4));
        System.out.println(object.surface(5,4,7));


    }
}
