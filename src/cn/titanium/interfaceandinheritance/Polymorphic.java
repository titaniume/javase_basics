package cn.titanium.interfaceandinheritance;

/**
 * 多态
 * @author Administrator
 *2017年10月11日下午6:43:16
 */
public class Polymorphic {
	
	public static void main(String[] args) {
		//1:操作符的多态
		/*同一个操作符在不同情境下，具备不同的作用
		如果+号两侧都是整型，那么+代表 数字相加
		如果+号两侧，任意一个是字符串，那么+代表字符串连接*/
		 int i = 5;
	     int j = 6;
	     int k = i+j; //如果+号两侧都是整型，那么+代表 数字相加
	     System.out.println(k);
	     
	     int a = 5;
         String b = "5";
         
         String c = a+b; //如果+号两侧，任意一个是字符串，那么+代表字符串连接
         System.out.println(c);
         
         //2:观察类的多态现象： 见:Item
         //3:类的多态条件
	     /*  要实现类的多态，需要如下条件
	         1. 父类（接口）引用指向子类对象
	         2. 调用的方法有重写
	         那么多态有什么作用呢？ 通过比较不使用多态与使用多态来进一步了解*/
         
         //4:类的多态-不使用多态 
	     /*如果不使用多态，
	             假设英雄要使用血瓶和魔瓶，就需要为Hero设计两个方法
         useLifePotion
         useMagicPotion
        public void useLifePotion(LifePotion lp){
        lp.effect();
    }
         */
         
         //5:类的多态-使用多态
         /*如果物品的种类特别多，那么就需要设计很多的方法
	         比如useArmor,useWeapon等等
	
	         这个时候采用多态来解决这个问题
	         设计一个方法叫做useItem，其参数类型是Item
	         如果是使用血瓶，调用该方法
	         如果是使用魔瓶，还是调用该方法
	         无论英雄要使用什么样的物品，只需要一个方法即可*/
         
        //练习-多态

		/*1. 设计一个接口
		接口叫做Mortal,其中有一个方法叫做die
		2. 实现接口
		分别让ADHero,APHero,ADAPHero这三个类，实现Motal接口，不同的类实现die方法的时候，都打印出不一样的字符串
		3. 为Hero类，添加一个方法,在这个方法中调用 m的die方法。
		 
		public void kill(Mortal m)
		 	
		4. 在主方法中
		首先实例化出一个Hero对象:盖伦
		然后实例化出3个对象，分别是ADHero,APHero,ADAPHero的实例
		然后让盖伦 kill 这3个对象*/
	         
         
	}
}	
