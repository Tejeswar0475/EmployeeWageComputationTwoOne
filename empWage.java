package empWageDayTwoOne;

import java.util.Random;

class EmployeeWage
{

	public static void main(String[] args)
	{
        	int present=1;
         	int absent=0;
		int wagePerHour=20;
		int fullTimeHour=8;
		int empWorkHour;

		System.out.println("Welcome to employee wage computation");
		Random random=new Random();
		int  randomNum=random.nextInt(2);
		if(randomNum == present)
            	{
			empWorkHour=8;
                	System.out.println("Employee is present:"+randomNum);
            	}
            	else
            	{
			empWorkHour=0;
			System.out.println("Employee is absent:"+randomNum);
		}
		int dailyEmpWage=empWorkHour*wagePerHour;
		System.out.println("Daily Emp Wage:"+dailyEmpWage);

        }
}
