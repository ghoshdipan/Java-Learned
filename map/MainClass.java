package map;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Map<String,Integer> map=new HashMap<>();
		Map<String,Integer> map2=new HashMap<>();
		
		map.put("one",1);
		map.put("two",null);
		//System.out.println(map);
		
		map2.put("ten",10);
		map2.put("eleven",11);
		//System.out.println(map2);
		
		map.putAll(map2);
		map.putIfAbsent("two hundred", 200);
		System.out.println(map.entrySet());
		
		System.out.println(map.get(10));
		//System.out.println();
		
		
	}

}
