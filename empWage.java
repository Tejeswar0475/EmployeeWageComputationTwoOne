package empWageDayTwoOne;

import java.util.Random;

class EmployeeWage
{

	public static void main(String[] args)
	{
		int fullTimePresent=2;
		int partTimePresent=1;
		int absent=0;
		int wagePerHour=20;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;

		System.out.println("Welcome to employee wage computation");
		Random random=new Random();
		int randomNum=random.nextInt(3);
		if(randomNum == fullTimePresent)
		{
			System.out.println("Employee is present full time:"+randomNum);
       	     		dailyEmpWage=fullTimeHour*wagePerHour;
             		System.out.println("Daily Emp wage:" +dailyEmpWage);
	    	}
            	else if(randomNum == partTimePresent )
            	{
                	System.out.println("Employee is present half time:"+randomNum);
	    		dailyEmpWage=partTimeHour*wagePerHour;
	    		System.out.println("Daily Emp Wage:"+dailyEmpWage);
	    	}
	    	else
	    	{
			System.out.println("Employee is absent:"+randomNum);
        		dailyEmpWage=absent*wagePerHour;
	      		System.out.println("Employee is absent:" +dailyEmpWage);
		}
        }
}
