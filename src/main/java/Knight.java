import java.util.Random;

public class Knight extends Noble {
    private static final Random r = new Random();

    public Knight() {
        super(2, 12);

    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - r.nextInt(getPower()));
    }
}
