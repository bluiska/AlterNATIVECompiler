package alterNATIVE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class ProgramReader {

	final private ArrayList<String> programFileNames;
	
	private String names = "program1.txt,program2.txt,program3.txt";
	
	public ProgramReader() {
		programFileNames = new ArrayList<String>(Arrays.asList(names.split(",")));
	}
	
	public String readProgramAsString(int index) {
		String contents = null;
		try {
			contents = new String(Files.readAllBytes(Paths.get(programFileNames.get(index))));
		}catch (IOException e) {
			
		}
		return contents;
	}
}
