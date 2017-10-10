package cn.titanium.classandobject.methodload;

import cn.titanium.classandobject.Hero;

/**
 * 方法重载-->可变数量的参数
 * @author Administrator
 *2017年10月10日下午8:18:16
 */
public class ADHero1 extends Hero {
	
	public void attack(Hero hero){
		System.out.println(name+"进行了一次攻击，但是不确定打中了谁");
	}
	
	public void attack(Hero... heros){
		for (int i = 0; i < heros.length; i++) {
			System.out.println(name+"攻击了"+heros[i].name);
		}
	}
	
	public static void main(String[] args) {
		ADHero1 ah = new ADHero1();
		ah.name="赏金猎人";
		 

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
 
        ah.attack(h1);
        ah.attack(h1, h2);
 
		
	}
}
