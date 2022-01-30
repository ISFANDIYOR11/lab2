package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends StatusMove{
    public DreamEater() {
        super(Type.NORMAL,80,75);}
    @Override
    protected void applySelfEffects(Pokemon p){

    }
    @Override
    protected String describe() {
        return "использует Dreaeater";


    }
}

