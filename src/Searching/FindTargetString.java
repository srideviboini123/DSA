package Searching;

public class FindTargetString {
public static void main(String args[]) {
	String names[]= {"bahu","bali","deva,", "sena"};
	String target="sena";
	boolean found=false;
	for(String str:names) {
		if(str.equals(target)) {
			found=true;
			break;
		}
	}
	System.out.println(found ? "present" : "Not present");
}
}
