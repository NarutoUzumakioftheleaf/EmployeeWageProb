public class CalculateWage {
    // Method to compute employee wage for a specific company
    public static void calcWage(String companyName, int wagePerHour, int maxHoursPerMonth, int maxWorkingDays) {
        int totalHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        System.out.println("Calculating wages for company: " + companyName);

        while (totalHours <= maxHoursPerMonth && totalWorkingDays < maxWorkingDays) {
            int isPresent = (int) (Math.random() * 10) % 3; // Random attendance
            int hoursWorked = getDailyHours(isPresent);

            totalWorkingDays++;
            int dailyWage = hoursWorked * wagePerHour;
            totalHours += hoursWorked;
            totalWage += dailyWage;

            System.out.println("Day " + totalWorkingDays + ": Hours Worked = " + hoursWorked + ", Daily Wage = " + dailyWage);
        }

        // Display total wage
        System.out.println("Total Wage for " + companyName + ": " + totalWage + "\n");
    }

    // Helper method to determine daily hours based on attendance
    private static int getDailyHours(int attendance) {
        switch (attendance) {
            case 0:
                System.out.println("Employee is Absent");
                return 0;
            case 1:
                System.out.println("Employee is Present Full-Time");
                return 8;
            case 2:
                System.out.println("Employee is Present Part-Time");
                return 4;
            default:
                System.out.println("Invalid Attendance");
                return 0;
        }
    }
}
