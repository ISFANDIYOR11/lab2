package pokemons;

import moves.Facade;
import moves.TailWhip;
import moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Pokemon {
    public Gloom(String name, int level) {
        super(name, level);
        setStats(60, 65, 70, 85, 75, 40);
        setType(Type.GRASS, Type.POISON);
        setMove(new Facade(), new TailWhip(), new Thunderbolt());
    }
}
