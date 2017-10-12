package cn.titanium.interfaceandinheritance;

import cn.titanium.interfaceandinheritance.finals.Hero;

/**
 * final
 * final修饰类，方法，基本类型变量，引用的时候分别有不同的意思。
 * @author Administrator
 *2017年10月12日上午10:32:05
 */
public class Final {
	
	public static void main(String[] args) {
		
		//1:final修饰符
		/*当Hero被修饰成final的时候，表示Hero不能够被继承
		其子类会出现编译错误*/
		
		
		//2:final修饰方法
		/*Hero的useItem方法被修饰成final,那么该方法在ADHero中，不能够被重写*/

		
		//3:final修饰基本类型变量
		/*final修饰基本类型变量，表示该变量只有一次赋值机会 */
		/*final int a = 12;
		a=23;*/
		
		
		//4:final修饰引用
		/* final Hero h;
		 h = new Hero();
		 h = new Hero();
		 h.hp= 4;
		 final修饰引用
		 h引用被修饰成final，表示该引用只有1次指向对象的机会
		 所以33行会出现编译错误
		   但是，依然通过h引用修改对象的属性值hp，因为 hp并没有final修饰*/
		
		//5:常量
		/*常量指的是可以公开，直接访问，不会变化的值 
		比如 itemTotalNumber 物品栏的数量是6个*/
		
		//练习：final 
		/*设计一个类SomeString,继承 String类。 能否继承？*/
		//不能，因为String是被final所修饰
		/*String被设计为final是有原因的，因为String这个类使用得实在是太广泛了，
		如果能够被继承，就意味着其子类可以随意重写其非final的方法，这些方法就有可能变得和期望的不一样，
		比如toString始终返回空。 这样就给软件逻辑带来了很大的不确定性因素。*/
	}	
}
