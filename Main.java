package team7;
public class Main {
    int gas;//주유량
    int speed;//현재속도

    public static void main(String[] args) {
        Taxi taxi1 = new Taxi(50);


        System.out.println("------------");
        taxi1.getonTaxi(4,"호계동", 10);
        System.out.println("------------");
        taxi1.Gas(-30);
        System.out.println("------------");
        taxi1.Calculation();
        System.out.println("------------");
        taxi1.speedChange(10);
        System.out.println("------------");
        taxi1.getonTaxi(5,"aa",4);
        System.out.println("------------");
        taxi1.getonTaxi(3,"부산",100);
        System.out.println("------------");
        taxi1.Gas(100);
        System.out.println("------------");
        taxi1.Calculation();




    }
}
