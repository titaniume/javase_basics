package cn.titanium.classandobject;

/**
 * 引用
 * @author Administrator
 *2017年10月10日下午5:22:37
 */
public class Obj1 {
	public static void main(String[] args) {
		
	/*引用的概念，如果一个变量是类类型，而非基本类型，那么该变量叫做引用*/
	//1,引用和指向
	/*
	new Hero();
	代表创建了一个Hero对象
	但是也仅仅是创建了一个对象，没有办法访问它
	为了访问这个对象，会使用引用来代表这个对象
	Hero h = new Hero();
	h这个变量是Hero类型，又叫做引用
	=的意思指的h这个引用代表右侧创建的对象
	“代表” 在面向对象里，又叫做“指向”*/
		//创建一个对象
		new Hero();
		//使用一个引用来指向这个对象
		Hero h = new Hero();
		
	//2,多个引用，一个对象
	//使用一个引用指向这个对象
    /*引用有多个，但是对象只有一个。
	在这个例子里，所有引用都指向了同一个对象。
	对象就像 "房产"， 引用就像"房产证"
	房产证的复印件可以有多张，但是真正的"房产" 只有这么一处*/
	Hero h1 = new Hero();
	Hero h2 = h1; //h2指向h1所指向的对象 new Hero();
	Hero h3=  h1; 
	Hero h4 = h1;
	Hero h5 = h1;
	
    //3,一个引用，多个对象
	/*第40行，引用garen指向新创建的对象（对象1）
	第41行，同一个引用garen指向新创建的对象（对象2）
	这个时候，对象1，就没有任何引用指向了
	换句话说，就没有任何手段控制和访问该对象，那么该对象就变得没有意义。*/
	Hero garen = new Hero();
	garen = new Hero();
	
	//练习：-引用
	/*如代码，问题:h9所指向的对象和h7所指向的对象，是否是同一个对象？*/
	Hero h6 = new Hero();
	Hero h7 = new Hero();
	Hero h8;
	Hero h9;
	h8=h6;
	h9=h8;
	
	/*h9指向h8，最终间接指向了对象对象一,而h7指向的是对象二，所以h9和h7不是同一个引用*/
	}
}
