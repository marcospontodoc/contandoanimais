package com.example;


public class Gato extends Animal {
    public Gato(String nome) {
        super(nome, "Gato");
    
    }

    @Override
    public void talk() {
        System.out.println(nome + " miou: Miau!");
    }

}