import java.util.*;  

class Fibonacci
{

  public static void main (String[] Args)
  { 
  
  int i, a=0, b=1, temp=0;
  
  Scanner input= new Scanner(System.in);
    
System.out.println("This is the print the Fibonacci series");

System.out.println("Please enter the size of Fibonacci series");

int number=input.nextInt();

System.out.print("0, 1");


for(i=3;i<=number;i++)
{
temp=a+b;
a=b;
b=temp;
System.out.print(", " + temp);
}


  }
}