package BinarySearch;

public class FindTarget {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		int target=70;
		int left=0;
		int right=a.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(a[mid]==target) {
				System.out.println("found at:" + mid);
				return;
			}else if(a[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		System.out.println("Not Found Element");
	}

}
