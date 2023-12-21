package BusinessLayer;
import java.util.Random;
public class Sword extends Weapon{
    public double attackType1(){

        return 1;
    }
    public double attackType2(){
        Random random=new Random();
        int chanceOfLosing=random.nextInt(4);
        if(chanceOfLosing==0){
            return 0;}
            else{
                return 2;
            }
        }



}
