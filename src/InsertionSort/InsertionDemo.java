package InsertionSort;

import java.util.Arrays;

public class InsertionDemo {

	public static void  Insertion(int arr[] ) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}
	public static void main(String[] args) {
		int arr []= {2,5,9,3,7,4,11,13};
		Insertion(arr);
		System.out.println(Arrays.toString(arr));

	}
	

}
