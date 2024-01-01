public class TestCar {


    public static void main(String[] args) {

        Car c=new Car(2020,"Honda");

        c.year=2021;
        c.print();


    }



}

class Car{

    protected int year;
    private String model;

    public Car(int year, String model) {
        super();
        this.year = year;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    protected  void print(){

        System.out.println("TestCar[year= " + this.year + ", model= " + this.model + "]");
    }
}