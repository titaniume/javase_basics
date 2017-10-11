package cn.titanium.interfaceandinheritance.object;

import cn.titanium.interfaceandinheritance.Object;

/**
 * 默认继承Object类
 * @author Administrator
 *2017年10月12日上午1:04:35
 */
public class Hero extends Object {
    
  String name; //姓名
      
  float hp; //血量
      
  float armor; //护甲
      
  int moveSpeed; //移动速度
   

   
  public Hero(){
      System.out.println("Hero的无参的构造方法 ");
  }
   
  public Hero(String name){
      System.out.println("Hero的有一个参数的构造方法 ");
      this.name = name;
  }
  
  public String toString(){
	  return name;
  }
  
  public void  finalize(){
	  	System.out.println("这个英雄正在被回收");
  }
  
  public boolean equals(Object o){
	  if(o instanceof  Hero){
		  Hero h = (Hero)o;
		  return this.hp == h.hp;
	  }
	  return false;
  }
   
  public static void main(String[] args) {
      new Hero();
      Hero h =  new Hero();
      h.name="亚索";
      System.out.println(h.toString());
      //直接打印对就是打印该对象的tostring()返回值
      System.out.println(h);
      
      //只有一引用
      Hero ho;
      for (int i = 0; i < 100000; i++) {
    	  //不断生成新的对象
          //每创建一个对象，前一个对象，就没有引用指向了
          //那些对象，就满足垃圾回收的条件
          //当，垃圾堆积的比较多的时候，就会触发垃圾回收
          //一旦这个对象被回收，它的finalize()方法就会被调用
          h = new Hero();
	}
      
	  Hero h1= new Hero();
	  h1.hp = 300;
	  Hero h2= new Hero();
	  h2.hp = 400;
	  Hero h3= new Hero();
	  h3.hp = 300;
	   
	  System.out.println(h1.equals(h2));
	  System.out.println(h1.equals(h3));
	  
	  
      System.out.println(h1==h2);
      System.out.println(h1==h3);
  }
}
