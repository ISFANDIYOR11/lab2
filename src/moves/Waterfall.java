package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends SpecialMove {
    public Waterfall() {
        super(Type.WATER, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<0.2){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Waterfall";

    }
}
