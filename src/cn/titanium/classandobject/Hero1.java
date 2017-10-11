package cn.titanium.classandobject;

/**
 * 属性初始化
 * @author Administrator
 *2017年10月11日上午9:55:32
 */
public class Hero1 {
	public String name = "some hero"; // 声明该属性的时候初始化
	protected float hp;
	float maxHP;

	{
		maxHP = 200; // 初始化块
	}

/*	public Hero1() {
		hp = 100; // 构造方法中初始化
		System.out.println(hp);

	}*/
	
	
	//物品栏的容量
    public static int itemCapacity=8; //声明的时候初始化
     
    static{
        itemCapacity = 6;//静态初始化块块初始化
    }
     
    public Hero1(){
    	
    }
    
    public static Hero1 instace = new Hero1();
    
    public static Hero1 getInstace(Hero1 instace){
    	return  instace;
    }
    
	
	public static void main(String[] args) {
		Hero1 h1 = new Hero1();
		System.out.println(h1.name);
		System.out.println(h1.maxHP);
		System.out.println(Hero1.itemCapacity);
	}
}
