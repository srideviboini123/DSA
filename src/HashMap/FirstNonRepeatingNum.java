package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingNum {

	public static void main(String[] args) {
     String name="aashiquee";
     Map<Character,Integer> map= new HashMap<>();
     for(char c:name.toCharArray()) {
    	 map.put(c,map.getOrDefault(c,0)+1);
     }
     for(int i=0;i<name.length();i++) {
    	 if(map.get(name.charAt(i))==1){
    		 System.out.println("Index: " + i);
    		 return;
    	 }
     }
     System.out.println("No Element");
	}

}
