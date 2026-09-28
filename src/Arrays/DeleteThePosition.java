package Arrays;

public class DeleteThePosition {
public static void main(String args[]) {
			
int arr[]= {12,89,56,48,39};
int position=3;

int newArr[]=new int[arr.length-1];
for(int i=0;i<position;i++) {
	newArr[i]=arr[i];	
}

for(int i=position;i<newArr.length;i++) {
	newArr[i]=arr[i+1];
}

System.out.println("after deleting specific position elememt");
for(int x:newArr) {
	System.out.println(x);
}
}
}