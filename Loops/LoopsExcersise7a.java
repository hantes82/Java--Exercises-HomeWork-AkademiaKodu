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
        //ad a
        String star = "*";
        Scanner scr = new Scanner(System.in);
        System.out.println("Podai wysokość wieżyczki w wierszach");
        int height = scr.nextInt();
        for (int i = 0; i<height; i++) {
            System.out.println(star);
            star+="*";
        }
        
    }
}