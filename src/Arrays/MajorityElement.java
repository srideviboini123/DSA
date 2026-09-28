package Arrays;

public class MajorityElement {
public static void main(String args[]) {
	int a[]= {1,2,1,3,2,2,1,2,2};
	int majority=-1;
	for(int i=0;i<a.length;i++) {
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;	
			}
		}
		if(count>a.length/2) {
			majority=a[i];
			break;
		}
	}
	System.out.println("Majority element " + majority);
		
	}
}

