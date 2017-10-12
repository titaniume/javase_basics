package cn.titanium.interfaceandinheritance.abstracts;

/**
 * 蓝瓶
 * @author Administrator
 *2017年10月12日上午11:15:03
 */
public class MagicPotion extends Item {
	
   public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
	
	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return true;
	}

}
