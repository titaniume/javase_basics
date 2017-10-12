package cn.titanium.interfaceandinheritance.comprehensive;

/**
 * 子类-蜘蛛 
 * @author Administrator
 *2017年10月12日下午5:25:55
 */
public class Spider extends Animal {

	protected Spider(int legs) {
		super(8);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("蜘蛛在吃昆虫");
	}

}
