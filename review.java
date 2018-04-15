import java.util.Scanner;


public class review {
	
	Scanner scn = new Scanner(System.in);
	stories stry = new stories();
	int i,n = 0;

	public void reviewoffirststory(int a){
		switch (a){
		case 0:
		System.out.println(i);
			break;
			
		case 1:
		this.addlike();
		System.out.println("story liked");
			break;
			
		case 2:
			System.out.println("\n ENTER YOUR COMMENT");
			String s = scn.nextLine();
			stry.firststory();
			System.out.println("\n comments:");
			System.out.println("\n"+s);
		
	/*	System.out.println("1.exit");
		n = scn.nextInt();
		if(n==1)
			System.out.println("SYSTEM TERMINATED");
		System.exit(0);
		
			break;
		}
		*/
			break;
		}
	}
	public void reviewofsecondstory(int a){
		switch (a){
		case 0:
		System.out.println(i);
			break;
		
		case 1:
		this.addlike();
		System.out.println("story liked");
			break;
			
		case 2:
		System.out.println("NOT YET AVAILABLE");
		System.out.println("1.exit");
		n = scn.nextInt();
		if(n==1)
		System.exit(0);
			break;
		}
		
		
	} 
	public void reviewofthirdstory(int a){
		switch (a){
		case 0:
		System.out.println(i);
			break;
		
		case 1:
		this.addlike();
		System.out.println("story liked");
			break;
			
		case 2:
		System.out.println("NOT YET AVAILABLE");
		System.out.println("1.exit");
		n = scn.nextInt();
		if(n==1)
		System.exit(0);
			break;
		}
		
		
		
	} 
	public void addlike(){
		i++;	
	}
}
