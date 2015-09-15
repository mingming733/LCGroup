public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        boolean[] unique = new boolean[256];
        for (int i = 0; i < str.length(); i++){
            if (unique[str.charAt(i)] == true){
                return false;
            }else{
                unique[str.charAt(i)] = true;
            }
        }
        return true;
    }
}
