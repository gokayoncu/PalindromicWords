import java.util.Scanner;

public class Main {
    
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("Giridiğiniz kelime bir palindrom kelimedi:"+ str);
            return true;
        }
        else{
            System.out.println("Giridiğiniz kelime bir palindrom kelime değildir:"+ str);
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String kelime;
        System.out.println("Kelime Giriniz : ");
        kelime = oku.next().toUpperCase(); //boşluğa kadar alıp,büyük harflere çeviriyoruz.
        System.out.println(isPalindrome2(kelime));


    }



}
