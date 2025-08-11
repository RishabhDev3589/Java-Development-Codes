import java.util.*;
public class Loan_SimpleInterest_Calculation {
    public static void main(String[] args){
System.out.println("Welcome,\nTo calculate the interest Please give the main data ");
Scanner sc=new Scanner(System.in);
System.out.print("Please Enter your principal amount=");
double p=sc.nextDouble(); 
System.out.print("Please Enter the rate of interest(in %)=");
double i=sc.nextDouble();
System.out.print("Please Enter your loan tenure (in years)=");
double t=sc.nextDouble();
double sum = (p*i*t)/100;
System.out.print("This your Simple interest of your Loan=");
System.out.println(sum);
System.out.print("Your Total Amount is=");
double R=(p+sum);
System.out.println(R);
System.out.println("Thank you \nJBMNMJ");
    }
}


