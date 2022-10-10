import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

    private boolean isAlive() {
        return this.getHp() > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int i) {
        if (i >= 0) this.hp = i;
        else this.hp = 0;
    }

    public int getPower() {
        return power;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.hp +
                ", power=" + this.power + "}";
    }

    public void setPower(int n) {
        if(n >= 0) this.power = n;
    }

    public void kick(Character c) {

    }
}
