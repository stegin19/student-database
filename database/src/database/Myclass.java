package database;
import java.util.*;
import insert.insert1;
import display.display1;
import delete.delete1;
import update.update1;



public class Myclass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean flag = true;
		while(flag) {
			System.out.println("1.Insert");
			System.out.println("2.update");
			System.out.println("3.delete");
			System.out.println("4.display");
			System.out.println("Enter your option:(1,2,3,4)");
			int op=sc.nextInt();
			
			
			
			insert1 ins=new insert1();
			display1 dis=new display1();
			delete1 del=new delete1();
			update1 up=new update1();
			
	
			
			
			if(op==1) {
				ins.insert();
			}else if(op==4) {
				dis.display2();
			}else if(op==3) {
				del.delete2();
			}else if(op==2) {
				up.update2();
			}
			else {
				System.out.println("invalid input");
			}
			System.out.println("continue to home page(y/n)");
			char s = sc.next().charAt(0);
			if(s=='n') {
				flag = false;
			}
			}
		sc.close();
		
		}			
	}

