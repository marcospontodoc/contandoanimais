package com.example;


public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome, "Cachorro");
    }

    @Override
    public void talk() {
        System.out.println(nome + " latiu: Au Au!");
    }

}