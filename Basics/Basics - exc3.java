package home;
import java.util.Scanner;

//Zadanie.3 
//a)Wprowadź dane numeryczne do zmiennych za pomocą klasy scanner. (Pobranie danych od użytkownika) 
//b) zrób analogicznie zadania b ,c ,d ,e ,d ,f jak z punktu 2.
public class Main {


    public static void main(String[] args) {
	// write your code here
    Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = scr.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = scr.nextInt();
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        int resultAdd = a+b;
        System.out.println(resultAdd);
        int resultDiff = a-b;
        System.out.println(resultDiff);
        int resultMulti = a*b;
        System.out.println(resultMulti);
        float resultDiv = (float)a/b;
        System.out.println(resultDiv);
        int resultRest = a%b;
        System.out.println(resultRest);
        if (a > b) {
            System.out.println("Liczba a jest większa: "+a);
        }
        else if (b > a) {
            System.out.println("Liczba b jest większa: "+b);
        }
        else {
            System.out.println("Liczby są równe");
        }
    }
}
