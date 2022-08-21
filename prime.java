import java.util.*;  
class prime
{  
public static void main(String[] args)  
{  
int temp=2, d=0;

Scanner input= new Scanner(System.in);

System.out.print("This program is to check the number is Prime or not. Please enter a number\n");

int number=input.nextInt();

if(number>13)
{
while(temp<20)
{
	if(number%temp==0)
	{
	d=1;
	temp=temp+1;
	}
	
	else
	{
		System.out.print("Checking");
	}
}}

else if(number==2||number==3||number==5||number==7||number==11||number==13)
{
System.out.print("This is a prime number\n");
}

else
{
	System.out.print("This is not a prime number\n");
}


if(d==1)
{
System.out.print("This is not a prime number\n");
}
else
{
System.out.print("This is a prime number\n");
}
}}