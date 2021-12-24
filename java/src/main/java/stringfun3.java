 public class stringfun3 {
	public static void main(String[] args) {
	String str = "saikuma mohan vishu";
	str=str.replace("|", ",");
	System.out.println(str);
	
	String str1 = "my name is saikumar kolamudi";
	String str2 = str1.replaceAll("\\s", "");
	System.out.println(str2);
	
	String s4="harika";
	String s5=s4.replaceFirst("h", "k");
	System.out.println(s5);
	}

}
