package moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireFang extends SpecialMove {
    public FireFang() {
        super(Type.FIRE, 90.0D, 1.0D);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.FIRE) && Math.random() <= 0.1) {
            Effect.burn(p);
        }
    }
}


