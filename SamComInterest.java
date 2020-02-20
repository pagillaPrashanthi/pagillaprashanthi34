package cleancode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SamComInterest {
	static{
		float pValue, rValue, tValue,nValue=12;
		@SuppressWarnings("resource")
		
		Scanner scanner = new Scanner(System.in);
		@SuppressWarnings("resource")
		
		PrintStream printStream=new PrintStream(new FileOutputStream(FileDescriptor.out));
		printStream.print("Enter the Principal : ");
		
       pValue = scanner.nextFloat();
       printStream.print("Enter the Rate of interest : ");
       rValue = scanner.nextFloat();
       printStream.print("Enter the Time period : ");
       tValue = scanner.nextFloat();
       float simpleInterest = (rValue * tValue * pValue) / 100;
       printStream.print("The Simple Interest is : " + simpleInterest+"\n");
       printStream.print("Enter nValue number of times that interest is compounded per unit tValue : ");
       nValue = scanner.nextInt();
       double amount = pValue * Math.pow(1 + (rValue / nValue), nValue * tValue);
       double cInterest = amount - pValue;
       printStream.print("Compound Interest after " + tValue + " years: "+cInterest);
       printStream.print("Amount after " + tValue + " years: "+amount);
	System.exit(0);
	}
}




