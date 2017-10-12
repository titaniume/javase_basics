package cn.titanium.interfaceandinheritance.comprehensive;

public class Fish extends Animal implements Pet {
	
	private String name;
	protected Fish(int legs) {
		super(0);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name=name;

	}

	@Override
	public void play() {
		System.out.println("鱼正在水里面玩耍");

	}

	@Override
	public void eat() {
		System.out.println("鱼正在吃小虾米");

	}

	@Override
	public void walk() {
		System.out.println("在游泳");
	}
	
	

}
