package pokemons;

import moves.FireFang;
import moves.Swagger;
import moves.ThunderFang;
import moves.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bouffalant extends Pokemon {
    public Bouffalant(String name, int level) {
        super(name, level);
        setStats(95,110,95,40,95,55 );
        setType(Type.NORMAL);
        setMove(new FireFang(), new Swagger(), new WillOWisp(), new ThunderFang());
    }
}
