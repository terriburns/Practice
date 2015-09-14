import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

/*
 * Data Munging
 * http://codekata.com/kata/kata04-data-munging/
 */
public class Kata04 {
	//write a program to output the day number
	// (column one) with the smallest
	// temperature spread (the maximum temperature is the second column, the
	// minimum the third column).

	// STEPS
	// 1. Make sure Scanner, FileNotFound, File, and ArrayList are imported
	// because you need them all
	// 2. Read the file
	public static final String PATH = "weather.dat";

	public static void main(String[] args) {
		// 3. Open the file using a scanner. The scanner
		// "allows the user to read values of various types"
		File Weather = new File(PATH);
		Scanner lineScanner = null;
		try {
			lineScanner = new Scanner(Weather);
		} catch (FileNotFoundException e) {
			System.out.println("Where da file" + Weather.getName() + "at");
			System.exit(1);
		}
		// 4. Add the file to an ArrayList
		ArrayList<String> weatherData = new ArrayList<String>();
		while (lineScanner.hasNext()) {
			weatherData.add(lineScanner.nextLine());
		}
		System.out.println(weatherData);
		System.out.printf("%-16s%-24s%-24s\n", "Day number: ", "Max Temp: ", "Min Temp: ");
		for (int i=1; i <weatherData.size(); i++){
			i++;
			//System.out.printf("%-16s%-24s%-24s\n", weatherData[i], "Max Temp: ", "Min Temp: ");
		}
	}
}
