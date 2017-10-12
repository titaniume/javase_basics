package cn.titanium.interfaceandinheritance.innerclass;

/**
 * 匿名类
 * @author Administrator
 *2017年10月12日下午4:33:30
 */
public abstract class Hero3 {
	String name; // 姓名

	float hp; // 血量

	float armor; // 护甲

	int moveSpeed; // 移动速度

	public abstract void attack();
	
	public static void main(String[] args) {
		ADHero adh = new ADHero();
		
		//通过打印adh，可以看到adh这个对象属于ADHero类
		adh.physicAttack();
		System.out.println(adh);
		
		Hero3 h = new Hero3(){

			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("行的攻击手段");
			}
			//当场实现	physicAttack
			
		};
		h.attack();
		//通过打印h，可以看到h这个对象属于Hero3$1这么一个系统自动分配的类名
		System.err.println(h);
		//
	}
	
}
