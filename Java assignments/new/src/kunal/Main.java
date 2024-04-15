package kunal;

public class Main {
    public static void main(String[] args) {
        int salary =10000;
        if (salary>5000){
            salary=salary+1000;
        }else if(salary<9000){
            salary=salary+2000;
        }
        System.out.println(salary);
    }
}
