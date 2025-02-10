class Vehicle
{
    int maxspeed=120;
}
class Car extends Vehicle
        {
            int maxspeed=180;
            void display()
        {
            System.out.println("maximum speed="+ super.maxspeed);

        }
        }
public class SuperExample {
    public static void main(String[] args)
    {
        Car c1=new Car();
        c1.display();

    }

}
