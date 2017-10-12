package cn.titanium.interfaceandinheritance.comprehensive;

/**
 * 父类--抽象类
 * @author Administrator
 *2017年10月12日下午5:21:36
 */
public abstract class Animal {
	
	protected int legs; //动物的腿数量
	protected Animal(int legs){
		this.legs=legs;
	}
	
	public abstract void eat();
	
	 public void walk(){
	      System.out.println("用 " + legs +  " 条腿走路");
	 }
}
