package cn.titanium.numbersandstring;

/**
 * Stringbuffer
 * @author Administrator
 *2017年10月14日上午11:55:34
 */
public final class StringBuffers {
	public static void main(String[] args) {
		/*StringBuffer是可变长的字符串*/
		
		//1:追加 删除 插入 反转
		/*append追加 
		delete 删除 
		insert 插入 
		reverse 反转*/
		
		String str ="the night";
		//根据str 创建一个StringBuffer对象
		StringBuffer sb = new StringBuffer(str);
		sb.append("last add"); //在最后追加
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb); //删除2~5之间的字符
		
		sb.insert(4, "insert char"); //在4这个位置插入字符
		System.out.println(sb);
		
		sb.reverse(); //反转
		System.out.println(sb);
		
		
		//2:长度 容量
		/*为什么StringBuffer可以变长？ 
		和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度 
		比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。 
		如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中*/
		 String str1 = "the";
		 
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer();
        
         
        System.out.println(sb1.length()); //内容长度
         
        System.out.println(sb1.capacity());//总空间
        System.out.println("一个空的Stringbuffer空间："+sb2.capacity());
        
       //练习-StringBuffer性能
        /*String与StringBuffer的性能区别?

		生成10位长度的随机字符串
		然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
		然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间

		提示: 使用System.currentTimeMillis() 获取当前时间(毫秒)*/
        
       int total =10000;
       String s = randomString(10);
       StringBuffer sbf = new StringBuffer();
       String str2 = " ";
       long start = System.currentTimeMillis();
       for (int i = 0; i < total; i++) {
		str2+= s;
	 }
       long end = System.currentTimeMillis();
       System.out.printf("使用连接字符串方式+的 方式：连续%d次，耗时%d毫秒%n",total,end-start);
       total *=100;
       start = System.currentTimeMillis();
       for (int i = 0; i < total; i++) {
		sbf.append(s);
	}
       end = System.currentTimeMillis();
       System.out.printf("使用StringBuffer的方式，连接%d次，耗时%d毫秒%n",total,end-start);

       
       //练习-MyStringBuffer
       	/*根据接口IStringBuffer ，自己做一个MyStringBuffer*/
       
       
       
	}
	private static String randomString(int length) {
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
        }
        String result = new String(cs);
        return result;
    }
}