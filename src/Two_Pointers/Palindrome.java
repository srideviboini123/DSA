package Two_Pointers;

public class Palindrome {
		public static void isPalind(String s) {
			int left=0;
			int right=s.length()-1;
			while(left<right) {
				if(s.charAt(left)!=s.charAt(right)) {
					System.out.println("not a palindrom");
					return;
				}
				left++;
				right--;
			}
			System.out.println("is palindrome");
	}
	
		public static void main(String args[]) {
			String s="level";
			isPalind(s);
		}

}
