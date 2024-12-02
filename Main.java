//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Employee" +
                "Wage Computation");

        int isPresent=(int)(Math.random()*10)%3;
        switch(isPresent){
            case 0-> System.out.println("Employee is absent") ;
            case 1-> System.out.println("Employee is present full Time");
            case 2-> System.out.println("Employee is present part-time");
            default-> System.out.println("Something wrong!");
        }
        CalculateWage.calcWage(isPresent);//as calcWage is defined static so no need to do instance method



    }
}