package kunal;

import java.util.Scanner;

public class Hcf_Lcm {
    public static void main(String[] args) {
        int hcf=0,lcm=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 no.");
        int x=in.nextInt();
        int y=in.nextInt();
        for (int i = 1; i <=x && i<=y  ; i++) {
            if(x%i==0 && y%i==0){
                hcf=i;
            }
            
        }
        lcm=x*y/hcf;
        System.out.println("lcm="+lcm);
        System.out.println("hcf="+hcf);

    }
}
