package cn.titanium.classandobject;

/**
 * 属性初始化
 * @author Administrator
 *2017年10月11日上午9:45:36
 */
public class Obj10 {
	
	//1,对象属性初始化
	/*对象属性初始化有3种
	1. 声明该属性的时候初始化 
	2. 构造方法中初始化
	3. 初始化块
	*/
	
	//2,类属性初始化
	/*类属性初始化有2种
	1. 声明该属性的时候初始化
	2. 静态初始化块*/
	
	
	//练习：属性初始化 
	/*故意把初始化块，放在构造方法下面，问题：
	这三种方式，谁先执行？谁后执行？*/
	
	
	public String name = getName("属性声明"); 
     
    public  Obj10(){
        name = getName("构造方法");
    }
    {
        name = getName("初始化块");
    }
    
    public static String getName(String name){
    	System.out.println("初始化顺序："+name);
    	return name;
    }
	public static void main(String[] args) {
	   new Obj10();
		
	}
}
