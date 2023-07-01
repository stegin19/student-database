package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class update1 {
	Scanner sc=new Scanner(System.in);
 public void update2() {
	 char choice;
 	do {
	 try {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		 Statement stmt =con.createStatement();
		System.out.println("Enter the rollno");	
		int roll=sc.nextInt();
		System.out.println("Enter column heading");
		sc.nextLine();
		String str=sc.nextLine();
		str.toLowerCase();
		System.out.println("Enter the update");
		String str1=sc.nextLine();
		
		if(str=="reg_no"||str=="age"||str=="sslc"||str=="hsc"||str=="emergency_no"||str=="mobile_no") {
		String update3="update student set "+str+ " = "+ str1 +" where Reg_No= "+ roll;
		stmt.executeUpdate(update3);	
		}else {
			String update3="update student set "+str+ " = '"+ str1 +"' where Reg_No= "+ roll;	
			stmt.executeUpdate(update3);	
		}
		
			
			
	 }catch(Exception e) {
			System.out.println(e.toString());
		}
	 System.out.println("DATA UPDATED SUCCESFULLY");
	 System.out.println("Do you want to continue:(y/n)");
	 choice=sc.next().charAt(0);
	
	}while(choice=='y'||choice=='Y');
 }
}
