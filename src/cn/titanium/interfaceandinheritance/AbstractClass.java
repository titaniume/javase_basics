package cn.titanium.interfaceandinheritance;

import cn.titanium.interfaceandinheritance.abstracts.Hero;

/**
 * 抽象类
 * @author Administrator
 *2017年10月12日上午10:52:49
 */
public class AbstractClass {
		
	//1：抽象类
	/*为Hero增加一个抽象方法 attack，并且把Hero声明为abstract的。
	APHero,ADHero,ADAPHero是Hero的子类，继承了Hero的属性和方法。
	但是各自的攻击手段是不一样的，所以继承Hero类后，这些子类就必须提供不一样的attack方法实现。*/

	//2:抽象类可以没有抽象方法
	/*Hero类可以在不提供抽象方法的前提下，声明为抽象类 
	一旦一个类被声明为抽象类，就不能够被直接实例化
	//虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
	Hero h = new Hero();
	*/
	
	
	//3:抽象类和接口的区别
	/*区别1：
	子类只能继承一个抽象类，不能继承多个
	子类可以实现多个接口
	区别2：
	抽象类可以定义
	public,protected,package,private
	静态和非静态属性
	final和非final属性
	但是接口中声明的属性，只能是
	public
	静态
	final的
	即便没有显示的声明*/
	
	/*注意：抽象类和接口都可以有实体方法。 接口中的实体方法，叫做默认方法*/
	
	
	//练习：抽象类
	/*有的物品使用之后就消失了，比如血瓶
	有的物品使用了之后还会继续存在，比如武器
	为Item类设计一个抽象方法 */
	
}
