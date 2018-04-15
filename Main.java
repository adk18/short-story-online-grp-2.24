import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[]) {

		authors auth = new authors();
		reader rd = new reader();
		review rv = new review();
		stories stry = new stories();
		users usr = new users();

		int a = 0, r = 0;
		String line = null;

		Scanner scn = new Scanner(System.in);
		System.out
				.println("\n ***************************   WELCOME TO SHORT STORY ONLINE   ***************************"
						+ "\n 1.LOGIN" + "\n 2.READ STORY AS A GUEST");
		int n = scn.nextInt();

		switch (n) {

		case 1:// login
			System.out.println("\n 1.LOGIN AS AN AUTHOR"
					+ "\n 2.LOGIN AS A READER");
			n = scn.nextInt();
			switch (n) {

			case 1:// login as an author
				do {
					a = auth.authorlogin();
				} while (a != 3);
				break;

			case 2:// login as a reader
				do {
					r = rd.readerlogin();
				} while (r != 3);
				break;
			}
			if (a==3){
				auth.authorhomepage();
			}
			if (r==3){
				rd.readerhomepage();
			}
			
			break;

			
		case 2:// read as a guest
			System.out.println("\n SELECT THE STORY YOU WANT TO READ");
			stry.storylist();
			n = scn.nextInt();

			switch (n) {

			case 1:
				stry.firststory();
				break;

			case 2:
				stry.secondstory();
				break;

			case 3:
				stry.thirdstory();
				break;
			}

			break;
		}

	}
}
