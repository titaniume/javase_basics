package cn.titanium.classandobject;

/**
 * 访问修饰符
 * @author Administrator
 *2017年10月10日下午10:14:00
 */
public class Obj7 {
	//1,类之间的关系
	//2,private 私有的
	/*使用private修饰属性 
	自身：是可以访问的 
	同包子类：不能继承 
	不同包子类：不能继承 
	同包类：不能访问 
	其他包类：不能访问*/
	
	//3package/friendly/default 不写 ：没有修饰符即代表package/friendly/default 
	//4, protected 受保护的:同包类可以访问,不同包不能访问
	
	/*那么什么情况该用什么修饰符呢？
	从作用域来看，public能够适用所有的情况。 但是大家在工作的时候，又不会真正全部都适用public,那么到底什么情况改用什么修饰符呢？
	
	1. 属性通常使用private封装起来
	2. 方法一般使用public用于被调用
	3. 会被子类继承的方法，通常使用protected
	4. package用的不多，一般新手会用package,因为还不知道有修饰符这个东西
	
	再就是作用范围最小原则
	简单说，能用private就用private，不行就放大一级，用package,再不行就用protected，最后用public。 这样就能把数据尽量的封装起来，没有必要露出来的，就不用露出来了
	*/
}