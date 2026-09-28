package Arrays;

public class DulipcateElements {
public static void main(String args[]) {
	int a[]= {10,20,30,40,40};
	boolean found=false;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
			System.out.println("Duplicate: " + a[i]);
			found=true;
			break;
			}
		}
		if(found) {
		 break;
		}
		}if(!found){
			System.out.println("No duplicate is found" );
		}
	}

}

