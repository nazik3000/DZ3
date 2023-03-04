package dz;

public class PearNotPear 
{
    public static void main( String[] args ){
       int x,y;
       x= 0;
       y=2;

       
        for(int i=0;i<10;i++){
            if(x % 2 == 0 && y % 2 == 0){
                System.out.println("Your numbers are:" + " Pear \n" + x + " and "+ y);
            }else if(x % 2 !=0 && y % 2 != 0){
                System.out.println("Your numbers are:"+ " Not Pear\n" + x + " and " + y);
            }else if(x % 2 !=0 && y % 2 == 0){
                System.out.println(y+" : are pear\n"+ x+" : are not pear");}
             else if(x % 2 ==0 && y % 2 != 0){
                System.out.println(x+" : are pear\n"+ y+" : are not pear");}

            x=x+2;
            y++;
        }
    }
}
