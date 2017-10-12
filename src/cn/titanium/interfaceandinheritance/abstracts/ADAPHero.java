package cn.titanium.interfaceandinheritance.abstracts;



public class ADAPHero extends Hero  implements AD,AP{

	@Override
	public void attact() {
		// TODO Auto-generated method stub
		 System.out.println("既然可以进行物理攻击，也可以进行魔法攻击");
	}

   public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
 
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
