package kunal;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        int max=x;
        if(x>max){
            max=y;
        } else if (z>max) {
            max=z;

        }
        System.out.println(max);
    }
}
