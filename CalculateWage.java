public class CalculateWage {
    static int wage_per_hour = 20;  // Make static
    static int hours_per_day = 8;   // Make static

    public static void calcWage(int isPresent) {
        int wage_per_day = isPresent * wage_per_hour * hours_per_day;
        System.out.println("Wage per day is: " + wage_per_day);
    }
}
