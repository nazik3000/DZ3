package dz;

public class WorkTime {
    public static void main(String[] args) {
        
        int time;
        time = 0;
        for(int i=0; i<25;i++){
            if(time<=7){
                System.out.println(time+" Not worktime");
            }else if(time>7 && time<=18){
                System.out.println(time+" Work time");
            }else{
                System.out.println(time+" Not work time");
            }
            time++;

        }
    }
}
