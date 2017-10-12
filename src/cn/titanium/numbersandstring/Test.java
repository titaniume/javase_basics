package cn.titanium.numbersandstring;

import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		String a ="aaa1a";
		String temp = a.substring(a.length()-1);
		if(isInteger(temp)){
			System.out.println("我是数字");
		}
		System.out.println("我不是数字");
	}
	
	 public static boolean isInteger(String str) {  
	        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	        return pattern.matcher(str).matches();  
	  }
}
