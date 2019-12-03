package bo.upb.programacion3.codelabpokedex;

import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public interface PokemonCallback {
    void onPokemonClick(Pokemon pokemon);
}