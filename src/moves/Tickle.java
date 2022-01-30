package moves;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.StatusMove;

public class Tickle extends StatusMove {
    public Tickle() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        int currentStat = (int) p.getStat(Stat.DEFENSE);
        if (currentStat < 6) {
            p.setMod(Stat.DEFENSE, ++currentStat);
        }
    }
}
