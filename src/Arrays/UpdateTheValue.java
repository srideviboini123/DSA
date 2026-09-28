package Arrays;

public class UpdateTheValue {
	public static void main(String args[]) {
		int a[]= {12,14,16,15};
		int position=2;
		int update=25;
		//insert values up to position
		int b[]=new int[a.length];
		for(int i=0;i<position;i++) {
		      b[i]=a[i];
		}
		//insert at specific position
		b[position]=update;
		for(int i=position;i<a.length;i++) {
			b[i+1]=a[i];
		}
		//Looping the b array
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i] + " ");
		}
	}
}
