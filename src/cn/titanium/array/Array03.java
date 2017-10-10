package cn.titanium.array;

/**
 * 数组排序
 * @author Administrator
 *
 */
public class Array03 {
	public static void main(String[] args) {
		//1,选择排序法
		/*选择法排序的思路： 
		把第一位和其他所有的进行比较 ，只要比第一位小的，就换到第一个位置来 
		比较完后，第一位就是最小的 
		然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来 
		比较完后，第二位就是第二小的 
		以此类推*/
		int [] a = new int[]{96,31,24,16,200,6,64};
		int [] b = new int[]{166,32,188,298,19,2,55};
		//排序前，把内容打印出来
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		 System.out.println(" ");
        //第一步： 把第一位和其他所有位进行比较
        //如果发现其他位置的数据比第一位小，就进行交换
		for (int i = 0; i < a.length; i++) {
			if(a[i]<a[0]){
				//中间变量进行交交换
				int temp = a[0];
				a[0]=a[i];
				a[i]=temp;
			}
		}
		//把内容打印出来
        //可以发现，最小的一个数，到了最前面
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	   //第二步： 把第二位的和剩下的所有位进行比较
	   for (int i = 1; i < a.length; i++) {
            if(a[i]<a[1]){   
                int temp = a[1];
                a[1] = a[i];
                a[i] = temp;
            }
        }
        //把内容打印出来
        //可以发现，倒数第二小的数，到了第二个位置
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" "); 
        
        //可以发现一个规律
        //移动的位置是从0 逐渐增加的
        //所以可以在外面套一层循环
        for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[i]){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
        //把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");  
        
        
        System.out.println("--------------------------");
        //冒泡排序法
        /*冒泡法排序的思路： 
		第一步：从第一位开始，把相邻两位进行比较 
		如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的 
		第二步： 再来一次，只不过不用比较最后一位 
		以此类推*/
        //第一步：从第一位开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就把大的数据交换在后面
        for (int i = 0; i < b.length-1; i++) {
            if(b[i]>b[i+1]){   
                int temp = b[i+1];
                b[i+1]= b[i];
                b[i] = temp;
            }
        }
        //把内容打印出来
        //可以发现，最大的到了最后面
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
      //可以发现，倒数第二大的到了倒数第二个位置
        for (int i = 0; i < b.length-2; i++) {
            if(b[i]>b[i+1]){   
                int temp = b[i+1];
                b[i+1]= b[i];
                b[i] = temp;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //把内容打印出来
        //可以发现，最大的到了最后面
        for (int j = 0; j < b.length; j++) {
        	  for (int i = 0; i < b.length-1-j; i++) {
                  if(b[i]>b[i+1]){   
                      int temp = b[i+1];
                      b[i+1]= b[i];
                      b[i] = temp;
                  }
              }
        }
        //把内容打印出来
        //可以发现，最大的到了最后面
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        
       //练习：冒泡排序，首先创建一个长度是5的数组,并填充随机
       //首先用选择法正排序，然后再对其使用冒泡法倒排序从小到大(正序) 从大到小(倒叙)
        
        int [] c = new int[5];
        for (int i = 0; i < c.length; i++) {
			c[i]=(int)(Math.random()*100);
		}
        // 排序前，先把内容打印出来
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(" ");
        // 选择法正排序
        for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[j]<c[i]){
					int temp =c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
        System.out.println("选择排序：");
        for (int i = 0; i < c.length; i++) {
        	
			System.out.print(c[i]+" ");
		}
        System.out.println();
        
        // 冒泡法倒排序
        for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length-1-i; j++) {
				if(c[j]<c[j+1]){
					int temp = c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
        System.out.println("冒泡排序倒叙：");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println(" ");
        
        
       
        for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length-1-i; j++) {
				//把这个判断符合改变即可改变为倒叙或者正序
				if(c[j]>c[j+1]){
					int temp = c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
        System.out.println("冒泡排序正序：");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
  
        System.out.println(" ");
	}
}
