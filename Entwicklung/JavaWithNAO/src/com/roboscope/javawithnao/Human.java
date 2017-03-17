package com.roboscope.javawithnao;

/**
 * Diese Klasse ist eine generelle Beschreibung eines Menschen.
 */
public class Human {
    /**
     * Der Name dieses Menschen.
     */
    private String name;

    /**
     * Erstellt einen neuen Menschen.
     * @param name Der Name den der Human bekommen soll
     */
    public Human(String name) {
        this.name = name;
    }

    /**
     * Jeder Human hat einen Namen. Diese Methode gibt den Namen dieses Menschen zurück.
     * @return Der Name dieses Menschens
     */
    public String getName() {
        return this.name;
    }

    /**
     * Jeder Human hat einen Namen. Mit dieser Methode kann man diesem Menschen einen Namen geben.
     * @param name Der Name den dieser Human bekommen soll
     */
    public void setName(String name) {
        this.name = name;
    }
}
