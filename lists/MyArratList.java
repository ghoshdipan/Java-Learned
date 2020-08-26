package lists;
import java.util.*;

public class MyArratList {

	public static void main(String[] args) {

		ArrayList<String> fruits=new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Lemon");
		System.out.println(fruits);
		
		Pair<String,Integer> marks=new Pair<>("DIPAN",21);
		
		marks.GetDescription();
	}

}
