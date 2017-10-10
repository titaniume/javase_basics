package cn.titanium.array;

/**
 * 二维数组
 * @author Administrator
 *2017年10月10日下午12:39:16
 */
public class Array06 {
	public static void main(String[] args) {
		/*这是一个一维数组, 里面的每一个元素，都是一个基本类型int 
		int a[] =new int[]{1,2,3,4,5};
		 	
		这是一个二维数组，里面的每一个元素，都是一个一维数组 
		所以二维数组又叫数组的数组 
		 
		int b[][] = new int[][]{
		   {1,2,3},
		   {4,5,6},
		   {7,8,9}
		};
		*/
		
	   //初始化二维数组
       int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
       a[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间
          
       //只分配了二维数组
       int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
       b[0]  =new int[3]; //必须事先分配长度，才可以访问
       b[0][2] = 5;
        
       //指定内容的同时，分配空间
       int[][] c = new int[][]{
               {1,2,4},
               {4,5},
               {6,7,8,9}
       };
       
       
       //练习：定义一个5X5的二维数组。 然后使用随机数填充该二维数组。找出这个二维数组里，最大的那个值，并打印出其二维坐标
       int [][] d = new int[5][5];
       // 初始化这个数组
       for (int i = 0; i < d.length; i++) {
		for (int j = 0; j < d[i].length; j++) {
			d[i][j]=(int) (Math.random() * 100);
		}
	}
       
		// 打印这个数组的内容：
		for (int[] row : d) {
			for (int each : row) {
				System.out.print(each + "\t");
			}
			System.out.println();
		}

		int max = -1;// 最大值
		// 最大值的坐标
		int target_i = -1;
		int target_j = -1;

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				if (d[i][j] > max) {
					max = d[i][j];
					target_i = i;
					target_j = j;
				}
			}
		}
   System.out.println("找出来最大的是:" + max);
   System.out.println("其坐标是[" + target_i + "][" + target_j + "]");

	 
	}
}
