package seleniumbasicprograms;

public class StringsExample {

	public static void main(String[] args) {

		
		
		
		String s1 = "Java";
		String s2 = "Java";
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
	
		System.out.println(sb1.equals(sb2));
		
		StringBuffer sbuffer1 = new StringBuffer("Java");
		StringBuffer sbuffer2 = new StringBuffer("Java");
		
		System.out.println(sbuffer1);
		System.out.println(sbuffer2);
		
		System.out.println(sbuffer1.equals(sbuffer2));
		
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		
	
		String str = "Selenium";
		str = str.concat("Automation");
		System.out.println(str);
		
		sbuffer1.append("Programming");
		
		System.out.println(sbuffer1);

		
		
	}

}
