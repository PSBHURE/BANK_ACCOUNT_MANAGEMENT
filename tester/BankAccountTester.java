package tester;
import java.time.LocalDate;
import java.util.Scanner;
import code.AcTyp;
import code.BankAccount;
public class BankAccountTester {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("acountNo,name,type,iFSC,DateOfOpening (yyy-mm-dd)::");
		BankAccount B1=new BankAccount(sc.nextInt(),sc.next(),AcTyp.SAVING,sc.next(),LocalDate.parse(sc.next()));
	
		System.out.println("acountNo,name,type,iFSC,DateOfOpening (yyy-mm-dd)::");
		BankAccount B2=new BankAccount(sc.nextInt(),sc.next(),AcTyp.CREDIT,sc.next(),LocalDate.parse(sc.next()));
		
		System.out.println("acountNo,name,type,iFSC,DateOfOpening (yyy-mm-dd)::");
		BankAccount B3=new BankAccount(sc.nextInt(),sc.next(),AcTyp.FD,sc.next(),LocalDate.parse(sc.next()));
	
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B3);
	
	}									   
	}

}
/*USE THIS AS INPUT
100 PRATIK SBI1234 2000-10-10
200 VIRU SBI1234 2010-09-20
300 SURESH SBI1234 2020-08-18
*/
