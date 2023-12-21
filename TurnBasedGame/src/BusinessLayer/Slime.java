package BusinessLayer;

public class Slime extends Opponent{

    public  void absorb(Human HumanBeingAttacked){
        if(HumanBeingAttacked.isGuard()){
            HumanBeingAttacked.setPoint(HumanBeingAttacked.getPoint()-getAttack()*0.25);
            double pointBeforeAddition = getPoint() + getAttack();
            if (pointBeforeAddition>MAXPOINTSFOROPPONENTS){
                setPoint(MAXPOINTSFOROPPONENTS);

            }
            else {
                setPoint(pointBeforeAddition);
            }
        }
            else{
            HumanBeingAttacked.setPoint(HumanBeingAttacked.getPoint()-getAttack());
            double pointBeforeAddition = getPoint() + getAttack();
            if (pointBeforeAddition>MAXPOINTSFOROPPONENTS){
                setPoint(MAXPOINTSFOROPPONENTS);
            }
            else {
                setPoint(pointBeforeAddition);
            }
        }
    }



}
