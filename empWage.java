package empWageDayTwoOne;

import java.util.Random;

class EmpWage {
    public static final int maxHrsInMonth=100;
    public static final int noOfWorkDay=20;
    public static final int empRatePerHr=20;
    public static final int isPartTime=1;
    public static final int isFullTime=2;
    public static int empHrs = 0;
    public static int totalEmpHrs = 0;
    public static int totalWorkDay=0;
    public static int totalEmpWage=0;
    public static void main(String arg[]) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        wageComputation();
    }
    public static void wageComputation(){
        while( totalWorkDay < noOfWorkDay && totalEmpHrs <= maxHrsInMonth ) {
            int employee = (int) ((Math.random() * 10) % 3);
            switch (employee) {
                case isPartTime:
                    empHrs = 4;
                    break;
                case isFullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkDay++;
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Employee days:" + totalWorkDay + " Work Hours:" + totalEmpHrs);
        }
    totalEmpWage = ( totalEmpHrs * empRatePerHr );
    System.out.println("Employee Total Salary is :"+ totalEmpWage);
    }
}
