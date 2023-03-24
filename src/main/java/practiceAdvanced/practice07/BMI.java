package practiceAdvanced.practice07;

public class BMI {

    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public BMI() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateBMI(){

        double bmi = weight/ (height*height);
        System.out.println("BMI: " + bmi);
        if (bmi>0 && bmi<18.5){
            System.out.println("Weak");
        } else if (bmi<25){
            System.out.println("Normal");
        } else if (bmi<30){
            System.out.println("Fat");
        } else if (bmi>=30){
            System.out.println("Obese");
        } else {
            System.out.println("Invalid value");
        }

    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }


}
