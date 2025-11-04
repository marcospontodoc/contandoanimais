package com.example;


public class Animal{
    protected String nome;
    protected String especie;

    public Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    public void talk(){
        System.out.println(nome + "Fez um som");
    }

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }
}




