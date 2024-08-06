package day16;

public class Practise {

	public static void main(String[] args) {
		
		 String s="Java Programming";
	        //1 Count the occurance of  g character
	        
	        int totalCount=s.length();
	        int afterRemove=s.replace("g","").length();
	        
	        int count=totalCount-afterRemove;
	        System.out.println("Occurance of g is "+count);
	       
		

	}

}
