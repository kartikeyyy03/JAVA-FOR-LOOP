import java.util.Scanner;

public class question_6 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int factor=0;

    int N=sc.nextInt();

    if(N<1||N>300){System.out.println("Invalid Input");}
    else{

    for(int i=1;i<=N;i++){

        if(N%i==0){
            factor=factor+1;
            
        }

    }

    
    System.out.println(factor);


    }
}

    
}
