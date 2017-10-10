package cn.titanium.classandobject.inherit;




/**
 * 护甲
 * @author Administrator
 *2017年10月10日下午6:49:29
 */
public class Armor extends Item {
	
	int ac; //护甲等级
	public static void main(String[] args) {
		Armor cloth = new Armor();
		Armor chainMail = new Armor();
		cloth.name = "布甲";
		cloth.price = 300;
		cloth.ac = 15;
		chainMail.name="锁子甲";
		chainMail.price=500;
		chainMail.ac=40;
	}
}
