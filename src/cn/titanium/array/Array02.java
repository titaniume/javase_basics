package cn.titanium.array;

/**
 * 初始化数组
 * @author Administrator
 *
 */
public class Array02 {
	
	public static void main(String[] args) {
		//1,分配空间与赋值分步进行
		int[] a = new int[2];
		a[0]=13;
		a[1]=12; 
		
		//2,分配空间，同时赋值
		//写法一：
		int[] b = new int[] {1,2,3,4,5};
		//写法二:
		int[] c = {1,3,5,7,9};
		
		//练习1:-数组反转
		/*首先创建一个长度是5的数组,并填充随机数。 使用for循环或者while循环，对这个数组实现反转效果*/
		int [] d = new int[5];
		d[0]=(int)(Math.random()*100);
		d[1]=(int)(Math.random()*100);
		d[2]=(int)(Math.random()*100);
		d[3]=(int)(Math.random()*100);
		d[4]=(int)(Math.random()*100);
		
		System.out.println("数组中的各个值是:");
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		/*思路一：使用临时数组*/
		//准备临时数组
		int [] temp = new int[d.length];
		//反转的做法是把临时数组的数据，挨个 倒 放入 原数组中
		for (int i = 0; i < temp.length; i++) {
			//把temp数组的最后一个放到第一个
			temp[i]=d[temp.length-1-i];
		}
		System.out.println();
		System.out.println("反转后的数组中各个值是:");
		 for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		 
		//在吧temp的值赋值给d数组
		for (int i = 0; i < temp.length; i++) {
			d[i]=temp[i];
		}
		
		System.out.println();
		System.out.println("反转后的值是："); 
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]+" ");
		}
		
		
		/*思路二： 进行首尾调换*/      
        for (int i = 0; i < d.length/2; i++) {
            int middle = d[d.length-i-1];
            d[d.length-i-1] = d[i];
            d[i] = middle;
        } 
        System.out.println();
        System.out.println("再次反转后的数组中各个值是:");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
	}
}
