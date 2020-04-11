import java.io.IOException;

public class FirstJavaProgram {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		boolean c = (a==b);
		
		System.out.println(c);
		System.out.println("(a == b) : " + (a != b));
		
		boolean a1 = false;
		boolean a2 = true;
		boolean a3 = a1 && a2;
		boolean a4 = a1 || a2;
		
		System.out.println(a3+ " " + a4);
		
		boolean b1  = !(a1 && a2);
		boolean b2  = (a1 && a2) || !(a1);
		
		System.out.println(b2);
		
		int k = 1;
		int l = k++;
		int m = ++k;
		
		System.out.println(l);
		System.out.println(m);
		
		boolean choice = true;
		if(choice == true) {
			System.out.println("OK");
		}
		else {
			System.out.println("Cancel");
		}
		
//		int num = System.in.read();
//		System.out.println("Num : " + num);
		
		java.util.Scanner scan = 
				new java.util.Scanner(System.in);
		System.out.print("name : ");
		String name = scan.nextLine();
		System.out.println(name);
		
		if(name.equals("Lee")) {
			System.out.println("Its Same");
		}
		else {
			System.out.println("Not Same");
		}
		
	}
	
}
