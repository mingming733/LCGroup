
public class UniqueCharacter {
	public static void main (String []args){
		String str1 = "goodnight";
	
		System.out.print(isUnique (str1));
		
	}
	public static boolean isUnique (String str){
		for (int i = 0; i < str.length (); i ++){
			for (int j = 0; j < str.length (); j ++){
				if (str.charAt(i) == str.charAt(j)){
					return false;
				}
				
			}
		}
		return true;
	}
}
