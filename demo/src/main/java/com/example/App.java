package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Cachorro("Bidu"));
        animais.add(new Gato("Luna"));
        animais.add(new Gato("Mimi"));
        animais.add(new Peixe("Golden"));

        for (Animal a : animais){
            a.talk();
        }

        System.out.println("Total de animais: " + animais.size());

        int totalCachorros = 0;
        int totalGatos = 0;
        int totalPeixes = 0;
        for (Animal a : animais) {
            if (a instanceof Cachorro) totalCachorros++;
            if (a instanceof Gato) totalGatos++;
            if (a instanceof Peixe) totalPeixes++;
        }

        System.out.println("Total de cachorros: " + totalCachorros);
        System.out.println("Total de gatos: " + totalGatos);
        System.out.println("Total de Peixes: " + totalGatos);

    }
}
