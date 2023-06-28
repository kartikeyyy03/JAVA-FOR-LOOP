import java.util.Scanner;

public class question_2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int A=sc.nextInt();
        int B=sc.nextInt();

        int hcf=0;

        for(int i=1;i<=A;i++){

            if(A%i==0&&B%i==0){
                hcf=i;
            }

        }

        System.out.print(hcf);
    }
    


}
