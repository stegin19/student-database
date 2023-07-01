package delete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public  class delete1 {
	Scanner sc=new Scanner(System.in);
     public  void delete2() {
    	 char choice;
    	do { 
    	 try {
 			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
 			Statement stmt =con.createStatement();
    	 
    	 System.out.println("1.delete full details");
    	 System.out.println("2.delete specific details");
    	 int op=sc.nextInt();
    	 
    	 if(op==1) {
    		 System.out.println("enter the roll no");
    		 int roll=sc.nextInt();
    		 String delete3="delete from student where Reg_No= "+roll;
    		 stmt.executeUpdate(delete3);
    	 }
    	 else if(op==2) {
    		 System.out.println("enter the roll no");
    		 int roll=sc.nextInt();
    		 System.out.println("enter the heading");
    		 sc.nextLine();
    		 String name=sc.nextLine();
    		 String delete4="update student set "+name+" = NULL WHERE Reg_No= "+roll;
    		 stmt.executeUpdate(delete4);
    	 }
    		 
    	 
    	 }catch(Exception e) {
				System.out.println(e.toString());
			}
    	 System.out.println("DATA DELETED SUCCESFULLY");
    	 System.out.println("Do you want to continue:(y/n)");
		 choice=sc.next().charAt(0);
    	}while(choice=='y'||choice=='Y');
			
    	 
     }
}
