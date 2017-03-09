package home;
import java.util.Scanner;

// Napisz program który wygeneruje za pomocą (wielkość wieżyczki podaje użytkownik)
// a ) wieżyczkę
// b ) Choinke //
// ad)a
// *
// **
// ***
// ****
// ad)b
//    *
//   ***
//  *****
// *******
public class Main {

    public static void main(String[] args) {
        //ad b
        String star="";

        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj wysokość wieżyczki w wierszach");
        int height = scr.nextInt();
        int numStar = height*2-1;
        String tab[] = new String[numStar];
        String space = " ";
        for (int i = 0; i<numStar;i++) {
            star+="*";
        }
        tab[0] = star;
        for (int i = 1; i<height; i++) {

          star = star.substring(2);

          tab[i] = star;

        }
        for (int i = 1; i<height; i++) {

            tab[i] = space+tab[i];
            space+=" ";
        }
        for (int i = height-1; i>=0; i--) {

            System.out.println(tab[i]);

        }
    }
}