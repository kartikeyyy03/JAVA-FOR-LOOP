import java.util.Scanner;
class Armstrong
{
	public static void main(String[] arg)
	{
	int i=1,arm;
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	System.out.println("Armstrong numbers between 1 to"+" "+ N +" are:");
	
	while(i<N)
	{
	arm=armstrongOrNot(i);
	if(arm==i)
	System.out.println(i);
	i++;
	}
	}
static int armstrongOrNot(int num)
{
	int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
}