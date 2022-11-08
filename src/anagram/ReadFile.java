package anagram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

		private static String firstFile = "test/example1.txt";
		private static String secondFile="test/example2.txt";
		
		public static void main (String[] strs) {
			try {
				//Pass the File name in the method for the results
				readFile(firstFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private static void readFile(String fileName) throws IOException {
			
			   BufferedReader reader = new BufferedReader(new FileReader(secondFile));
			   GroupAnagram groupAnagram = new GroupAnagram();
			   List<String> addAnagram = new ArrayList<>();
			   
			   for (String line = reader.readLine(); line != null; line = reader.readLine()) {
			       
				   addAnagram.add(line);
			    }
			   String[] stringAnagram = new String[addAnagram.size()];
			   
			   for (int i = 0; i < addAnagram.size(); i++) {
				   stringAnagram[i] = addAnagram.get(i);
		        }
			   
			   List<List<String>> anaList = groupAnagram.groupAnagrams(stringAnagram);
			   System.out.println(anaList);
			   reader.close();
			     
			
		}
	     
	  
}