public class BMICalculator {
    
    double weight, height;

    BMICalculator(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    BMICalculator() {
        weight = 0;
        height = 0;
    }
    
    double calculate_bmi(BMICalculator o) {
        double converted_height = o.height*0.3048;
        return (weight/(converted_height*converted_height));
    }

    void bmi_range(double bmi) {
        if(bmi<18.5)
            System.out.println("You are 'Under Weight' according to your BMI");
        else if(bmi<=24.9)
            System.out.println("You are in 'Healthy Weight' range according to your BMI");
        else if(bmi<=29.9)
            System.out.println("You are 'Over Weight' according to your BMI");
        else if(bmi>=30)
            System.out.println("You are 'Obese' according to your BMI");
    }
}