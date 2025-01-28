import java.util.Scanner;
public class BMICalc{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter weight in kgs:");
        double weight=sc.nextDouble();
        System.out.print("Enter height in meters:");
        double height=sc.nextDouble();
        double BMI;
        BMI=weight/(height*height);
        System.out.println("Your BMI is:"+ BMI);
        if(BMI <=18.5){
            System.out.println("Underweight");
        }
        else if(BMI>=18.5 && BMI<=25){
            System.out.println("Normal");
        }
        else{
            System.out.println("Overweight");
        }

    }
}