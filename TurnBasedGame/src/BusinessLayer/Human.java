package BusinessLayer;
import java.util.Random;
public abstract class Human<W extends Weapon>  extends Member implements ICharacter<W>{
    private double point;
    private double attack;
    private double speed;
    private String name;
    private int stamina= 10;
    private boolean guard=false;
    public Human(){
        point = RandomPointsAssignment();
        speed = RandomSpeedAssignment();
        attack = RandomAttackAssignment();
    }
    @Override
    public void punch() {
    }
    @Override
    public void run() {

    }

    @Override
    public void specialAction() {

    }

    @Override
    public void attackWithWeapon() {

    }

    @Override
    public double RandomPointsAssignment() {
        Random random = new Random();
        return random.nextInt(51) + 100;
    }

    @Override
    public double RandomSpeedAssignment() {
        Random random = new Random();
        return random.nextInt(81) + 10;
    }

    @Override
    public double RandomAttackAssignment() {
        Random random = new Random();
        return random.nextInt(21) + 20 ;
    }

    public void setPoint(double point) {
        this.point = point;

    }

    public double getPoint() {
        return point;
    }
    public <T> void attackWithWeapon(Opponent opponent, T weapon,int input ){



    }

    public boolean isGuard() {
        return guard;
    }
    public void guard(){
        this.guard=true;
    }
}
