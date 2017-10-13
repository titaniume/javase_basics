package cn.titanium.numbersandstring;

/**
 * 操作字符串
 * @author Administrator
 *2017年10月13日下午11:13:38
 */
public class OperatingString {
	
	public static void main(String[] args) {
		
		//1：获取字符串---->operating
		String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
		char c = sentence.charAt(0);
		System.out.println(c);
	
		//2:获取对应的字符数组
		/*toCharArray()
		获取对应的字符数组*/
		char[] cs = sentence.toCharArray();   //获取对应的字符数组
		System.out.println(sentence.length() == cs.length);
		
		//3:截取子字符串
		/*subString 
		截取子字符串*/
		//截取从第3个开始的字符串 （基0）
		String substring = sentence.substring(3);
		System.out.println(substring);
		
		//4:分隔
		/*split 
		根据分隔符进行分隔*/
		String[] split = sentence.split(",");  //根据,进行分割，得到3个子字符串
		for (String string : split) {
			System.out.println(string);
		}
		
		//5:去掉首尾空格
		/*trim 
		去掉首尾空格*/
		String str = "          我很烦，怎么办 ！                       ";
		System.out.println(str);
		System.out.println(str.trim());
		
		//6:大小写
		/*toLowerCase 全部变成小写 
		toUpperCase 全部变成大写*/
		String str2 = "AbCdEfGhIjKlMnOpQ";
		//全部变小写
		System.out.println(str2.toLowerCase());
		//全部大写
		System.out.println(str2.toUpperCase());
		
		//7:定位
		/*indexOf 判断字符或者子字符串出现的位置
		contains 是否包含子字符串*/
		 String str3 = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
		 System.out.println(str3.indexOf('8')); //字符第一次出现的位置
		 System.out.println(str3.indexOf("超神"));//字符第一次出现的位置
		 System.out.println(str3.lastIndexOf("了")); //字符串最后出现的位置
		 System.out.println(str3.indexOf(',', 5)); //从位置5开始第一次出现,的位置
		 System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"
	
		 //8:替换
		 /*replaceAll 替换所有的 
		 replaceFirst 只替换第一个*/
		 String str4 ="上海今天下午下雪了,我很开心！";
		 
		 String temp=str4.replaceAll("下雪", "下雨");	 //替换所有
		 temp = temp.replaceAll("开心", "烦");
		 System.out.println(temp);
		 temp = str4.replaceFirst(",", " "); //只替换第一个
		 System.out.println(temp);
		 
		 //练习：每个单词的首字母都转换为大写 
		/* 给出一句英文句子： "let there be light"
		 得到一个新的字符串，每个单词的首字母都转换为大写*/
		 String str5 ="let there be light";
		 System.out.println(str5.toUpperCase());
		 
		 //练习-英文绕口令
		/* 英文绕口令
		 peter piper picked a peck of pickled peppers
		 统计这段绕口令有多少个以p开头的单词*/
		 String s = "peter piper picked a peck of pickled peppers";
	        System.out.println(s);
	        String[] words = s.split(" ");
	        int count= 0;
	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            char firstWord =word.charAt(0);
	            if(firstWord=='p')
	                count++;	 
	        }
	        System.out.printf("总共有%d个p开头的单词",count);
	        
	        
	    //练习-间隔大写小写模式
	    /* 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy*/
	    String str7 = "lengendary";
	    char[] cs2 = str7.toCharArray();
	    for (int i = 0; i < cs2.length; i++) {
			if(0 == i%2){
				cs2[i]=Character.toUpperCase(cs2[i]);
			}
		}
	    String result = new String(cs2);
	    System.out.println(result);
	    
	    
	    //练习-最后一个字母变大写 
	    /*把 lengendary 最后一个字母变大写*/
	    String str8 ="lengendary";
	    //方法一：
	    String result2=(str8.substring(str8.length()-1)).toUpperCase();
	    System.out.println(result2);
	    //方法二：
	    char[] cs3 = str8.toCharArray();
	    cs3[cs3.length-1]  = Character.toUpperCase(cs3[cs3.length-1]);
	    String result3 = new String(cs3);
        System.out.printf(result3);
	}	
}

