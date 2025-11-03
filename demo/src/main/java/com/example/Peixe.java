package animais;

public class Peixe extends Animal{
    public Peixe(String nome) {
        super(nome, "Peixe");
    }

    @Override
    public void talk() {
        System.out.println(nome + " fez: blub blub!");
    }
}