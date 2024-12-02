public class CalculateWage {
    static int wage_per_hour = 20;  // Make static
    static int Max_hours_per_month = 100;
    static int hours_per_day=8;// Make static
    static int Max_working_days=20;
    static int working_days_per_month=20;
    public static void calcWage() {

        int totalHrs=0,totalWorking_days=0,totalWage=0;
        while(totalHrs<=Max_hours_per_month&&totalWorking_days<=Max_working_days){
            int isPresent=(int)(Math.random()*10)%3;
            switch(isPresent){
                case 0-> System.out.println("Employee is absent") ;
                case 1-> System.out.println("Employee is present full Time");
                case 2-> System.out.println("Employee is present part-time");
                default-> System.out.println("Something wrong!");
            }
            if(isPresent==2)
                hours_per_day=4;
            else if(isPresent==0)
                hours_per_day=0;
            else hours_per_day=8;
            totalWorking_days++;
            System.out.println("Day " + totalWorking_days +" wage is"+hours_per_day*wage_per_hour);
            totalHrs+=hours_per_day;
            totalWage+=hours_per_day*wage_per_hour;
        }
        System.out.println("Total Wage is :"+totalWage);

    }
}
