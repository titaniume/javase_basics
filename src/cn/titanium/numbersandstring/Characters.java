package cn.titanium.numbersandstring;

import java.util.Scanner;

/**
 * 字符
 * @author Administrator
 *2017年10月13日下午6:14:31
 */
public class Characters {
	public static void main(String[] args) {
		
		//1:保存一个字符的时候使用char
		/*char c1 ='a';
		char c2 = '1';//字符1,而非数字1
	    char c3 = '中';//汉字字符
	    //char c4 = 'ab'; //只能放一个字符
		*/	 
		
	   //2:char对应的封装类
	   /* char 对应封装类即是Character*/
	   int a =  123;
	   Integer  b = a;
	   
	   char  c  = 'b';
	   Character  d = c; //装箱
	   c =d; //拆箱
	   
	   //3:Character常见方法
	   System.out.println(Character.isLetter('a')); 	//判断是否是字母
	   System.out.println(Character.isDigit('a'));  	//判断是否是数字
	   System.out.println(Character.isWhitespace(' ')); //判断是否空白
	   System.out.println(Character.isUpperCase('A'));  //是否是大写
	   System.out.println(Character.isLowerCase('a'));  //是否是小写
	   
	   System.out.println(Character.toUpperCase('a'));	//转换为大写
	   System.out.println(Character.toLowerCase('A'));	//转换为小写
	   
	   //String str 'c';	//不能直接把一个字符转换为字符串
	   String str1 = Character.toString('a'); //转换为字符串
 	   
	   
	   //常见转义
	   System.out.println("使用空格无法达到对齐的效果");
       System.out.println("abc def");
       System.out.println("ab def");
       System.out.println("a def");
       System.out.println("使用\\t制表符可以达到对齐的效果");
       System.out.println("abc\tdef");
       System.out.println("ab\tdef");
       System.out.println("a\tdef");
       
       System.out.println("一个\\t制表符长度是8");
       System.out.println("12345678def");
         
       System.out.println("换行符 \\n");
       System.out.println("abc\ndef");

       System.out.println("单引号 \\'");
       System.out.println("abc\'def");
       System.out.println("双引号 \\\"");
       System.out.println("abc\"def");
       System.out.println("反斜杠本身 \\");
       System.out.println("abc\\def");
       
       
       //练习：Character 
     /*  通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
        	参考的转换方式:
      		转换为字符数组后，筛选出控	制台读取到的字符串中的大写字母和数字，并打印出来
        */
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入字符串:");
       String inputStr = sc.nextLine();
       char []  cs =inputStr.toCharArray();
       for (int i = 0; i < cs.length; i++) {
		char temp=cs[i];
		if(Character.isUpperCase(temp) || Character.isDigit(temp)){
			System.out.print(temp);
		}
       }
	}
}
