package Býolum12Soru12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru15 {

	public static void main(String[] args) throws IOException {

		File file = new File("Exercise12_15.txt");
		
		if (file.exists() == false) {
			file.createNewFile();
		}
		
		try (
			PrintWriter output = new PrintWriter(file);	
		) {
			for (int i = 1; i <= 100; i++) {
				output.printf("%5d", (int) (Math.random() * 1000));
				if (i % 10 == 0 && i != 100) {
					output.println();
				}
			}
		}
		
		File file2 = new File("Sirali12_15.txt");
		if (file2.exists()) {
			file2.createNewFile();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			list.add(input.nextInt());
		}
		input.close();
		
		Collections.sort(list);
		
		try (
				PrintWriter output = new PrintWriter(file2);	
			) {
				for (int i = 1; i <= 100; i++) {
					output.printf("%5d", list.get(i - 1));
					if (i % 10 == 0 && i != 100) {
						output.println();
					}
				}
			}
	}

}
