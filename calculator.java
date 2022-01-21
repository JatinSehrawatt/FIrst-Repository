// error occured during this program: 2(semicolon and braket)
import java.util.*;
class calculatorByJatin
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter 1 for Addition");
	System.out.println("Enter 2 for subtraction");
	System.out.println("Enter 3 for multiplication");
	System.out.println("Enter 4 for division");
	System.out.println("Enter 5 for comparision");
	System.out.println("Enter 6 for Simple Intrest");
	System.out.println("Enter 0 for EXIT");
	//scanning for user input
	byte number=scan.nextByte();
	//for addition
	if(number==1)
	{
	System.out.println("ENter first number");
	int num1=scan.nextInt();
	System.out.println("ENter Second number");
	int num2=scan.nextInt();
	int sum=num1+num2;
	System.out.println("Sum of these number's are "+ sum);
	}
	//for Subtraction
	else if(number==2)
	{
	System.out.println("ENter first number");
	int num1=scan.nextInt();
	System.out.println("ENter Second number");
	int num2=scan.nextInt();
	int subtraction=num1-num2;
	System.out.println(num1+"-"+num2+" is equal's to "+ subtraction);
	}
	//multiplication
	else if(number==3)
	{
	System.out.println("ENter first number");
	int num1=scan.nextInt();
	System.out.println("ENter Second number");
	int num2=scan.nextInt();
	//error one= semi;colon on *54line num2 
	float multiply=num1*num2;
	System.out.println(num1+"*"+num2+" is equal's to "+ multiply);
	}
	//division
	else if(number==4)
	{
	System.out.println("ENter first number");
	int num1=scan.nextInt();
	System.out.println("ENter Second number");
	int num2=scan.nextInt();
	float divide=num1/num2;
	System.out.println(num1+"/"+ num2 +" is equal's to "+ divide);
	}
	//comparision
	else if(number==5)
	{
	System.out.println("enter first Number");
	 int num1=scan.nextInt();
	 System.out.println("enter Second Number");
	 int num2=scan.nextInt();
	 if(num1>num2)
	 {
	 System.out.println(num1+" is greater than "+num2);
	 }
	 else if (num1==num2)
	 {
	 System.out.println(num1+" is equal to "+num2);
	 }
	 else
	 {
	 System.out.println(num1+" is smaller than "+num2);
     }
	 }
	 else if(number==6)
	 {
	 System.out.println("Enter principal amount:");
	int principal=scan.nextInt();
	//taking input of percent 
	System.out.println("Enter percentage of intrest:");
	float per=scan.nextFloat();
	//taking input of time
	System.out.println("Enter time(*in months):");
	int time=scan.nextInt();
	//formula of simple intrest
	double si=principal*per*time/100;
	System.out.println("Your simple intrest is: "+si);
	double pm=si+principal;
	System.out.println("You have to pay total:  "+pm);
	double dp=pm/time;
	if(time>1)
	{
	System.out.println("If you Wanna Pay it monthly, you have to pay:  "+dp+"/month.");
	}
	else
	{
	System.out.println("xD!!!");
	}
	}
	else if(number==0)
	{
	System.out.println("ok. You Can leave Now!!!");
	}
	else
	{
	System.out.println("Try with only Mentioned Key's");
	}
	System.out.println("Have a nice day!!!  :D");
	}
	}