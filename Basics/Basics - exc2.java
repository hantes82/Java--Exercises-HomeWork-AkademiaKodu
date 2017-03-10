package home;
import java.util.Scanner;

//Zadanie.2
//        a)zainicjalizuj (Dodaj do kodu) do programu 2 zmienne numeryczne całkowite.
//        b)dodaj do siebie podane liczby
//        c)odejmij od siebie podane liczby
//        d)pomnóż przez podane liczby
//        e) podziel przez siebie podane liczby ( zabezpiecz program przed dzieleniem przez 0)
//        f) podaj resztę z dzielenia podanych liczb
//        g) instrukcja warunkową sprawdź która liczba jest większa i wypisz ją na ekran.
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
