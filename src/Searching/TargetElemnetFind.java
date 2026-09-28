package Searching;

public class TargetElemnetFind {
public static void main(String args[]) {
	int a[]= {12,9,22,46,71};
	int target=22;
	int index=-1;
	for(int i=0;i<a.length;i++) {
		if(a[i]==target) {
			index=i;
			break;
		}
	}
	System.out.println(index!=-1 ? "Found Index : "  + index : "Not Found");
}
}
