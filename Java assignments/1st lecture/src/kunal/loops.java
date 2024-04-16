package kunal;

public class loops {
    public static void main(String[] args) {
        int count=0,i;
        //Scanner in =new Scanner(System.in);
        while(count!=5){
            System.out.println("hello world");
            count ++;
        }
        for(i=0;i<5;i++){
            System.out.println(i);
        }
        do{
            System.out.println(count);
            count++;
        }while(count<5);

    }
}
