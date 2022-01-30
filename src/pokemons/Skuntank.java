package pokemons;

import moves.DreamEater;
import moves.Facade;
import moves.Swagger;
import moves.Tickle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skuntank extends Pokemon {
    public Skuntank(String name, int level) {
        super(name, level);
        setStats(103, 93, 67, 71, 61, 84);
        setType(Type.POISON, Type.DARK);
        setMove(new Swagger(), new DreamEater(), new Facade(), new Tickle());
    }
}
