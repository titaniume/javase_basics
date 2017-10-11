package cn.titanium.classandobject.inherit;

/**
 * 物品类
 * @author Administrator
 *2017年10月10日下午6:42:26
 */
public class Item {
	 String name;
	 int price;
	 
	 public Item(){
		 
	 }
	 
	 public static Item instace = null;
	 
	 public static Item getInstance(Item instace ){
		 
		 if(null == instace){
			 instace = new Item();
		 }
		 return instace;
	 }
}
