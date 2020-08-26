package strings;
public class ReverseAString {
	
	public static void main(String[] args) {

		String a=" I love    Java, the  coffee  .";
		String result="";
		int i=a.length()-1;
		
		while(i>=0) {
			
			while(i>=0 && i==' ')i--;
			int j=i;
			
			if(i<0) break;
			
			while(i>=0 && i!=' ')i--;
			
			if(result.isEmpty()) {
				result=result.concat(a.substring(i+1,j+1));
			}else {
				result=result.concat(" "+a.substring(i+1,j+1));
			}
		}
		System.out.println(result);
	}
}