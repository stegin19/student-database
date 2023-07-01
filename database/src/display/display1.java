package display;
import java.util.*;
import java.sql.*;


public class display1 {
   public  void display2() {
	   Scanner sc=new Scanner(System.in);
	   char choice;
		do{
	   try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			Statement stmt =con.createStatement();
			System.out.println("1.display full table");
			System.out.println("2.display a specific column");
			int op=sc.nextInt();			
			
			
			
			if(op==1) {
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
 				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getString(10)+"\t"+rs.getString(11)+"\t"+rs.getString(12));
            }
			}
			
			else if(op==2) {
				System.out.println("Enter Rollno");
				int roll=sc.nextInt();
				ResultSet rs=stmt.executeQuery("select * from student where Reg_No = "+roll);
				while(rs.next()) {
	 				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getString(10)+"\t"+rs.getString(11)+"\t"+rs.getString(12));
			}
			
	   }
	   }
			catch(Exception e) {
				System.out.println(e.toString());
			}
	   System.out.println("Do you want to continue:(y/n)");
		 choice=sc.next().charAt(0);
		
		}while(choice=='y'||choice=='Y');
			
  
   
}
}
