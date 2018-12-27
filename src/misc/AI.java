package misc;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class AI {

	
	public void busy(int time) throws AWTException
	{
		Robot hal= new Robot();
		Random random=new Random();
		SimpleDateFormat df = new SimpleDateFormat("HH:mm");
		Calendar time1= Calendar.getInstance();
		Calendar time2=Calendar.getInstance();
		String oldtime=String.valueOf(df.format(time2.getTime()));
		System.out.println("Time "+oldtime);
		time1.add(Calendar.MINUTE, time);
		String newtime=String.valueOf(df.format(time1.getTime()));
		System.out.println("Time "+newtime);
		
		
		while(!oldtime.matches(newtime))
		{
			int i=0;
			i++;
			oldtime=String.valueOf(df.format(time2.getTime()));
			System.out.println("Time before 1 min " + oldtime);
			hal.delay(1000*60);
			time2.add(Calendar.MINUTE, i);
			oldtime=String.valueOf(df.format(time2.getTime()));
			System.out.println("Time after 1 min " + oldtime);
			int x=random.nextInt()%640;
			int y=random.nextInt()%480;
			hal.mouseMove(x,y);
			System.out.println("Move");				
			
		}
		System.out.println("Up Now");
		
		
	}
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		AI a=new AI();
		a.busy(450);

	}

}
