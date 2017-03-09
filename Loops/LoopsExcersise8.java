package home;
import java.util.Scanner;

//Zadanie.8. Stwórz 2 pętlę (jedna w drugiej)
//        w którym pierwsza odlicza od 10 do 30 a druga o 1 do 10. Gdy pierwsza będzie miała 15 a druga 3 przerwie działanie pierwszej pętli jedną instrukcją.
// (Wykorzystując etykietę)
public class Main {

    public static void main(String[] args) {
       outerLoop:
        for (int i = 10; i<=30; i++) {
           for (int j = 1; j<=10; j++) {
               System.out.println("Stan petli: "+i+" "+j);
               if ((i == 15)&&(j == 3)) {
            
                   break outerLoop;
               }
           }
       }
    }
}