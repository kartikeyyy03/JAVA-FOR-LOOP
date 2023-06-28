import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");

        int A=sc.nextInt();
        int B=sc.nextInt();


        for(int i=1;i<=A*B;i++){
            if(i%A==0&&i%B==0){
                System.out.print(i);
                break;
            }
        }
    

    }
    
}
