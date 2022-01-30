package pokemons;

import Moves.Waterfall;
import moves.Facade;
import moves.TailWhip;
import moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellossom extends Pokemon {
    public Bellossom(String name, int level) {
        super(name, level);
        setStats(75, 80, 95, 90, 100, 50);
        setType(Type.GRASS);
        setMove(new Facade(),new TailWhip(), new Thunderbolt(), new Waterfall());
    }
}