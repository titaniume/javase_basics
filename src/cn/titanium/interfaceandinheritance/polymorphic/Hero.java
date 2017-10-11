package cn.titanium.interfaceandinheritance.polymorphic;

/**
 * 不使用多态
 * @author Administrator
 *2017年10月11日下午8:07:46
 */
public class Hero {
	
	String name;
	protected float hp;
	
	public void useLifePotion(LifePotion lp){
		lp.effect();
	}
	public void useMagicPotion(MagicPotion mp){
		mp.effect();
	}
	
	 public static void main(String[] args) {
         
        Hero garen =  new Hero();
        garen.name = "盖伦";
     
        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();
         
        garen.useLifePotion(lp);
        garen.useMagicPotion(mp);
	         
	    }
	       
}
