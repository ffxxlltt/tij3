package c10;

//import java.lang.reflect.*;
import java.util.regex.*;

public class TestRegex {
	private static Pattern p = Pattern.compile("\\w+\\.");
	public static void main(String[] args)
	{
		String s = "java.util.regex.axd";
		System.out.println(p.matcher(s.toString()).replaceAll(""));
		
	}

}
