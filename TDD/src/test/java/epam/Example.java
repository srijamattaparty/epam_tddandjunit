package epam;

public class Example {

	 public String met(String s)
	 {
		 String result;
			StringBuilder sb =new StringBuilder(s);
			if(s.charAt(0)=='A' && s.charAt(1)=='A')
			{
				sb.deleteCharAt(0);
				sb.deleteCharAt(0);
			}
			else {
			if(s.charAt(0)=='A')
				sb.deleteCharAt(0);
			if(s.charAt(1)=='A')
				sb.deleteCharAt(1);
			}
			result=sb.toString();
			return result;
		 
	 }
	public static void main(String[] args) {
		

	}

}
