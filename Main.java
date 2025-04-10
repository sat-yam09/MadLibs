import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String word1;
        String word2;
        String word3;
        String word4;

        System.out.println("<<--Fill int the blanks.-->>");
        System.out.println("A Boy is _____ a bike.");
        word1 = sc.nextLine();
        System.out.println("Myself ______.");
        word2 = sc.nextLine();
        System.out.println("I ____ certified.");
        word3 = sc.nextLine();
        System.out.println("I am a ____.");
        word4 = sc.nextLine();

        System.out.println("A Boy is "+word1+" a bike.");
        System.out.println("Myself "+word2+".");
        System.out.println("I "+word3+" certified.");
        System.out.println("I am a "+word4+".");

        sc.close();
    }
}