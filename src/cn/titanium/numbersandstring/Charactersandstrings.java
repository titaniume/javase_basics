package cn.titanium.numbersandstring;

/**
 * 字符和字符串
 * @author Administrator
 *2017年10月12日下午6:31:26
 */
public class Charactersandstrings {
	
	
	public static void main(String[] args) {
		//1:数字转字符串
		/*方法1： 使用String类的静态方法valueOf*/ 
		int a = 12;
		String str1=String.valueOf(a);
		
		/*方法2： 先把基本类型装箱为对象，然后调用对象的toString*/
		Integer it = a;
		String str2 = it.toString();
		
		
		//2:字符串转数字
		/*调用Integer的静态方法parseInt*/
		
		String str3 = "666";
		
		int it2 = Integer.parseInt(str3);
		System.out.println(it2);
		
		System.out.println("---------------");
		//练习-字符串转换
		/*把浮点数 3.14 转换为 字符串 "3.14"
		再把字符串 “3.14” 转换为 浮点数 3.14
		如果字符串是 3.1a4，转换为浮点数会得到什么？*/
		float  f = 3.14f;
		String fts = String.valueOf(f);
		float sf = Float.parseFloat(fts);
		
		String str4 = "3.1a4";
		//System.out.println(Float.parseFloat(str4));
		//抛出异常： java.lang.NumberFormatException: For input string: "3.1a4"
	}
}
