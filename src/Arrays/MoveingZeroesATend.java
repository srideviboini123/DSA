package Arrays;

public class MoveingZeroesATend {
public static void main(String args[]) {
	int a[]= {0,10,2,0,3,12};
	int index=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			a[index]=a[i];
			index++;
		}
	}
	while(index<a.length) {
		a[index]=0;
		index++;
	}
	for(int x:a) {
		System.out.print(x + " ");
	}
}
}
