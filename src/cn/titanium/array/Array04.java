package cn.titanium.array;


/**
 *增强for循环
 * 注：增强型for循环只能用来取值，却不能用来修改数组里的值
 * @author Administrator
 *2017年10月10日上午11:58:05
 */
public class Array04 {
	public static void main(String[] args) {
		int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.print(each+" ");
        }
        System.out.println();
         
        //增强型for循环遍历
        for (int each : values) {
            System.out.print(each+" ");
        }
        System.out.println();
        
        
        //练习:填充随机数用增强for找出最大的数和最小的数
        int [] a =  new int[10];
        for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()  * 100);
		}
        for (int i : a) {
        	System.out.print(i+" ");
		}
        int max,min;
        max=min= a[0];
        for (int i : a) {
			if(i > max){
				max= i;
			}
			if(i < min){
				max= i;
			}
		}
        System.out.println();
        System.out.println("最大的一个值是:"+max);
        System.out.println("最小的一个值是:"+min);
       
     
	}
}
