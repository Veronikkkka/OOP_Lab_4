import java.util.Random;

public class King extends Noble {
    private static final Random r = new Random();

    public King() {
        super(5, 15);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - r.nextInt(getPower()));
    }
}
