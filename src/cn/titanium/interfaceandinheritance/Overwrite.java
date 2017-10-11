package cn.titanium.interfaceandinheritance;

/**
 * 重写
 * @author Administrator
 *2017年10月11日下午6:29:30
 */
public class Overwrite {
	/*子类可以继承父类的对象方法 

	在继承后，重复提供该方法，就叫做方法的重写 

	又叫覆盖 override*/
	
	//1:父类Item：父类Item有一个方法，叫做effect
	//2:子类LifePotion 子类LifePotion继承Item,同时也提供了方法effect
	//3:调用重写的方法:
	/*调用重写的方法
	调用就会执行重写的方法，而不是从父类的方法
	所以LifePotion的effect会打印：
	"血瓶使用后，可以回血"*/
	
	//4:如果没有重写这样的机制怎么样？
	/*如果没有重写这样的机制，也就是说LifePotion这个类，一旦继承了Item，所有方法都不能修改了。
	但是LifePotion又希望提供一点不同的功能，为了达到这个目的，只能放弃继承Item,
	重新编写所有的属性和方法，然后在编写effect的时候，做一点小改动.*/
	
	//练习：重写
	/*设计一个类MagicPotion 蓝瓶，继承Item, 重写effect方法
	并输出 “蓝瓶使用后，可以回魔法”*/
}
