package cn.titanium.interfaceandinheritance.supers;

import cn.titanium.interfaceandinheritance.supers.LifePotion;

public class ADHero extends Hero implements AD {
	
	int moveSpeed=400; //移动速度
	
	@Override
	public void physicAttack() {
		// TODO Auto-generated method stub
		System.out.println("进行物理攻击");
	}
	
/*	public ADHero(String name){
		super(name);
		System.out.println("AD Hero 的构造方法");
	}*/
	
	  
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
     
    public int getMoveSpeed2(){
    	//获取父类的属性
        return super.moveSpeed;
    }
    //重写useItem,并在其中调用父类的useItem方法
    public void useItem(Item i){
    	System.out.println("adhero use item");
    	super.useItem(i);
    }
     
	
	public static void main(String[] args) {
		//new ADHero("德莱文");
		
		ADHero ad = new ADHero();
		System.out.println(ad.getMoveSpeed());
		System.out.println(ad.getMoveSpeed2());
		Hero h = new Hero();
		
		LifePotion lp = new LifePotion();
		h.useItem(lp);
	}

}
