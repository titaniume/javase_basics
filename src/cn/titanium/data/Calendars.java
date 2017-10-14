package cn.titanium.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author Administrator
 *2017年10月14日下午4:28:29
 */
public class Calendars {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		/*Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久*/
		//1:Calendar与Date进行转换
		/*采用单例模式获取日历对象Calendar.getInstance();*/
		
		 //采用单例模式获取日历对象Calendar.getInstance();
         Calendar c = Calendar.getInstance();
         Date d =c.getTime();
         Date d2 = new Date(0);
         c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
         
         //2:翻日历
         Calendar c1 = Calendar.getInstance();
         Date now = c1.getTime();
         // 当前日期
         System.out.println("当前日期：\t" + Format(c1.getTime()));
         
         // 下个月的今天
         c1.setTime(now);
         c1.add(Calendar.MONTH, 1);
         System.out.println("下个月的今天:\t" +Format(c1.getTime()));
         
         // 去年的今天
         c1.setTime(now);
         c1.add(Calendar.YEAR, -1);
         System.out.println("去年的今天:\t" +Format(c1.getTime()));
         
         // 上个月的第三天
         c1.setTime(now);
         c1.add(Calendar.MONTH, -1);
         c1.set(Calendar.DATE, 3);
         System.out.println("上个月的第三天:\t" +Format(c1.getTime()));
         
         
         //练习-Calendar
         /*找出下个月的倒数第3天是哪天*/
         
         Calendar c2 = Calendar.getInstance();
         
         System.out.println("今天是:" + Format( c2.getTime()));
         //先翻到下下个月 
         c2.add(Calendar.MONTH,2);
         //设置到月初
         c2.set(Calendar.DATE,1);
         //再往回翻3天
         c2.add(Calendar.DATE,-3);
         Exception e;
         System.out.println("下个月倒数第三天是:" + Format(c2.getTime()));
  
	}

	private static String Format(Date time) {
		// TODO Auto-generated method stub
		 return sdf.format(time);
	}
}
