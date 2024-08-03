package DefiningClasses.PokemonTrainer;

import java.util.*;

/*
@CIHAN GUR

You want to be the best pokemon trainer, like no one ever was, so you set out to catch pokemon.
Define a class Trainer and a class Pokemon. The trainer has a name, a number of badges, and a
collection of pokemon. Pokemon has a name, an element, and health, all values are mandatory.
Every Trainer starts with 0 badges.
From the console, you will receive an unknown number of lines until you receive the command
"Tournament", each line will carry information about a pokemon and the trainer who caught
it in the format "{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}" where
TrainerName is the name of the Trainer who caught the pokemon, names are unique there
cannot be 2 trainers with the same name. After receiving the command "Tournament" an
unknown number of lines containing one of three elements "Fire", "Water", and "Electricity"
will follow until the command "End" is received. For every command, you must check if a trainer
has at least 1 pokemon with the given element, if he does he receives 1 badge, otherwise, all
his pokemon lose 10 health, if a pokemon falls to 0 or less health, he dies and must be deleted
from the trainer's collection. After the command "End" is received, you should print all trainers
sorted by the amount of badges they have in descending order (if two trainers have the same amount
of badges, they should be sorted by order of appearance in the input) in the format
"{TrainerName} {Badges} {NumberOfPokemon}".


>>>>>INPUT
Peter Charizard Fire 100
George Squirtle Water 38
Peter Pikachu Electricity 10
Tournament
Fire
Electricity
End
>>>>>OUTPUT
Peter 2 2
George 0 1

>>>>>INPUT
Sam Blastoise Water 18
Alex Pikachu Electricity 22
John Kadabra Psychic 90
Tournament
Fire
Electricity
Fire
End
>>>>>OUTPUT
Alex 1 1
Sam 0 0
John 0 1
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Trainer> trainersList = new ArrayList<>();
        while(!input.equals("Tournament")){
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonType = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Trainer trainer = getTrainerByName(trainersList, trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonType, pokemonHealth);
            trainer.addPokemon(pokemon);

            input = scanner.nextLine();
        }

        String element = scanner.nextLine();
        while(!element.equals("End")){
            for (Trainer trainer : trainersList) {
                trainer.checkIfPokemonExistByElement(element);
            }
            element = scanner.nextLine();
        }
        //Sort the trainers according to the badges.
        trainersList.sort(Comparator.comparing(Trainer::getBadges).reversed());
        trainersList.forEach(trainer -> System.out.println(trainer.toString()));

    }

    private static Trainer getTrainerByName(List<Trainer> trainersList, String trainerName) {
        for (Trainer trainer : trainersList){
            if (trainer.getName().equals(trainerName)){
                return trainer;
            }
        }
        Trainer trainer = new Trainer(trainerName);
        trainersList.add(trainer);
        return trainer;
    }
}
