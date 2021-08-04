import java.util.Scanner;

public class PreWorkAssignment {


Scanner sc = new Scanner(System.in);

       public void Palindrome()  {
	   
	  Scanner sc = new Scanner(System.in);  
      System.out.println("Enter the number: ");  
      String reverse = ""; 
      String num = sc.nextLine(); 
      int length = num.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + num.charAt(i);  
      if (num.equals(reverse))  
         System.out.println("The entered num " +num +" is a palindrome.");  
      else  
         System.out.println("The entered num " +num +"  isn't a palindrome.");

      }

       public void Pattern() {
	   Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");
	   int row =sc.nextInt();   
	  
for (int i= row; i>= 1; i--)  
{  
for (int j=row; j>i;j--)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=i;k++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  

      }

        public void PrimeNo() {
		
		int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	
	int num=scan.nextInt();
        
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");

        }

		
          public void FiboSeries() {

           int first = 0, second = 1;
		   
		   Scanner sc = new Scanner(System.in);  
           System.out.println("Enter the number: ");
	       int count =sc.nextInt(); 
	   
	     int i = 1;
        while(i<=count)
        {
            System.out.print(first+" ");
            int sumOfPrevTwo = first + second;
            first = second;
            second = sumOfPrevTwo;
            i++;
        }

          }

      public static void main(String[] args) {

                PreWorkAssignment obj = new PreWorkAssignment();

                int option;

                Scanner sc = new Scanner(System.in);

do {
               System.out.println("Please choose your option");
			   System.out.println("1. Find palindrome of number.");
			   System.out.println("2. Print Pattern for a given no.");
			   System.out.println("3. Check whether the no is a  prime number.");
			   System.out.println("4. Print Fibonacci series.");
			   System.out.println("0. Exit");


option = sc.nextInt();

switch (option) {

case 0: option = 0;
break;

case 1:{obj.Palindrome();}
break;

case 2: {obj.Pattern();}
break;

case 3: {obj.PrimeNo();}
break;

case 4: {obj.FiboSeries();}
break;

default:
System.out.println("Please enter correct option");

}

} 
while (option!= 0);
System.out.println("Exit");

}

 

}

