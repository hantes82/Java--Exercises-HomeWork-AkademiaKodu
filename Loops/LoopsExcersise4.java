package home;

// Zadanie.4 a)Napisz program który wydrukuje liczb z przedziału 20 do 40 z pominięciem liczb od 30 do 35. (Jedna Pętla for)
public class Main {

    public static void main(String[] args) {
    for (int i = 20; i<=40; i++) {
        if ((i<30) || (i>35)) {
            System.out.println(i);
        }
    }
    }
}
