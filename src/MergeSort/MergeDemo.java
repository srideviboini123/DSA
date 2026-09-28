package MergeSort;

import java.util.Arrays;

public class MergeDemo {

	public static void mergeSort(int [] arr, int nOfElem) {
		if(nOfElem<2) {
			return;
		}
		int mid=nOfElem/2;
		int leftArr[]=new int[mid];
		int rightArr[]=new int[nOfElem-mid];
		for(int i=0;i<mid;i++) {
			leftArr[i]=arr[i];
		}
		for(int i=mid;i<nOfElem;i++) {
			rightArr[i-mid]=arr[i];
		}
		mergeSort(leftArr,mid);
		mergeSort(rightArr,nOfElem-mid);
		merge(arr,leftArr,rightArr,mid,nOfElem-mid);
	}
	
	public static void merge(int arr[],int leftArr[],int rightArr[],int left, int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(leftArr[i]<rightArr[j]) {
				arr[k++]=leftArr[i++];
			}else {
				arr[k++]=rightArr[j++];
			}
		}
     while(i<left) {
    	 arr[k++]=leftArr[i++];
     }
     while(j<right) {
    	 arr[k++]=rightArr[j++];
     }
	}
  public static void main(String[] args) {
	  int arr[]= {4,9,2,4,8,1,6,3};
	  mergeSort(arr,8);
	  System.out.println(Arrays.toString(arr));
  }
}
