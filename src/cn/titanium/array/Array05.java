package cn.titanium.array;

/**
 * 复制数组
 * 把一个数组的值，复制到另一个数组中
 * @author Administrator
 *2017年10月10日下午12:10:28
 */
public class Array05 {
	public static void main(String[] args) {
		/*src: 源数组
		srcPos: 从源数组复制数据的启始位置
		dest: 目标数组
		destPos: 复制到目标数组的启始位置
		length: 复制的长度
		*/
		
		//方法二:传统for循环复制
		int [] a = new int[]{1,3,5,7,9,11,13};
		int [] b = new int [4];
		
		//需求：复制5,7,9,11
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i+2];
		}
	/*	for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}*/
		
		 //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
		 System.arraycopy(a, 2, b, 0, 4);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		
		//练习
		/*首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组*/
	    int [] c = new int[(int) (Math.random() * 5)+5];
	    for (int i = 0; i < c.length; i++) {
			c[i]=(int) (Math.random() * 100);
		}
	    
	    int [] d = new int[(int) (Math.random() * 5)+5];
	    for (int i = 0; i < d.length; i++) {
			d[i]=(int) (Math.random() * 100);
		}
	    
	    System.out.println("数组c的内容:");
        for (int i : c) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("数组d的内容:");
        for (int i : d) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        int [] e = new int[c.length+d.length];
        System.arraycopy(c, 0, e, 0, c.length);
        System.arraycopy(d, 0, e, c.length, d.length);
        System.out.println("数组e的内容:");
        for (int i : e) {
            System.out.print(i+" ");
        }
         
	}
}
