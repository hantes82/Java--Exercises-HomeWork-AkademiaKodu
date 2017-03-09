package home;

// Zadanie.5. a)Napisz program który będzie chciał wydrukować liczby z przedziału 10 do 40 lecz na 25 jego praca zostanie przerwana. (Zastosować jedna pętle for)
public class Main {

    public static void main(String[] args) {
    for (int i = 10; i<=40; i++) {
        System.out.println(i);
        if(i == 25) {
            break;
        }
    }
    }
}
