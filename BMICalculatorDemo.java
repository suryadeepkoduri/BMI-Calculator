import java.text.DecimalFormat;
import java.util.*;

public class BMICalculatorDemo {
    public static void main(String[] args) {
        double height, weight;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Weight in KG: ");
            weight = sc.nextDouble();
            System.out.print("Enter height in feet: ");
            height = sc.nextDouble();
        }

        BMICalculator bmi0 = new BMICalculator(weight,height);
        
        double bmi = bmi0.calculate_bmi(bmi0);

        System.out.println();
        System.out.println();

        //For formating the BMI so the output is tidy 
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        System.out.println("BMI : "+ numberFormat.format(bmi));

        bmi0.bmi_range(bmi);
        System.out.println();
    }
}
