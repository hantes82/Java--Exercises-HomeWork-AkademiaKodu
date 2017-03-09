package home;
// Zadanie.2. a)Napisz program który wyświetli tylko liczby parzyste od numeru 10 do 50 (razem z 50)
public class LoopsExcersise2 {

    public static void main(String[] args) {

        for (int i = 10; i<=50; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}s