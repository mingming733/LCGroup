
public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
        int n=s.length();
          int result=0;
          for(int i=0;i<n;i++)
          {
             int num=s.charAt(i)-'A'+1;             
             result=result*26+num;        
        }
        return result;

    
    }
}
