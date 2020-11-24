package empWageDayTwoOne;

import java.util.Random;

class EmployeeWage
{

	int getEmpWage(int randomNumber,int partTimeHour,int fullTimeHour,int wagePerHour,int absent)
	{
		int temp=randomNumber;
		int tempWage=0;
		switch(temp)
		{
		case 1:
			int partTimeWage=partTimeHour*wagePerHour;
    			tempWage=partTimeWage;
    			break;
    		case 2:
    			int fullTimeWage=fullTimeHour*wagePerHour;
    			tempWage=fullTimeWage;
    			break;
    		default:
    			tempWage=absent;
    		}

		return tempWage;
	}

	int getEmpHoursMethod(int randomNumber,int partTimeHour,int fullTimeHour,int absent)
	{
		 int tempHour=0;
		 switch(randomNumber)
	    	{
	    		case 1:
	    			tempHour=partTimeHour;
	    			break;
	    		case 2:
	    			tempHour=fullTimeHour;
	    			break;
	    		default:
	    			tempHour=absent;
	    	}

			return tempHour;
	 }



        public static void main(String[] args)
        {
		int fullTimePresent=2;
		int partTimePresent=1;
		int absent=0;
		int wagePerHour=20;
		int fullTimeHour=8;
		int partTimeHour=4;
		int dailyEmpWage=0;
		int workingDayPerMonth=20;
		int counter=0;
	        int totalWorkingDays=20;
	        int tempWage=0;
		int maxHoursInMonth=100;
	        int totalEmpHours=0;
	        int empHours=0;
	        int totalEmpWage=0;
	        int getWage=0;

		EmployeeWage emp=new EmployeeWage();
	        System.out.println("Welcome to employee wage computation");
		while( counter != workingDayPerMonth )
	        {
	        	Random random=new Random();
	                System.out.println("Day   Wage");
	                for(int i=1; i<=totalWorkingDays; i++)
	                {
	                	int randomNum=random.nextInt(3);
	                    	int wagesOfEmployee=emp.getEmpWage(randomNum, partTimeHour, fullTimeHour, wagePerHour, absent);
	                    	System.out.println("Day["+i+"]-"+wagesOfEmployee);
	                    	totalEmpHours= totalEmpHours + emp.getEmpHoursMethod(randomNum,partTimeHour,fullTimeHour,absent);
	                    	System.out.println("Total Hours worked in month:"+totalEmpHours);

	                    	getWage=emp.getEmpWage(randomNum, partTimeHour, fullTimeHour, wagePerHour, absent);
	                    	totalEmpWage=(totalEmpWage+getWage);
		                System.out.println("Total Salary per month according to employee attendace:" +totalEmpWage);
				counter++;
	                 }

        	}
	}
}
