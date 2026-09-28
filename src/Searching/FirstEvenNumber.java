package Searching;

public class FirstEvenNumber {

	public static void main(String[] args) {
	int arr[]= {13,5,78,90,25};
	for(int num:arr) {
		if(num%2==0) {
			System.out.println("Found Eeve NUmber:" + num);
			return;
		}
	}
System.out.println("No elemnet is Found");
	}

}
