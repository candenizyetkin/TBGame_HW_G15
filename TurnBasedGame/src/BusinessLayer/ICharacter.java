package BusinessLayer;

public interface ICharacter<W>{

    public void punch();
    public <W> void attackWithWeapon();
    public void guard();
    public void run();
    public void specialAction();




}
