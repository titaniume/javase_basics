package cn.titanium.classandobject;

/**
 * 传参
 * @author Administrator
 *2017年10月10日下午9:54:18
 */
public class Obj6 {
	public static void main(String[] args) {
		//1,基本类型传参
		/*基本类型传参 
		在方法内，无法修改方法外的基本类型参数*/
		
		//2,引用与=
		/*如果一个变量是基本类型
		比如 int hp = 50;
		我们就直接管hp叫变量
		=表示赋值的意思。
		如果一个变量是类类型
		比如 Hero h = new Hero();
		我们就管h叫做引用。
		=不再是赋值的意思
		=表示指向的意思
		比如 Hero h = new Hero();
		这句话的意思是
		引用h，指向一个Hero对象*/
		
		
		//3,类类型传参--->类类型又叫引用 
		/* 攻击一个英雄，并让他掉damage点血
	    public void attack(Hero hero, int damage) {
	        hero.hp = hero.hp - damage;
	    }
	     garen.attack(teemo, 100);
	     	第31行的引用 teemo与 第34行的引用hero，是不同的引用 
	     	通过调用garen.attack(teemo, 100); 使得这两个引用都指向了同一个对象 
	     */
		
	}
}
