package cn.titanium.interfaceandinheritance.abstracts;

/**
 * 护甲
 * @author Administrator
 *2017年10月12日上午11:11:50
 */
public class Armor extends Item {
	
	int ac; //护甲等级
	
	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return false;
	}

}
