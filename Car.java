package Interface;

public class Car implements I1,I2{

    public void start(){
        System.out.println("Engine has started now...");
    }

    public void stop(){
        System.out.println("Car has stoped");
    }
}
