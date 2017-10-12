package cn.titanium.interfaceandinheritance.defaultmethod;

public interface AD {
	
	//物理伤害
    public void physicAttack();
    
    public default void attact(){
    	System.out.println("物理攻击");
    }
}
