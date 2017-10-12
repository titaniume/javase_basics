package cn.titanium.interfaceandinheritance.defaultmethod;

public interface Mortal {
	
	public void die();
	
	default public void revice(){
		System.out.println("英雄复活了");
	}
}
