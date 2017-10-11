package cn.titanium.interfaceandinheritance.polymorphic;

/**
 * 
 * @author Administrator
 *2017年10月11日下午8:00:12
 */
public class Item {

	String naem;
	int price;
	
	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
	
	public static void main(String[] args) {
		Item i1 = new LifePotion();
		Item i2 = new MagicPotion();
		System.out.print("i1 是Item类型，执行effect打印:");
		i1.effect();
	    System.out.print("i2也是Item类型，执行effect打印:");
	    i2.effect();
	 /*   观察类的多态现象：
	    1. i1和i2都是Item类型
	    2. 都调用effect方法
	    3. 输出不同的结果

	    多态: 都是同一个类型，调用同一个方法，却能呈现不同的状态*/
	}
		
}
