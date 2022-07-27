package practiceproject;
import java.util.*;
public class TypeCasting {
	public static void main(String args[])
	{
		Scanner Sc= new Scanner(System.in);
		int n1;
		System.out.print("Enter the value of n1: ");
		n1=Sc.nextInt();
		double d,d1;
		d=n1;
		System.out.println("Implicit Typecasting");
		System.out.println("After Typecasting :"+ d);
		d1=n1+5.6;
		System.out.println("After Typecasting :"+d1);
		System.out.println("Explicit Typecasting");
		double d2;
		System.out.print("Enter the value of d2 :");
		d2=Sc.nextDouble();
		int i1=(int)d2;
		System.out.print("After Typecasting :"+ i1);
		int V;
		System.out.print("Enter the value of v: ");
		V=Sc.nextInt();
		char c=(char)V;
		System.out.println("After Typecasting:"+c);
		
		
	}

}
