import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class authors {
	stories stry = new stories();
	review rvw = new review();
	Scanner scn = new Scanner(System.in);
	int x,y1,y2,y3 = 0;

	@SuppressWarnings("resource")
	public int authorlogin() {
		Scanner scn = new Scanner(System.in);

		BufferedReader read;

		try {
			read = new BufferedReader(new FileReader("authorlogin.txt"));
			String line;
			System.out.println("\nENTER USER NAME:");
			String n = scn.nextLine();
			while ((line = read.readLine()) != null) {
				if (line.equals(n)) {
					break;
				}
			}
			if (line == null) {
				System.err.println("User not found!");
				return (1);
			}
			System.out.println("\nENTER PASSWORD:");
			String password = read.readLine();
			String pwd = scn.nextLine();
			if (!password.equals(pwd)) {
				System.err.println("User name and password do not match!");
				return 2;
			}
			System.out.println("\nSuccessfully logged in :>");
			read.close();
			return (3);
		} catch (IOException e) {

		}
		return 0;
	}
	public void authorhomepage() {
		System.out.println("\n1.SELECT STORY YOU WANT TO READ"
				+ "\n2.UPLOAD A STORY");
		int n = scn.nextInt();
		
		switch (n){
		
		case 1:
			stry.storylist();
			x = scn.nextInt();
			
			switch (x) {

			case 1:
				stry.firststory();
				    System.out.println("\n\n0.VIEW NO.OF LIKES");
					System.out.println("\n1.LIKE THE STORY");
					System.out.println("\n2.ADD OR VIEW COMMENTS");
					System.out.println("\n3.GO BACK TO HOMEPAGE");
				y1 = scn.nextInt();
				if(y1==3){
					this.authorhomepage();
				}else{
					rvw.reviewoffirststory(y1);
				}
				
				break;

			case 2:
				stry.secondstory();
				    System.out.println("\n\n0.VIEW NO.OF LIKES");
					System.out.println("\n1.LIKE THE STORY");
					System.out.println("\n2.ADD OR VIEW COMMENTS");
					System.out.println("\n3.GO BACK TO HOMEPAGE");
				y2 = scn.nextInt();
				if(y2==3){
					this.authorhomepage();
				}else{
					rvw.reviewofsecondstory(y2);
				}
				break;

			case 3:
				stry.thirdstory();
					System.out.println("\n\n0.VIEW NO.OF LIKES");
					System.out.println("\n1.LIKE THE STORY");
					System.out.println("\n2.ADD OR VIEW COMMENTS");
					System.out.println("\n3.GO BACK TO HOMEPAGE");
					y3 = scn.nextInt();
					if(y3==3){
						this.authorhomepage();
					}else{
						rvw.reviewofthirdstory(y3);
					}
				
				break;
			}
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

}


