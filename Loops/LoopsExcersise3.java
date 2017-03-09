package home;
import java.util.Random;
// Zadanie.3 a)Napisz program który za każdym obrotem pętli generuje nową liczbę losową całkowitą. (10 obrotów pętli)
public class Main {

    public static void main(String[] args) {

    Random generator = new Random();
    for (int i = 0; i<10; i++) {
        System.out.println(generator.nextInt());
    }
    }
}