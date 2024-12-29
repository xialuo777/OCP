package ocp1Z0_829.question43;

public class Game extends SoftWare{
    private int players;
    public Game(String title, int players) {
        super(title);
        this.players = players;
        System.out.println("Game");
    }
    public String toString(){
        return super.toString()+" "+players;
    }
}
