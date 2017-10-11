package cn.titanium.classandobject;


/**
 * 饿汉式单例模式
 * @author Administrator
 *2017年10月11日上午10:20:55
 */
public class GiantDragon1 {
	 
	//私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon1(){
         System.out.println("GiantDragon1 constructor");
    }
    
      
    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static GiantDragon1 instance =null;
    
    
    
    //public static 方法，返回实例对象
    public static GiantDragon1 getInstance(){
    	 //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
    	if(null == instance){
    		instance =  new GiantDragon1();
    	}
        return instance;
    }
    
    public static  void printxxx(){
    	System.out.println("printxxx");
    }
     
}
