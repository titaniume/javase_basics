package cn.titanium.interfaceandinheritance.hide;

public class ADHero extends Hero  implements AD {

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("正在进行物理攻击");
	}
	
	public static void battleWin(){
		System.out.println("ad here battle win");
	}
	
   public static void main(String[] args) {
	 Hero.battleWin();
	 ADHero.battleWin();
   }

}
