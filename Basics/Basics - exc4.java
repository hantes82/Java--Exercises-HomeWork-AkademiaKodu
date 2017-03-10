package home;
import java.util.Scanner;

//Zadanie.4
//        a) Napisz program który pobierze od użytkownika 3 liczby (a ,b ,h)
//        b) oblicz pole i obwód kwadratu ( podstawa: a)
//        c) oblicz pole i obwód prostokąta (podstawa : a ,b)
//        d) Oblicz pole i obwód trapezu (podstawa : a ,b , wysokość: h)
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
        System.out.println("Podaj liczbę h: ");
        int h = scr.nextInt();

        System.out.println("Pole kwadratu wynosi: "+a*a);
        System.out.println("Obwód kwadratu wynosi: "+4*a);
        System.out.println("Pole prostokąta wynosi: "+a*b);
        System.out.println("Obwód prostokąta wynosi: "+(2*a+2*b));
        System.out.println("Pole trapezu wynosi: "+((a+b)/2)*h);
        System.out.println("Obwód trapezu wynosi: "+(a+b+2*c));

    }
}
