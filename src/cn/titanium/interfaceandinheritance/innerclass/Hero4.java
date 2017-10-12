package cn.titanium.interfaceandinheritance.innerclass;

/**
 * 本地类
 * @author Administrator
 *2017年10月12日下午4:33:18
 */
public abstract class Hero4 {
	String name; //姓名
    
    float hp; //血量
          
    float armor; //护甲
          
    int moveSpeed; //移动速度
      
    public abstract void attack();
    
    public static void main(String[] args) {
		//与匿名类的区别在于，本地类有了定义的类名
    	class SomeHero extends Hero4{
    		public void attack(){
    			System.out.println(name + "新的攻击手段！");
    		}
    	}
    	
    	SomeHero sh = new SomeHero();
    	sh.name="占卜师";
    	sh.attack();
	}
}
