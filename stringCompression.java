package prePlacementCheckList;

public class stringCompression {

	public static void main(String[] args) {
		char[] str= {'a','a','b','b','b','c','c','d'};
		System.out.println(compress(str));
	}
	
	 public static int compress(char[] chars) {
	        String result = "";
	        char temp = chars[0];
	        int count = 1;
	        for(int i=1;i<chars.length;i++){
	            if(chars[i] == temp){
	                count++;
	            }else{
	                if(count == 1){
	                    result = result + temp;
	                }else{
	                    result = result + temp + count;    
	                    count = 1;
	                }
	            }
	            temp = chars[i];
	        }
	        if(count == 1){
	            result = result + temp;
	        }else{
	            result = result + temp + count;
	        }
	        for(int j=0;j<result.length();j++){
	            char res = result.charAt(j);
	            chars[j] = res;
	        }
	        return result.length();
	        
	    }

}
