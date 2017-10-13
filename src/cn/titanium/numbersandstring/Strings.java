package cn.titanium.numbersandstring;

import java.util.Arrays;

/**
 * 字符串
 * @author Administrator
 *2017年10月13日下午8:40:05
 */
public class Strings {
	public static void main(String[] args) {
		
		//1:创建字符串
		/*字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象 
		常见创建字符串手段： 
		1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串 
		2. 调用String的构造方法创建一个字符串对象 
		3. 通过+加号进行字符串拼接也会创建新的字符串对象 */
		
		String name ="德玛西亚"; ////字面值,虚拟机碰到字面值就会创建一个字符串对象
		String str = new String("盖伦");
		
		char [] cs = new char[]{'他','她','它'}; 
		
		String str2 = new String(cs);	//  通过字符数组创建一个字符串对象
		System.out.println(str2);
		String str3 = name + str; 	//通过+加号进行字符串拼接
		
		
		//2:final
		/*String 别final 修饰，所以不能被继承*/
		
		//3:immutable
		/*immutable 是指不可改变的
		比如创建了一个字符串对象
		String garen ="盖伦";
		不可改变的具体含义是指：
		不能增加长度
		不能减少长度
		不能插入字符
		不能删除字符
		不能修改字符
		一旦创建好这个字符串，里面的内容 永远 不能改变

		String 的表现就像是一个常量*/
		
		
		//4:字符串格式化
		/*如果不使用字符串格式化，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐 
		使用字符串格式化，就可以简洁明了 */
		 String name1 ="盖伦";
	     int kill = 8;
	     String title="超神";
	     
	     //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name1+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";
          
        System.out.println(sentence);
         
        //格式化字符串
        //%s表示字符串，%d表示数字,%n表示换行 
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
         
        String sentence2 = String.format(sentenceFormat, name1,kill,title);
         
        System.out.println(sentence2);
		
        
        //5:字符串长度
        /*length方法返回当前字符串的长度 
                     可以有长度为0的字符串,既空字符串*/
        String str4 = "aaabbbccc它的";
        System.out.println(str4.length());
        String unknowHero = "";
        
        //可以有长度为0的字符串,既空字符串
        System.out.println(unknowHero.length());
        
        
        //练习：随机字符串
       /* 创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
        	给点提示: 数字和字符之间可以通过互相转换*/
        //方法一：
		char cr [] =  new char[5];
		short start = '0';
		short end = 'z' + 1;
		for (int i = 0; i < cr.length; i++) {
			while(true){
				char c = (char)((Math.random() *(end  - start)) +start);
				if(Character.isLetter(c) || Character.isDigit(c)){
					cr[i]=c;
					break;
				}
			}
		}
		String result=new String(cr);
		System.out.println(result);
		
		//方法二：
		String pool = "";
		for (short i ='0';i < '9';i++) {
			pool +=(char)i;
		}
		for (short i = 'a'; i < 'z'; i++) {
			pool +=(char)i;
		}
		for (short i = 'A'; i < 'Z'; i++) {
			pool +=(char)i;
		}
		char [] cr2 =  new char [5];
		for (int i = 0; i < cr2.length; i++) {
			int index = (int)(Math.random() * pool.length());
			cr2[i] = pool.charAt(index);
		}
		
		String result2 =  new String(cr2);
		System.out.println(result2);
		
		//练习-字符串数组排序
/*		创建一个长度是8的字符串数组
		使用8个长度是5的随机字符串初始化这个数组
		对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)

		注1： 不能使用Arrays.sort() 要自己写
		注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序*/
		
		String [] arrStr = new String[8];
		for (int i = 0; i < arrStr.length; i++) {
			 String randomString = randomString(5);
			 arrStr[i]=randomString;
		}
		 System.out.println("未排序前的字符串数组:");
	     System.out.println(Arrays.toString(arrStr));
	     for (int i = 0; i < arrStr.length; i++) {
			for (int j = 0; j < arrStr.length-i-1; j++) {
				  char firstChar1 = arrStr[i].charAt(0);
	              char firstChar2 = arrStr[i + 1].charAt(0);
	              firstChar1 = Character.toLowerCase(firstChar1);
	              firstChar2 = Character.toLowerCase(firstChar2);
	              if (firstChar1 > firstChar2) {
	                    String temp = arrStr[i];
	                    arrStr[i] = arrStr[i + 1];
	                    arrStr[i + 1] = temp;
	                }
			}
		}
	     System.out.println("未排序后的字符串数组:");
	     System.out.println(Arrays.toString(arrStr));
	    
	     String password = randomString(3);
	     System.out.println("密码是:" + password);
	 
	        char[] guessPassword = new char[3];
	        outloop:
	        for (short i = '0'; i <= 'z'; i++) {
	            for (short j = '0'; j <= 'z'; j++) {
	                for (short k = '0'; k <= 'z'; k++) {
	                    if (!isLetterOrDigit(i,j,k))
	                        continue;
	                    guessPassword[0] = (char) i;
	                    guessPassword[1] = (char) j;
	                    guessPassword[2] = (char) k;
	                    String guess = new String(guessPassword);
//	                  System.out.println("穷举出来的秘密是：" + guess);
	                     
	                    if(guess.equals(password)){
	                        System.out.println("找到了，密码是" + guess);
	                        break outloop;
	                    }
	                     
	                }
	            }
	        }
	    }
	     
	    private static boolean isLetterOrDigit(short i, short j, short k) {
	        return Character.isLetterOrDigit(i) &&
	                Character.isLetterOrDigit(j) &&
	                Character.isLetterOrDigit(k) ;
	    
	}

	private static String randomString(int lenght) {
		String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[lenght];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
	}
	
	//练习-穷举法破解密码
	/* 生成一个长度是3的随机字符串，把这个字符串作为当做密码

	 2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码

	 要求： 分别使用多层for循环 和 递归解决上述问题*/
	
	private static String randomString2(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
          
            cs[i] = pool.charAt(index);
            System.err.print(pool.charAt(index));
        }
        String result = new String(cs);
        return result;
    }
	
}
