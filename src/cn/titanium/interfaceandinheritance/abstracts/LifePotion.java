package cn.titanium.interfaceandinheritance.abstracts;


/**
 * 血瓶
 * @author Administrator
 *2017年10月12日上午11:12:17
 */
public class LifePotion extends Item {
	
	 public void effect(){
	      System.out.println("血瓶使用后，可以回血");
	  }
	
	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return true;
	}

}
