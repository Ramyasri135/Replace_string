import java.util.Scanner;

public class Replacestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string: ");
        String a=sc.nextLine();
        System.out.println(a.replace("a","p"));
    }
}