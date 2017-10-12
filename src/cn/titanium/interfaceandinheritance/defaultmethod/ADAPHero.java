package cn.titanium.interfaceandinheritance.defaultmethod;

//同时能进行物理和魔法伤害的英雄
public class ADAPHero extends Hero implements AD,AP {

	@Override
	public void magicAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attact() {
		// TODO Auto-generated method stub
		System.out.println("使用自己的双攻击方法");
	}

	public static void main(String[] args) {
		ADAPHero adp = new ADAPHero();
		adp.attact();
	}
	
	
}
