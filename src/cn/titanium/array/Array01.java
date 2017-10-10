package cn.titanium.array;


/**
 * 创建数组
 * @author Administrator
 *
 */
public class Array01 {
	
	public static void main(String[] args) {
		
		//定义：
		//数组是一个固定长度的，包含了相同类型的数据容器
		
		//1,声明数组
		int [] a; //int 表示数组里面的每一个元素都是一个整数,[] 表示该变量是一个数组, a是变量名
		
		//2,创建数组(创建数组需要指定长度)
		//声明一个引用
		int [] b;
		//创建一个是5的数组，并且引用a指向该数组
		b = new int[5];
		//声明的同时，指向一个数组
		int [] c =new int [5];
		
		//3,访问数组
		//数组下标 基于0 
		int [] d=new int [2];
		d[0]=1;//下标0，代表数组里的第一个数
		d[1]=2;
		
		
		//4,数组长度
		//.length属性 用于访问一个数组的长度
	    //数组的访问范围是0~数组名.length-1; 一旦超过这个范围就 会产生数组越界异常:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		
		
		//练习
		/*
		     获取一个人数组的最大值和最小值
		     首先创建一个长度是5的数组
		     然后给数组的每一位赋予随机整数
		      通过for循环，遍历数组，找出最小的一个值出来
		*/
		int min,max;
		int [] g = new int [2];
		//100 以内的随机数
		g[0] = (int) (Math.random() * 100);
		g[1] = (int) (Math.random() * 100);
		g[2] = (int) (Math.random() * 100);
		g[3] = (int) (Math.random() * 100);
		g[4] = (int) (Math.random() * 100);
		
		System.out.println("数组中的随机数是:");
		for (int i = 0; i < g.length; i++) {
			System.out.print(g[i]+"\t");
		}
		System.out.println();
		System.out.println("找出最新的值是：");
		
		//这里赋一个初始值
	    min=max=g[0];
		for (int i = 0; i < g.length; i++) {
			int value=g[i];
			if(value < min){
				min=value;
			}
			if(value > max){
				max=value;
			}
		}
		System.out.println("最小值是："+min);
		System.out.println("最大值是："+max);
 	
	}
	
	
}
