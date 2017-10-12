package cn.titanium.interfaceandinheritance.innerclass;

/**
 * 静态内部类
 * 
 * @author Administrator 2017年10月12日下午12:33:23
 */
public class Hero2 {

	public String name;
	protected float hp;

	private static void battleWin() {
		System.out.println("胜利！");
	}

	// 敌方的水晶
	static class EnemCrystal {
		int hp = 5000;

		// 如果水晶的血量为0则宣布胜利
		public void checkIfVictory() {
			if (hp == 0) {
				Hero2.battleWin();

				// 静态内部类不能直接访问外部内部类的对象属性
				// System.out.println(name + "Win this game");
			}else{
				System.out.println("水晶还在啊");
			}
		}
	}
	
	public static void main(String[] args) {
		//实例化内部类
		Hero2.EnemCrystal ec = new Hero2.EnemCrystal();
		ec.hp=0;
		ec.checkIfVictory();
	}
}
