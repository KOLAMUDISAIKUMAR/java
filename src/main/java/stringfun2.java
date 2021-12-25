 public class stringfun2 {

public static void main(String[] args) {
	String str[]= {"kumar", "rammohan", "lakshmi", "karthik", "vishu", "harika", "uma", "ganesh"};
	int count = str.length;
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		if (str[i].charAt(0)=='k') {
			System.out.println(str[i]);
			
		}
	 if (str[i].startsWith("h")) {
			System.out.println(str[i]);
			
		}
	}
}
}