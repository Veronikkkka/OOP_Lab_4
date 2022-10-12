import java.util.Random;

public abstract class Noble extends Character {
    private static final Random r = new Random();

    public Noble(int min, int max) {
        super(r.nextInt(max - min + 1) + min, r.nextInt(max - min + 1) + min);

    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - r.nextInt(getPower()));
    }
}
