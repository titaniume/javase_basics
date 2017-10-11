package cn.titanium.classandobject;

/**
 * 枚举类型
 * @author Administrator
 *2017年10月11日上午11:00:05
 */
public class Enum {
	
	public static void main(String[] args) {
		
		//1,预先定义的常量
		/*枚举enum是一种特殊的类(还是类)，使用枚举可以很方便的定义常量
		比如设计一个枚举类型 季节，里面有4种常量
		public enum Season {
		SPRING,SUMMER,AUTUMN,WINTER
		}
		一个常用的场合就是switch语句中，使用枚举来进行判断

		注：因为是常量，所以一般都是全大写
		*/
		Season season = Season.SPRING;
		switch (season) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
		//2,使用枚举的好处
		/*假设在使用switch的时候，不是使用枚举，而是使用int，而int的取值范围就不只是1-4，有可能取一个超出1-4之间的值，
		 这样判断结果就是是而非了。（因为只有4个季节） 但是使用枚举，就能把范围死死的限定在这四个当中
		SPRING,SUMMER,AUTUMN,WINTER,而不会出现奇怪的 第5季*/
		 
		
		//3,遍历枚举:--->借助增强型for循环，可以很方便的遍历一个枚举都有哪些常量
		for (Season s : Season.values()) {
			System.out.println(s);
		}
		
		//练习-枚举;
		/*英雄联盟中有这么一些分类
		TANK (坦克)
		WIZARD (法师 )
		ASSASSIN (刺客)
		ASSIST (辅助)
		WARRIOR (近战)
		RANGED (远程 )
		PUSH (推进)
		FARMING (打野)
		设计一个枚举类型HeroType,使用上述分类作为常量
		
		再编写一段switch语句，把每种枚举常量输出为中文字符串*/
		
		
		HeroType type = HeroType.ASSASSIN;
		switch (type) {
		case TANK:
			System.out.println("坦克");
			break;

		case WIZARD:
			System.out.println("法师");
			break;
		case ASSASSIN:
			System.out.println("刺客");
			break;
		case ASSIST:
			System.out.println("辅助");
			break;
		case WARRIOR:
			System.out.println("近战");
			break;
		case RANGED:
			System.out.println("远程战");
			break;
		case PUSH:
			System.out.println("推进");
			break;
		case FARMING:
			System.out.println("打野");
			break;
		}

	}

}
