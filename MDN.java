package dz;

public class MDN {
    public static void main(String[] args) {
        int time;
        time = 0;
        for(int i=0; i<25;i++){
            if(time<=3 || time>21){
                System.out.println(time+" Night");
            }else if(time>3 && time<=11){
                System.out.println(time+" Morning");
            }else if(time>18 && time<22){
                System.out.println(time+" Evening");
            }
            else{
                System.out.println(time+" Day");
            }
            time++;

        }
    }
}
