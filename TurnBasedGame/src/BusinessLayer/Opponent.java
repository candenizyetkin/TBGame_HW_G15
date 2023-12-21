package BusinessLayer;
import java.util.Random;
public abstract class Opponent extends Member{
    private double point;
    private double attack;
    private double speed;
    private boolean guard=false;

    public final double MAXPOINTSFOROPPONENTS = 150;

public Opponent(){
        point = RandomPointsAssignment();
        speed = RandomSpeedAssignment();
        attack = RandomAttackAssignment();
    }
    private int opponentId;
    public double RandomPointsAssignment(){
        Random random = new Random();
        return random.nextInt(101) + 50;

    };
    public double RandomSpeedAssignment(){
        Random random = new Random();
        return random.nextInt(91);
    };
    public double RandomAttackAssignment(){
        Random random = new Random();
        return random.nextInt(21) + 5;
    }


    public void attack(Human target){
        if (target.isGuard() ){
            target.setPoint(target.getPoint()-this.attack*0.25);
        }
        else{
            target.setPoint(target.getPoint()-this.attack);
        }

    }


    //ödevde special güçlerin kendi adları var direkt bütün oppponent sınıfları için ayrı isimlerle yazıyorum
    //public abstract void special(Human HumanBeingAttacked);

    public boolean isGuard() {
        return guard;
    }
    public void guard(){
        this.guard=true;
    }

    public double getAttack() {
        return attack;
    }

    public double getPoint(){
        return point;
    }

    public void setPoint(double point){
        this.point = point;
    }
}
