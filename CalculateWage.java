public class CalculateWage {
    static int wage_per_hour = 20;  // Make static
    static int hours_per_day = 8;   // Make static
    static int working_days_per_month=20;
    public static void calcWage(int isPresent) {
        if(isPresent==2)
            hours_per_day=4;
        else if(isPresent==0)
            hours_per_day=0;
        int wage_per_day = wage_per_hour * hours_per_day;
        int wage_per_month=wage_per_day*working_days_per_month;
        System.out.println("Wage per day is: " + wage_per_day);
        System.out.println("Wage per month is:"+ wage_per_month);
    }
}
