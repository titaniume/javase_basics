package cn.titanium.numbersandstring;

/**
 * 装箱和拆箱
 * @author Administrator
 *2017年10月12日下午5:43:13
 */
public class Boxingandunboxing {
	
	/*可以理解为父类和子类的关系	
	装箱：子类--父类
	拆箱：父类--子类*/
	
	
	public static void main(String[] args) {
		
		//1:封装类
		/*所有的基本类型，都有对应的类类型 
		比如int对应的类是Integer 
		这种类就叫做封装类*/
		int i = 10;
		//把一个基本类型变量转换为Integer对象
		Integer it =  new Integer(i);
		//把Integer对象转转换为基本类型int
		int i2 = it.intValue();
		System.out.println(it+" "+i2);
		
		
		
		//2:Number类
		/*数字封装类有 
		Byte,Short,Integer,Long,Float,Double 
		这些类都是抽象类Number的子类*/
		
		int j = 6;
		Integer ig = new Integer(j);
		//Integer是Number的子类，所以打印true
		System.out.println(ig instanceof Number);
		
		//3:基本类型转封装类
		int a = 18;
		Integer i3 =  new Integer(a);
		
		//封装类转基本类型
		int c = 19;
		 //基本类型转换成封装类型
		Integer it3 = new Integer(c);
		 //封装类型转换成基本类型
		int i4 = it3.intValue();
		
		
		//4:自动装箱
		/*不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱*/
		int f = 12;
		
		//基本类型转封装类型
		Integer it4 = new Integer(f);	
		//自动转换就叫装箱
		Integer i5=it4;
		
		
		//5:自动拆箱
		/*不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱*/
		int  g = 8 ;
		Integer it6 = new Integer(g);
		
		//封装类型转换为基本类型
		int i6 = it6.intValue();
		
		//自动转换就叫拆箱
		int i7=it6;
		
		
		//6:int的最大值，最小值
		/*int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取*/
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		//练习-装箱拆箱 
		/*1. 对byte,short,float,double进行自动拆箱和自动装箱

		2. byte和Integer之间能否进行自动拆箱和自动装箱

		3. 通过Byte获取byte的最大值*/
		System.out.println("------------------------");
		
		byte  bt = 1;
		short st = 2;
		float ft = 3.5f;
		double db = 8.6;
		
		// 自动装箱   子类---父类
		Byte bt1 = bt;
		Short st1= st;
		Float ft1 = ft;
		Double db1 = db;
		
		//自动拆箱  父类---子类
		bt = bt1;
		st1 =  st;
		ft1 = ft;
		db1 = db;
		
		 // 2. byte和Integer之间能否进行自动拆箱和自动装箱
		 // Integer ie = bt; 		//不能把byte直接自动装箱成Integer
		 //Byte be = new Integer(2);   //也不能把Integer自动拆箱成 byte
		
		// 3. 通过Byte获取byte的最大值
		System.out.println(Byte.MAX_VALUE);
		
		
	}
	
	

}
