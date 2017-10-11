package cn.titanium.interfaceandinheritance.overwrite;

/**
 * 物品
 * @author Administrator
 *2017年10月11日下午6:30:46
 */
public class Item {
	String name;
	int price;
	
	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("物品使用后可以看到效果");
	}
	
	public static void main(String[] args) {
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}
}
