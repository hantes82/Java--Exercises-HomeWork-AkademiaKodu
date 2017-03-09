package home;
import java.util.Scanner;

//Zadanie.6. a) Napisz program w którym użytkownik dodaje liczby do zmiennej i gdy suma liczb będzie wyższa od 30
// program wyświetla napis 'OK" i wyjdzie z programu. pierwsza liczba:0 podaje liczbe:3 Suma :3 podaj liczbę 29
//        suma:31
//        OK
public class Main {

    public static void main(String[] args) {
    int suma = 0;
    Scanner scr = new Scanner(System.in);
    while (suma <=30) {
        System.out.println("Podaj liczbę do sumowania:");
        suma = suma + scr.nextInt();
        System.out.println("Suma: "+suma);
    }
        System.out.println("Suma: "+suma+"\nOK");
    }
}
