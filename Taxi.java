package team7;
public class Taxi extends Main{
    static int num;//택시번호
    int taxinum;

    int rateFare = 4000;//기본요금
    int fare = 0;//요금
    String destination;//목적지
    int distance = 3;//기본거리
    int targetDistance;//목적지까지거리
    int state = 0;//상태 0일반 1운행중 2운행불가.
    int totalfare = 0;//수익

    String strstate;

    public Taxi(int gas){
        num += 1;
        taxinum = num;
        state = 0;
        speed = 20;
        this.gas = gas;
        System.out.println("택시번호 :  " + taxinum);
        System.out.println("주유량   :  " + gas);
        if(this.gas < 10){
            System.out.println("주유량이 부족해 운행이 불가능합니다.");
            state = 2;
            System.out.println("상태    :  " + "운행불가");
            return;
        }
        System.out.println("상태    :  " + "일반");
        System.out.println("속도    :  " + speed);
    }
    //대기
    public void run(){
        System.out.println("총수익    :  " + totalfare);
        strstate = (state == 0) ? "일반" : "운행불가";
        System.out.println("주유량  :  " + gas);
        System.out.println("상태  :  " + strstate);
    }
    //승객탑승
    public void getonTaxi(int passenger, String destination, int targetDistance){
        if(state != 0){
            System.out.println("운행이불가능합니다.");
            return;
        }
        if(passenger > 4){
            System.out.println("탑승승객수초과 4명까지만 탑승가능합니다.");
            run();
            return;
        }
        state = 1;
        System.out.println("목적지  :  " + destination);
        System.out.println("목적지까지거리  :  " + targetDistance + "km");
        fare = (targetDistance <= distance)? rateFare : rateFare + (targetDistance - distance) * 1000;
        System.out.println("상태  :  " + "운행중");
    }
    //주유량변경
    public void Gas(int gas){
        this.gas += gas;
        System.out.println("주유량  :  " + this.gas);
        state = (gas >= 10) ? 0 : 2;
    }
    //계산?
    public void Calculation(){
        totalfare += fare;
        System.out.println("요금계산 :  " + fare);
        if(gas < 10){
            state = 2;
        }else{
            state = 0;
        }
        System.out.println("---대기");
        run();
    }

    public void speedChange(int speed){
        this.speed += speed;
        if(this.speed < 0){
            this.speed = 0;
        }
        System.out.println("현재속도  :  " + this.speed);
    }



}
