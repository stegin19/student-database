package insert;
import java.sql.*;
import java.util.Scanner;

public class insert1 {

	public  void insert() {
		Scanner sc=new Scanner(System.in);
		char choice;
		do{
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		Statement stmt =con.createStatement();
	
		System.out.println("insert");
		
		System.out.println("Enter your Register no");
		int regno=sc.nextInt();
		System.out.println("Enter your name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter your date of birth");
		String date=sc.next();
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		System.out.println("Enter your Nationality");
		sc.nextLine();
		String nation=sc.nextLine();
		System.out.println("Medium of instruction");
		String medium=sc.nextLine();
		System.out.println("SSLC mark");
		int sslc=sc.nextInt();
		System.out.println("HSC mark");
		int hsc=sc.nextInt();
		System.out.println("Enter your Email.id");
		sc.nextLine();
		String email=sc.nextLine();
		System.out.println("Mobile no");
		String mno=sc.nextLine();
		System.out.println("Emergency no");
		String eno=sc.nextLine();
		System.out.println("Enter your address");
		String address=sc.nextLine();
		
		String insert="insert into student(Reg_No,Name,DOB,Age,Nationality,Medium,sslc,hsc,Email_id,Mobile_no,Emergency_no,address) values("+regno+",'"+name+"','"+date+"','"+age+"','"+nation+"','"+medium+"',"+sslc+","+hsc+",'"+email+"','"+mno+"','"+eno+"','"+address+"')";
		stmt.executeUpdate(insert);
		
		}
		
		catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("DATA INSERTED SUCCESFULLY");
		System.out.println("Do you want to continue:(y/n)");
		 choice=sc.next().charAt(0);
		
		}while(choice=='y'||choice=='Y');
		
	}
	
}
