package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Writers {

	public static void main(String[] args) {
		Collection<String> writers = new ArrayList<String>();
		writers.add("FileReader");
		writers.add("BufferedReader");
		writers.add("FileWriter");
		writers.add("BufferedWriter");
		writers.add("PrintStream");
		writers.add("PrintWriter");

	}

	private void FileReaderTest() {
		File file = new File("file.txt");
		List<String> list = new ArrayList<String>();
		list.add("Line 1");
		list.add("Line 2");
		try {
			file.createNewFile();
			file.setWritable(true);
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			for (String string : list) {
				printWriter.println(string);
			}
			printWriter.flush();
			printWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
