package cn.titanium.classandobject;

public class Hero {
	
	public String name; //姓名
    
	public float hp; //血量
      
	public float armor; //护甲
      
	public int moveSpeed; //移动速度
	
	// 方法名和类名一样（包括大小写）
    // 没有返回类型
	public Hero(){
		 System.out.println("实例化一个对象的时候，必然调用构造方法");
	}
	
	//有参的构造方法
    //默认的无参的构造方法就失效了
	 //带一个参数的构造方法
  /*  public Hero(String heroname){  
        name = heroname;
    }
    
    //带两个参数的构造方法
    public Hero(String heroname,float herohp){
    	name =  heroname;
    	hp  =  herohp;
    }*/
    
    //打印内存中的虚拟地址
    public void showAddressInMemory(){
        System.out.println("打印this看到的虚拟地址："+this);
    }
    
    //参数名和属性名一样
    //在方法体中，只能访问到参数name
    public void setName1(String name){
        name = name;
    }
     
    //为了避免setName1中的问题，参数名不得不使用其他变量名
    public void setName2(String heroName){
        name = heroName;
    }
     
    //通过this访问属性
    public void setName3(String name){
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }
    
    
  //带一个参数的构造方法
    public Hero(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }
      
    //带两个参数的构造方法
    public Hero(String name,float hp){
        this(name); 
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }
 
   
   public static void main(String[] args) {
	  /* Hero garen =  new Hero("盖伦");  
       Hero teemo =  new Hero("提莫",383);*/
	   Hero garen =  new Hero();
       garen.name = "盖伦";
       //直接打印对象，会显示该对象在内存中的虚拟地址
       //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样

       System.out.println("打印对象看到的虚拟地址："+garen);
       //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
       garen.showAddressInMemory();
        
       Hero teemo =  new Hero();
       teemo.name = "提莫";
       System.out.println("打印对象看到的虚拟地址："+teemo);
       teemo.showAddressInMemory();
       
       Hero  h =new Hero();
       
       h.setName1("teemo");
       System.out.println(h.name);
        
       h.setName2("garen");
       System.out.println(h.name);     
        
       h.setName3("死歌");
       System.out.println(h.name);
       
       
       Hero teemo1 =  new Hero("提莫",383);
       
       System.out.println(teemo1.name);
      
   }   
     
	
	
}
