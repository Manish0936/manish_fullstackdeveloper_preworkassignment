import java.util.*;  
class stars
{  
public static void main(String[] args)  
{  
int stars;
Scanner input= new Scanner(System.in);

System.out.print("This is to draw the pattern of stars. Please enter a number\n");

int number=input.nextInt();

while(number>0)
{
	stars=number;
	while(stars>1)
{
System.out.print("*");
stars=stars-1;
}
number=number-1;
System.out.print("*\n");
}
}}
