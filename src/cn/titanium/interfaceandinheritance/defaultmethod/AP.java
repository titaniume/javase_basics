package cn.titanium.interfaceandinheritance.defaultmethod;

public interface AP {

	public void magicAttack();

	public default void attact() {
		System.out.println("魔法攻击");
	}
}
