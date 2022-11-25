package team7;
public class Bus extends Main{
    int max_guest = 30;//최대승객
    int current_guest;//현재승객
    int amount;//요금
    static int num;//버스번호
    boolean state;//상태 true운행false차고지행
    int busnum;

    public Bus(int current_guest,int gas, int current_speed){
        num += 1;
        busnum = num;
        this.current_guest = current_guest;
        this.gas = gas;
        this.state = true;
        this.speed = current_speed;
    }

    public void test(){
        System.out.println(busnum);
        System.out.println(gas);
    }
    //상태변경
    public void stateChange(String state){
        if(state.equals("차고지행")){
            this.state = false;
            System.out.println("상태  :  " + "차고지행");
        }
        if(state.equals("운행중")){
            this.state = true;
            System.out.println("현재속도  :  " + speed);
            System.out.println("상태  :  " + "운행중");
        }


    }
    //승객탑승
    public void getonBus(int guest){
        current_guest += guest;
        if(gas <= 0){
            state = false;
            System.out.println("주유량  :  " + gas);
            System.out.println("상태  :  " + "차고지행");
            current_guest = 0;
            return;
        }

        if(gas <= 10){
            System.out.println("주유량  :  " + gas);
            System.out.println("주유가필요합니다!");
        }
        if(max_guest < current_guest){
            System.out.println("탑승인원초과");
            current_guest = 0;
        }else{
            System.out.println("현재속도  :  " + speed);
            System.out.println("탑승 승객 수  :  " + current_guest);
            System.out.println("잔여 승객 수  :  " + (max_guest -current_guest));
            System.out.println("요 금  :  " + (guest * 1000));
        }



    }
    //주유량변경
    public void gasStatus(int a){
        gas += a;
        if(gas <= 0){
            state = false;
            System.out.println("주유량  :  " + gas);
            System.out.println("상태  :  " + "차고지행");
            return;
        }
        if(gas <= 10){
            System.out.println("주유량  :  " + gas);
            System.out.println("주유가필요합니다!");
            return;
        }
        System.out.println("주유량  :  " + gas);
        if(state == false){
            System.out.println("상태  :  " + "차고지행");
        }else{
            System.out.println("상태  :  " + "운행중");
        }


    }

    public void speedChange(int speed){
        speed += speed;
        System.out.println("현재속도  :  " + speed);
    }






}
