package cn.titanium.interfaceandinheritance;

/**
 * super关键字
 * @author Administrator
 *2017年10月11日下午9:30:52
 */
public class Super {
	
	public static void main(String[] args) {
		//1:准备一个显式提供无参构造方法的父类
		//2:实例化子类，父类的构造方法一定会被调用
		/*实例化一个ADHero(), 其构造方法会被调用 
		其父类的构造方法也会被调用 
		并且是父类构造方法先调用 
		子类构造方法会默认调用父类的 无参的构造方法*/
		
		//3:父类显式提供两个构造方法-->分别是无参的构造方法和带一个参数的构造方法
		//4:子类显式调用父类带参构造方法-->使用关键字super 显式调用父类带参的构造方法
		//5:调用父类属性
	/*	public int getMoveSpeed2(){
			  return super.moveSpeed;
		}*/
		
		//6:调用父类方法-->ADHero重写了useItem方法，并且在useItem中通过super调用父类的useItem方法
		
		//练习-super 
		/*父类Hero提供了一个有参的构造方法:		
		但是没有提供无参的构造方法
		子类应该怎么处理？
		*/
		
		/*
		作为子类，无论如何 都会调用父类的构造方法。
		默认情况下，会调用父类的无参的构造方法。 
		但是，当父类没有无参构造方法的时候( 提供了有参构造方法，并且不显示提供无参构造方法)，
		子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
		这个时候，必须通过super去调用父类声明的，存在的，有参的构造方法*/
	}
}
