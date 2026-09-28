package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IndexSumOrMinus {

	public static void main(String[] args) {
		int arr[]= {1,3,5,4,2};
		int target=2;
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(map.containsKey(num-target)) {
				System.out.println("Pair Found");
				System.out.println("Indexes: " + map.get(num-target)+ " " + i);
				System.out.println("Values: " + (num-target)+ " " + num);
				return;
			}
			if(map.containsKey(num+target)) {
				System.out.println("Indexes: " + map.get(num+target)+ " " + i);
				return;
			}
			map.put(arr[i], i);
		}
		System.out.println("No pair found");
	}
	}


