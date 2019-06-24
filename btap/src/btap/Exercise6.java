package btap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Exercise6 {
	public static String replace(String a) {
		String str2 = "\\b(\\w+)(\\s+\\1\\b)+";
		Pattern p = Pattern.compile(str2,Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(a);
		while(m.find()) {
			a = a.replaceAll(m.group(), "REPEAT");
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oS = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = oS.nextLine();
//		String str2 = "\\b(\\w+)(\\s+\\1\\b)+";
		
//		Pattern p = Pattern.compile(str2,Pattern.CASE_INSENSITIVE);
//		Matcher m = p.matcher(str);
//		while(m.find()) {
//			str = str.replaceAll(m.group(), "REPEAT");
//		}
		System.out.println("Output string : ");
		System.out.println(replace(str));
		System.out.println("Testing " + (test()==true?"Passed":"Not passed"));
	}
	public static boolean test() {
		if (!replace("I want to to go to the the the zoo").equals("I want REPEAT go to REPEAT zoo"))
			return false;
		if (!replace("I want to go go go to the zoo zoo zoo").equals("I want to REPEAT to the REPEAT"))
			return false;
		if (!replace("I want want to go to the zoo").equals("I REPEAT to go to the zoo"))
			return false;
		return true;
	}

}


