import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("1.Perimeter of Rectangle=");
        System.out.print("Please Enter your rectangle Length=");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.print("Please Enter your rectangle Width =");
        int b =sc.nextInt();
        int sum =2*(a+b);
        System.out.print("The Perimeter of Rectangle is =");
        System.out.println (sum);  
       System.out.println("");
       
       System.out.println("2.Perimeter of Triangle=");
        System.out.print("Please Enter your triangle Length of AB(a)=");
        Scanner ac=new Scanner(System.in);
        int c=ac.nextInt();
        System.out.print("Please Enter your triangle Length of BC(b)=");
        int d =ac.nextInt();
        System.out.print("Please Enter your triangle Length of AC(c)=");
        int e=ac.nextInt();
        if(d+e>c){
            int solution=c+d+e;
        System.out.print("The Perimeter of Triangle is =");
        System.out.println(solution);
        }else{
            System.out.println("Invalid input value");
            System.out.println("Make sure the value of b+c>a");
        }
        System.out.println("");
    
        System.out.println("3.Perimeter of Square=");
        System.out.print("Please Enter your side Length=");
        Scanner bc=new Scanner(System.in);
        int q=bc.nextInt();
        int Source=4*q;
        System.out.print("The Perimeter of Square is =");
        System.out.println(Source);
        System.out.println("");
        
        System.out.println("4.Perimeter of Circle=");
        Scanner cc=new Scanner(System.in);
        System.out.print("Please Enter your Radius of the Circle =");
        double Rad=cc.nextDouble();
        double x=3.1415;
        double soln=2*x*Rad;
        System.out.print("The Perimeter of Circle=");
        System.out.println(soln);
        System.out.println("");
        System.out.println("JBMNMJ");
}
}
