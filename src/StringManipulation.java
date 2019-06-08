
public class StringManipulation {

	public static void main(String[] args) {
		String S = "This is String maipulation";
		String S1 = "This is not String maipulation";
		
		System.out.println(S.length());
		System.out.println(S.charAt(5));
		System.out.println(S.indexOf("i"));
		System.out.println(S.indexOf("i",6));
		System.out.println(S.indexOf("i",S.indexOf("i")+1));
		System.out.println(S.equals(S1));
		System.out.println(S.equalsIgnoreCase(S1));
		System.out.println(S.substring(0,9));
		System.out.println(S.trim());
		System.out.println(S.replace("i","I"));
		System.out.println(S.concat("."));
		
	}
}
