package pokemons;

import moves.DreamEater;
import moves.Facade;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stunky extends Pokemon {
    public Stunky(String name, int level) {
        super(name, level);
        setStats(63, 63, 47, 41, 74,65);
        setType(Type.POISON, Type.DARK);
        setMove(new Swagger(), new DreamEater(), new Facade());
    }
}
