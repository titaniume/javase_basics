package cn.titanium.classandobject.methodload;

import cn.titanium.classandobject.Hero;

/**
 * 辅助英雄
 * @author Administrator
 *2017年10月10日下午8:26:13
 */
public class Support extends Hero {
	
	//治疗
	public void heal(){
		 System.out.println("对自己进行治疗");
	}
	//为指定的英雄加血
	public void heal(Hero hero){
		System.out.println(name + "给" + hero.name + "加血了");
	}
	//为指定的英雄加了hp的血
	public void heal(Hero hero,int hp){
		 System.out.println("给英雄 " + hero.name + " 加了 " + hp + "点血");
		
	}
	
	public static void main(String[] args) {
		Support sp = new Support();
		sp.name="亚索";
		
		Hero h1 = new Hero();
		h1.name="猴子";
		
		Hero h2 = new Hero();
		h2.name="盖伦";
		
		sp.heal();
		sp.heal(h1);
		sp.heal(h2,30);
	}
}
