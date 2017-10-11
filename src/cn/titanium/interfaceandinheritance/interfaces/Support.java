package cn.titanium.interfaceandinheritance.interfaces;

import cn.titanium.classandobject.Hero;

public class Support extends Hero implements Healer {

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		System.out.println(name+"加了一口血");
	}

}
