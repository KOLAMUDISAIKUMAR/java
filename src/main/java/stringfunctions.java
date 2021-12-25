 
public class stringfunctions {
public static void main(String[] args) {
	String str = "selenium";
	int count = str.length();
	System.out.println(count);
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	//print only required valaue for string using
	String s1 = "java program";
	String value = s1.substring(5, 12);
	System.out.println(value);
	System.out.println(s1.startsWith("j"));
	// adding the two eavla values bby concat or +symbol
	String str1 = "java ";
	String str2 = "program";
	System.out.println(str1.concat(str2));
	//comparing two values
	String str3 = "java";
	String str4 = "java";
	System.out.println(str3.equals(str4));
	if (str3.equals(str4)) {
		System.out.println("yes value are equal");	
	}else
    System.out.println("yes value is not equal");
	// ignore case sensective in equal valvue
	System.out.println(str3.equalsIgnoreCase(str4));
	
	//the contains is matches to spscial valaves 
	String s2 = "Andhra Pradesh";
	if (s2.contains("Pradesh")) {
		System.out.println(" yes value is mathch");		
	}else
		System.out.println("yes value is not match");
	//charA functions selected particular character
	String s3 = "Saikumarkolamudi";
	System.out.println(s3.charAt(3));
	// replace functions
	String s4 = "indiaismost";
	String s5 = "indiaisbeautiful";
    if (s4.replace(s4, s5) != null) {
    	System.out.println("value is replace");
    	System.out.println("value is not replace");
    }else
    		s4.replaceAll(s4, s5);
    System.out.println("value is all replace");
    System.out.println("value is all not replace");
	
}
}

