package kunal;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the no.");
        int x=in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+ "" + "*" +""+i+"="+x*i);

        }
    }
}
