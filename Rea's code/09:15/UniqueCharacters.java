
public class UniqueCharacters {
	public static boolean isUnique (String str){
		if (str.length() == 0 || str == null){
			return false;
		}
		for (int i = 0; i < str.length(); i ++){
			for (int j = i + 1; j < str.length(); j ++){
				if (str.charAt(i)== str.charAt(j)){
					return false;
				}
			}
			
		}
		return true;
	}
	public static void main (String []args){
		String a = "hello";
		System.out.print(isUnique (a));
	}
}
