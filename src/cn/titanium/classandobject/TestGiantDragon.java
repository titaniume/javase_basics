package cn.titanium.classandobject;
public class TestGiantDragon {
 
    public static void main(String[] args) {
    	 System.out.println("饿汉式单例模式"); 
        //通过new实例化会报错
//      GiantDragon g = new GiantDragon();
         
        //只能通过getInstance得到对象
         
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();
         
        //都是同一个对象
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g1==g2);
        System.out.println(g1==g3);
        
        
        System.out.println("----------------");
        System.out.println("懒汉式单例模式"); 
        GiantDragon1 gd1 = GiantDragon1.getInstance();
        GiantDragon1 gd2 = GiantDragon1.getInstance();
        GiantDragon1 gd3 = GiantDragon1.getInstance();
         
        //都是同一个对象
        System.out.println(gd1);
        System.out.println(gd2);
        System.out.println(gd1==gd2);
        System.out.println(gd2==gd3);
        GiantDragon1.printxxx();
        /*注意： 懒汉式单例模式，调用其他方法的时候构造方法不会初始化，除非调用了实例方法getInstance()吃会实例化
                     饿汉式单例模式，调用其他方法的时候就会实例化*/
    }
}