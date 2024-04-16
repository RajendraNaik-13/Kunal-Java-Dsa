package kunal;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class While {
    public static void main(String[] args) {
        int sum=0,x;
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("enter the numer");
            String s=in.next();
            if(s.equalsIgnoreCase("x")){
                break;
            }else{
                x=Integer.parseInt(s);
                sum+=x;
            }
        }
        System.out.println("sum="+sum);
    }
}
