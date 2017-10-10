package cn.titanium.classandobject.inherit;


/**
 * 武器类
 * @author Administrator
 *2017年10月10日下午6:43:19
 */
public class Weapon extends Item {
	/*虽然Weapon自己没有设计name和price,但是通过继承Item类，也具备了name和price属性*/
	int damage; //攻击力
	public static void main(String[] args) {
		Weapon wp =new Weapon();
		wp.damage=60; //damage属性在类Weapon中新设计的
	    wp.name="无尽之刃"; //name属性，是从Item中继承来的，就不需要重复设计了
	    wp.price=2100;
	    
	}
}
