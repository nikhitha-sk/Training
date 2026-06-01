// package DAY3;

class Patient{
    private String name;
    private int age;
    private String gender;
    private double weight, height, bmi;

    public void setName(String lcname){
        this.name = lcname;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
    
}

public class Health {

    public static void calculate(int age, double bmi){
        System.out.println("BODY AGE");
        if(bmi < 18.5) System.out.println(age+2);
        else if(bmi > 25) System.out.println(age+5);
        else System.out.println(age);
    }

    public static void calculate(double bmi, int age, String gender){
        System.out.println("Fat rate");
        if(gender.equals("male"))
            System.out.println((1.20 * bmi ) + (0.23 * age) - 16.2);
        else
            System.out.println((1.20 * bmi ) + (0.23 * age ) - 5.4);
    }

    public static void calculate(Patient obj){
        System.out.println(obj.getName()+" BMI");
        obj.setHeight(obj.getHeight() /100);
        obj.setBmi(obj.getWeight()/ (obj.getHeight() * obj.getHeight()));

        System.out.println(obj.getBmi());
        calculate(obj.getAge(), obj.getBmi());
        calculate(obj.getBmi() , obj.getAge() , obj.getGender());
    }
    
    public static void main(String[] args){
        Patient pat1 = new Patient();
        pat1.setName("nikhitha");
        pat1.setAge(20);
        pat1.setGender("female");
        pat1.setWeight(40.0);
        pat1.setHeight(158);

        Patient pat2 = new Patient();
        pat2.setName("ray");
        pat2.setAge(39);
        pat2.setGender("male");
        pat2.setWeight(68.0);
        pat2.setHeight(158);

        calculate(pat1);
        calculate(pat2);

    }
}

