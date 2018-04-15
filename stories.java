import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class stories {

	String line = null;

	public void storylist() {

		File folder = new File("/home/dhaval/workspace/sen final/storydocument");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				System.out.println(i + 1 + " " + listOfFiles[i].getName());
			}
		}
		return;
	}

	public void firststory() {
		BufferedReader read;
		try {
			read = new BufferedReader(new FileReader(
					"/home/dhaval/workspace/sen final/storydocument/Fear.txt"));
			int char_in_line = 0;
			while ((line = read.readLine()) != null) {
				String[] words_of_line = line.split(" ");
				int i = 1;
				while (i <= words_of_line.length) {
					System.out.print(words_of_line[i - 1] + " ");
					char_in_line += words_of_line[i - 1].length();
					if (char_in_line > 90) {
						char_in_line = 0;
						System.out.println();
					}
					i++;
				}

			}

		} catch (IOException e) {

		}

	}

	public void secondstory() {
		BufferedReader read1;
		try {
			read1 = new BufferedReader(
					new FileReader(
							"/home/dhaval/workspace/sen final/storydocument/Odd Behavior.txt"));
			int char_in_line = 0;
			while ((line = read1.readLine()) != null) {
				String[] words_of_line = line.split(" ");
				int i = 1;
				while (i <= words_of_line.length) {
					System.out.print(words_of_line[i - 1] + " ");
					char_in_line += words_of_line[i - 1].length();
					if (char_in_line > 90) {
						char_in_line = 0;
						System.out.println();
					}
					i++;
				}
			}
		} catch (IOException e) {

		}
	}

	public void thirdstory() {
		BufferedReader read2;
		try {
			read2 = new BufferedReader(
					new FileReader(
							"/home/dhaval/workspace/sen final/storydocument/The Outing.txt"));

			int char_in_line = 0;
			while ((line = read2.readLine()) != null) {
				String[] words_of_line = line.split(" ");
				int i = 1;
				while (i <= words_of_line.length) {
					System.out.print(words_of_line[i - 1] + " ");
					char_in_line += words_of_line[i - 1].length();
					if (char_in_line > 90) {
						char_in_line = 0;
						System.out.println();
					}
					i++;
				}
			}

		} catch (IOException e) {

		}

	}
}