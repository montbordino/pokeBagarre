package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    // on teste les différents cas de victoire :
    // - Cas 1: pok1 est plus fort en attaque et gagne
    // - Cas 2: pok1 est plus faible en attaque et perd
    // - Cas 3: pok1 est égal en attaque mais plus fort en défense et gagne
    // - Cas 4: pok1 est égal en attaque mais plus faible en défense et perd
    // - Cas 5: pok1 est égal en attaque et en défense et gagne

    @Test
    void est_vainqueur_contre_cas1() {
        Pokemon pok1 = new Pokemon("Vainqueur", "", new Stats(10, 10));
        Pokemon pok2 = new Pokemon("Perdant", "", new Stats(5, 10));
        assertTrue(pok1.estVainqueurContre(pok2)); // cas 1
    }

    @Test
    void est_vainqueur_contre_cas2() {
        Pokemon pok1 = new Pokemon("Perdant", "", new Stats(5, 10));

        Pokemon pok2 = new Pokemon("Vainqueur", "", new Stats(10, 10));

        assertFalse(pok1.estVainqueurContre(pok2)); // cas 2
    }

    @Test
    void est_vainqueur_contre_cas3() {
        Pokemon pok1 = new Pokemon("Vainqueur", "", new Stats(10, 10));

        Pokemon pok2 = new Pokemon("Perdant", "", new Stats(10, 5));

        assertTrue(pok1.estVainqueurContre(pok2)); // cas 3
    }

    @Test
    void est_vainqueur_contre_cas4() {
        Pokemon pok1 = new Pokemon("Perdant", "", new Stats(10, 5));

        Pokemon pok2 = new Pokemon("Vainqueur", "", new Stats(10, 10));

        assertFalse(pok1.estVainqueurContre(pok2)); // cas 4
    }

    @Test
    void est_vainqueur_contre_cas5() {
        Pokemon pok1 = new Pokemon("Vainqueur", "", new Stats(10, 10));

        Pokemon pok2 = new Pokemon("Perdant", "", new Stats(10, 10));

        assertTrue(pok1.estVainqueurContre(pok2)); // cas 5
    }
}