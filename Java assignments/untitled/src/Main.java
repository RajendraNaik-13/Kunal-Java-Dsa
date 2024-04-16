import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        boolean w = false;
        if(num%4==0){
            if(num%100==0){
                if(num%400==0){
                    w=true;
                }
            }
        }

        if(w){
            System.out.println("leap year");
        }
    }
}

