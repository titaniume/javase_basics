package cn.titanium.classandobject;

/**
 * 方法重载
 * 方法重载指的是方法名一样，但是参数类型不一样
 * @author Administrator
 *2017年10月10日下午8:02:33
 */
public class Obj3 {
	public static void main(String[] args) {
		//1,attack方法的重载
		/*有一种英雄，叫做物理攻击英雄 ADHero
		为ADHero 提供三种方法
		public void attack();
		public void attack(Hero h1);
		public void attack(Hero h1, Hero h2);
		方法名是一样的，但是参数类型不一样
		在调用方法attack的时候，会根据传递的参数类型以及数量，自动调用对应的方法
		*/
		
		//2,可变数量的参数
		/*如果要攻击更多的英雄，就需要设计更多的方法，这样类会显得很累赘，像这样：
		public void attack(Hero h1)
		public void attack(Hero h1,Hero h2)
		public void attack(Hero h1,Hero h2,Hero 3)
		这时，可以采用可变数量的参数
		只需要设计一个方法
		public void attack(Hero ...heros)
		即可代表上述所有的方法了
		在方法里，使用操作数组的方式处理参数heros即可
		*/
		
		
		//练习-治疗
		/*涉及一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
		对Support的heal方法进行重载
		heal() 
		heal(Hero h) //为指定的英雄加血
		heal(Hero h, int hp) //为指定的英雄加了hp的血*/
		
		
		}
}
