package home;
import java.util.Scanner;

import static java.lang.Math.sqrt;

//Zadanie.5
//        a)Napisz program który policzy pierwiastki równania kwadratowego.
public class Main {


    public static void main(String[] args) {
	// write your code here
    Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = scr.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scr.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = scr.nextInt();

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
}
