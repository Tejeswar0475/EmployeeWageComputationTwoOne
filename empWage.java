package empWageDayTwoOne;

import java.util.Random;

class EmployeeWage
{

        public static void main(String[] args)
        {
            int present=1;
            int absent=0;

            System.out.println("Welcome to employee wage computation");
            Random random=new Random();
            int  randomNum=random.nextInt(2);
            if(randomNum == present)
            {
                System.out.println("Employee is present:"+randomNum);
            }
            else
            {
                System.out.println("Employee is absent:"+randomNum);
            }

        }
}
