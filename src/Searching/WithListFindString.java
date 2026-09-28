package Searching;

import java.util.Arrays;
import java.util.List;

public class WithListFindString {
public static void main(String args[]) {
	List<String> li=Arrays.asList("pen","book","pencil","paper");
	String target="book";
	for(int i=0;i<li.size();i++) {
		if(li.get(i).equals(target)) {
			System.out.println("Found String: " + i);
			return;
		}
	}
	System.out.print("Not Found String");
}
}
