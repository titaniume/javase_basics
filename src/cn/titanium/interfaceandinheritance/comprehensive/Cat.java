package cn.titanium.interfaceandinheritance.comprehensive;

/**
 * 子类--猫  同时可以作为宠物
 * @author Administrator
 *2017年10月12日下午5:29:22
 */
public class Cat extends Animal implements Pet {
	
	private String name;
	
	
	
	public Cat(String name){
		super(4);
		this.name=name;
	}
	
	public Cat(){
		this(" ");
	}
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;

	}

	@Override
	public void play() {
		System.out.println("猫正在和主人玩耍");

	}

	@Override
	public void eat() {
		System.out.println("猫在偷鱼吃");

	}

}
