import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String input=scanner.next();
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
        }
            
    }
}
