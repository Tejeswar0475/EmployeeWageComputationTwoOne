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

		switch(randomNum)
		{
			case 1:
				int partTimeWage=(partTimeHour*wagePerHour);
				System.out.println("Part Time Employee "+partTimeWage);
				break;
			case 2:
				int fullTimeWage=(fullTimeHour*wagePerHour);
				System.out.println("Full Time Employee "+fullTimeWage);
				break;
			default:
				System.out.println("Absent "+absent);
		}
        }
}


