import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {

        int factor=0;
        int A;

        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
    
    for(int i=1;i<=A;i++){

        if(A%i==0){factor=factor+1;}
    }

    if(factor==2){System.out.println(A+" is a prime number");}
    else{System.out.println(A+" is not a prime number");}
}


}
