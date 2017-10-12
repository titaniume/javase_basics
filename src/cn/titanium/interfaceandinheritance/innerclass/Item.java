package cn.titanium.interfaceandinheritance.innerclass;

/**
 * 练习
 * @author Administrator
 *2017年10月12日下午4:49:22
 */
public abstract class Item {
	
	
	 String name;
	 
	 int price;
	 
	public abstract boolean disposable();
	
	public static void main(String[] args) {
		
		Item it = new Item() {
			
			@Override
			public boolean disposable() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		 System.out.println(it.disposable());
	}
}
