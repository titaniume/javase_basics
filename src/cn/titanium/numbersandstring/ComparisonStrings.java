package cn.titanium.numbersandstring;

/**
 * 比较字符串
 * @author Administrator
 *2017年10月14日上午12:07:19
 */
public class ComparisonStrings {
	public static void main(String[] args) {
		//1:是否是同一个对象
		/*str1和str2的内容一定是一样的！ 
		但是，并不是同一个字符串对象*/
		
		String str1 = "the sky";
		String str2 = new String(str1);
		
		//==用于判断是否是同一个字符串对象s
		System.out.println(str1 == str2);
		
		//2:是否是同一个对象-特例
		String str3 ="titaniume";
		String str4 ="titaniume";
		System.out.println(str3 == str4);
		/*一般来说，编译器没碰到一个字符串字面值，就会创建一个新的对象，所以在21行会创建一新的对象titanium
		但是在22行，编译器发现已经有现成的titaniume对象，就会直接拿过来使用不会在创建了*/
		
		//3:内容是否相同
		/*使用equals进行字符串内容的比较，必须大小写一致 
		equalsIgnoreCase，忽略大小写判断内容是否一致*/
		String str5 ="five hours";
		String str6 = new String(str5);
		String str7 =str5.toUpperCase();
		//==用于判断是否是同一个字符串对象
		System.out.println(str5 == str6);
		System.out.println(str5.equals(str6));
		System.out.println(str5.equals(str7));//大小写不一样，返回false
		System.out.println(str5.equalsIgnoreCase(str7));//忽略大小写的比较，返回true
	
		//4:是否以子字符串开始或者结束
		String str8 ="the sky";
		String start ="the";
		String end="sky";
		System.out.println(str8.startsWith(start)); //以...开始
		System.out.println(str8.endsWith(end));  //以..结束
		
		//练习-比较字符串
		/*创建一个长度是100的字符串数组
		使用长度是2的随机字符填充该字符串数组
		统计这个字符串数组里重复的字符串有多少种*/
	    
	}
}
