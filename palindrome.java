import java.util.*;  
class palindrome
{  
public static void main(String[] args)  
{  
int remender, sum=0,temp;

Scanner input= new Scanner(System.in);

System.out.print("This program is to check the number is Palindrome or not. Please enter a number\n");

int number=input.nextInt();

temp=number;

while(number>0)
{
	remender = number%10;
	sum = (sum*10)+remender;
	number = number/10;
}

if(temp==sum)
{
System.out.print("The number is Palindrome\n");
}
else
{
System.out.print("The number is not Palindrome\n");
}
}}
