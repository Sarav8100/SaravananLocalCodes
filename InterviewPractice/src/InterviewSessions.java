import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class InterviewSessions {

	public static void main(String[] args) throws IOException {

		//1. string s1 = SeleniumValues and Find the number of ?e? is in Selenium without using In build functions or for loops
		String s1 = "Selenium";
		String[] arr = s1. split(("e"));
		for(String w : arr) {
			System.out.print(w);
			
			
		}
		//2. There are two list and List a & List b and Need unique element in compare with these two list
		//All the duplicates should remove, Want to retain the values and remove the duplicate values

		ArrayList listOne = new ArrayList(Arrays.asList("a", "b","c","d","f"));
		ArrayList listTwo = new ArrayList(Arrays.asList("a", "b","c","d","e"));
			
		Collections.sort(listOne);
		Collections.sort(listTwo);
		System.out.println("--------------");
		boolean isEqual = listOne.equals((listTwo));
		System.out.println(isEqual);
		
		//Compare two arraylist - find commom elements
		ArrayList listOneValue = new ArrayList(Arrays.asList("a", "b","c","d","f"));
		ArrayList listtwoValue = new ArrayList(Arrays.asList("a", "b","c","d","e"));
		
		listOneValue.retainAll(listtwoValue);
		listtwoValue.removeAll(listOneValue);
		
		System.out.println(listOneValue);
		System.out.println(listtwoValue);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String input = br.readLine();
		//char[] try1 = input.toCharArray();
		//for(int i=try1.length;)
		
		String input="AliveisAwesome";
		  StringBuilder input1 = new StringBuilder();
		  input1.append(input);
		  input1=input1.reverse(); 		  
		  for (int i=0;i<input1.length();i++)
		  System.out.print(input1.charAt(i)); 
		}

	}


