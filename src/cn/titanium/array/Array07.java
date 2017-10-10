package cn.titanium.array;

import java.util.Arrays;

/**
 * Arrays
 * Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
 * @author Administrator
 *2017年10月10日下午12:49:15
 */
public class Array07 {
	public static void main(String[] args) {
		//1,数组复制
		/*与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
		不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
		除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。*/
		
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		 
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);
 
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        
        //2,转换为字符串
        /*如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
		但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容*/
        int [] c = new int[]{1,2,3,4,5,6,7,8,9,10};
        String contxt = Arrays.toString(c);
        System.out.println(contxt);
        
        //3,排序--> 选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能。
        int [] d = new int[]{666,2,100,269,335,999,10};
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(d));
        
        
        //4,搜索
        /*查询元素出现的位置
		需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
		如果数组中有多个相同的元素，查找结果是不确定的*/
        int e[] = new int[] { 18, 62, 68, 82, 65, 9 };
        
        Arrays.sort(a);
 
        System.out.println(Arrays.toString(e));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(e, 62));
        
        
        //判断是否相同-->比较两个数组的内容是否一样
        int f[] = new int[] { 18, 62, 68, 82, 65, 6 };
        int g[] = new int[] { 18, 62, 68, 82, 65, 2 };
        //第二个数组的最后一个元素是2，和第一个数组不一样，所以比较结果是false
        System.out.println(Arrays.equals(f, g));
        
        
        //填充-->使用同一个值，填充整个数组
        int []  h = new int[10];
        Arrays.fill(h, 5);
        System.out.println(Arrays.toString(h));
        
        
        
        //练习-二维数组排序
        /*首先定义一个5X8的二维数组，然后使用随机数填充满。
		借助Arrays的方法对二维数组进行排序。*/
        
        /*思路：
		  先把二维数组使用System.arraycopy进行数组复制到一个一维数组
		然后使用sort进行排序
		最后再复制回到二维数组。*/
        
        int [][] x = new int [5][8];
        for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j]=(int)(Math.random() * 100);
			}
		}
        
        System.out.println("打印二维数组");
        for (int[] i : x) {
            System.out.println(Arrays.toString(i));
        }
        
        // 把二维数组复制到一维数组
        int y[] = new int[x.length * x[0].length];
        for (int i = 0; i < x.length; i++) {
        	 System.arraycopy(x[i], 0, y, i * x[i].length, x[i].length);
		}
        
        // 对一维数组进行排序
        Arrays.sort(y);
        // 把一维数组复制到二维数组
        for (int i = 0; i < x.length; i++) {
            System.arraycopy(y, x[i].length * i, x[i], 0, x[i].length);
        }
        System.out.println("打印排序后的二维数组");
        for (int[] i : x) {
            System.out.println(Arrays.toString(i));
        }
	}
}
