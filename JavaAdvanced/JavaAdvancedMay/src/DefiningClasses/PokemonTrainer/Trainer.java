package DefiningClasses.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemonList = new ArrayList<>();
    }
    //Adding Pokemon.
    public void addPokemon (Pokemon pokemon){
        this.pokemonList.add(pokemon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
    //Check if there is pokemon or not. If there is add badge, if there is no reduce health. if there is no health, remove.
    public void checkIfPokemonExistByElement(String element) {
        boolean isAtleastOneExist = false;
        //Check if there is pokemon
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getElement().equals(element)) {
                isAtleastOneExist = true;
                break;
            }
        }
        //Check if there is pokemon add badge++
        if (isAtleastOneExist) {
            badges++;
        } else {
            // If there is no this pokemon, reduce all pokemons health by 10.
            for (Pokemon poke : this.pokemonList){
                poke.loseHealth();
            }
            //if pokemon health is lover than 0 -> REMOVE IT
            this.pokemonList.removeIf(pokemon -> pokemon.getHealth() <= 0);
        }
    }
    public String toString() {
        //{TrainerName} {Badges} {NumberOfPokemon} string format
        return String.format("%s %d %d", this.name, this.badges, this.pokemonList.size());
    }
}
