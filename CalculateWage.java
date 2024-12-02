public class CalculateWage {
    static int wage_per_hour = 20;  // Make static
    static int hours_per_day = 8;   // Make static

    public static void calcWage(int isPresent) {
        if(isPresent==2)
            hours_per_day=4;
        else if(isPresent==0)
            hours_per_day=0;
        int wage_per_day = wage_per_hour * hours_per_day;
        System.out.println("Wage per day is: " + wage_per_day);
    }
}
