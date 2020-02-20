package cleancode;

import java.util.*;
import java.io.FileOutputStream;
import java.io.PrintStream;
import  java.io.FileDescriptor;

public class Interest 
{
	    public static void main (String argu[ ])
	{
	    double pr, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    
	    PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
         myout.print("Enter the amount:");
	    pr=sc.nextDouble();	
	    
	    PrintStream my = new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout.print("Enter the No.of years:");
            t=sc.nextDouble();
            
            PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
             myout.print("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    
	    sim=(pr * t * rate)/100;
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	    
	    PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout.print("Simple Interest="+sim);
	    
	    PrintStream stream = new PrintStream(new FileOutputStream(FileDescriptor.out));
	    myout.print("Compound Interest="+com);
	   }
	}
