
public class removespecialchar {

	public static void main(String[] args) {
		 
		String s = "@@@my&&name(((is%%slimshady~";
		s= s.replaceAll("[^a-zA-z0-9]","");
		System.out.println(s);

	}

}
