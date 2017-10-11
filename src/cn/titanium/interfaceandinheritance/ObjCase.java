package cn.titanium.interfaceandinheritance;

import cn.titanium.interfaceandinheritance.interfaces.Hero;
import cn.titanium.interfaceandinheritance.interfaces.ADHero;
import cn.titanium.interfaceandinheritance.interfaces.AD;
import cn.titanium.interfaceandinheritance.interfaces.APHero;
import cn.titanium.interfaceandinheritance.interfaces.Support;

/**
 * 对象转换
 * @author Administrator
 *2017年10月11日下午5:43:36
 */
public class ObjCase {
	
	public static void main(String[] args) {
		//1,明确引用类型和对象引用类型的概念
		/*ADHero ad = new ADHero();*/
		/*	在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
			对象是有类型的， 是ADHero
			引用也是有类型的，是ADHero
			通常情况下，引用类型和对象类型是一样的
			接下来要讨论的类型转换的问题，指的是引用类型和对象类型不一致的情况下的转换问题*/
		
		//2,子类转父类(向上转型)
		/*所谓的转型，是指当引用类型和对象类型不一致的时候，才需要进行类型转换
		类型转换有时候会成功，有时候会失败(参考基本类型的类型转换)
		方法：把右边的当做左边来用，看说得通不
		Hero h = new Hero();
		ADHero ad = new ADHero();
		h = ad;
		
		右边ad引用所指向的对象的类型是 物理攻击英雄
		左边h引用的类型是 普通英雄
		把物理攻击英雄 当做 普通英雄，说不说得通？ 说得通，就可以转*/
		
		
		//3,父类转子类(向下转型)
		/*父类转子类，有的时候行，有的时候不行，所以必须进行强制转换。
		强制转换的意思就是 转换有风险，风险自担。
		什么时候行呢？
		Hero h =new Hero();
	    ADHero ad = new ADHero();
	    h = ad;
	    ad = (ADHero) h;
	    
	           第40行，是子类转父类，一定可以的
	           第41行，就是父类转子类，所以要进行强转。
	    h这个引用，所指向的对象是ADHero, 所以第41行，就会把ADHero转换为ADHero，就能转换成功。
	    
	    
	          什么时候不行呢？
	    Hero h =new Hero();
	    ADHero ad = new ADHero();
	    Support s =new Support();
	    h = s;
	    ad = (ADHero)h;
	      第53行，是子类转父类，是可以转换成功的
	      第54行，是把h引用所指向的对象 Support，转换为ad引用的类型ADHero。
	     从语义上讲，把物理攻击英雄，当成辅助英雄来用，说不通，所以会强制转换失败，并且抛出异常
	  */        
	          
	  //4,没有继承关系的两个类，互相转换	
	 /*  没有继承关系的两个类，互相转换，一定会失败
	        虽然ADHero和APHero都继承了Hero，但是彼此没有互相继承关系
	 "把魔法英雄当做物理英雄来用",在语义上也是说不通的
	    ADHero ad = new ADHero();
	   
        APHero ap = new APHero();

       // 没有继承关系的类型进行互相转换一定会失败，所以会出现编译错误
       ad = (ADHero) ap;
     */
		
	//5,实现类转换成接口(向上转型)---子类转父类
	/* ADHero ad = new ADHero();
     AD adi = ad;
              引用ad指向的对象是ADHero类型，这个类型实现了AD接口
     76行： 把一个ADHero类型转换为AD接口
              从语义上来讲，把一个ADHero当做AD来使用，而AD接口只有一个physicAttack方法，
              这就意味着转换后就有可能要调用physicAttack方法，而ADHero一定是有physicAttack方法的，
              所以转换是能成功的。*/
		
	//6:接口转换成实现类(向下转型)	
	/*ADHero ad = new ADHero();
         
    AD adi = ad;
   
    ADHero adHero = (ADHero) adi;
            
    ADAPHero adapHero = (ADAPHero) adi;
    adapHero.magicAttack();
    86行： ad引用指向ADHero， 而adi引用是接口类型：AD，实现类转换为接口，是向上转型，所以无需强制转换，并且一定能成功
    88行: adi实际上是指向一个ADHero的，所以能够转换成功
    90行： adi引用所指向的对象是一个ADHero，要转换为ADAPHero就会失败。 */
		
	//7:instanceof
	/*instanceof Hero 判断一个引用所指向的对象，是否是Hero类型，或者Hero的子类*/
		Hero h = new Hero();
		ADHero ad = new ADHero();
		APHero ap = new APHero();
		Hero h1= ad;
	    Hero h2= ap;
	    //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);
         
        //判断引用h1指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);
         
        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);
	
		
	}
	
}
