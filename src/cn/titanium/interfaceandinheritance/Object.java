package cn.titanium.interfaceandinheritance;

/**
 * Object类
 * @author Administrator
 *2017年10月12日上午1:02:50
 */
public class Object {
	
	
	//1:Object类是所有类的父类-->声明一个类的时候，默认是继承了Object 
	
	//2:toString()
	/*Object类提供一个toString方法，所以所有的类都有toString方法
	toString()的意思是返回当前对象的字符串表达
	通过 System.out.println 打印对象就是打印该对象的toString()返回值*/
	
	//3:finalize()
	/*当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件
	当它被垃圾回收的时候，它的finalize() 方法就会被调用。
	finalize() 不是开发人员主动调用的方法，而是由虚拟机JVM调用的。*/
	
	//4:equals()
	/*equals() 用于判断两个对象的内容是否相同
	假设，当两个英雄的hp相同的时候，我们就认为这两个英雄相同*/
	
	
	//5:==	
	/*这不是Object的方法，但是用于判断两个对象是否相同
	更准确的讲，用于判断两个引用，是否指向了同一个对象*/
	
	//6:hashCode()
	/*hashCode方法返回一个对象的哈希值，但是在了解哈希值的意义之前，讲解这个方法没有意义。*/
	
	
	//7:线程同步相关方法
	/*Object还提供线程同步相关方法
	wait()
	notify()
	notifyAll()*/
	
	//8：getClass()
	/*getClass()会返回一个对象的类对象，后面了解*/
	
	//练习：Object
/*	重写Item的 toString(), finalize()和equals()方法
	toString() 返回Item的name + price
	finalize() 输出当前对象正在被回收
	equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同*/
}
