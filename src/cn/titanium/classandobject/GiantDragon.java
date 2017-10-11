package cn.titanium.classandobject;


/**
 * 饿汉式单例模式
 * @author Administrator
 *2017年10月11日上午10:20:55
 */
public class GiantDragon {
	 
	//私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){
         
    }
    
      
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();
    
    //public static 方法，提供给调用者获取12行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }
     
}
