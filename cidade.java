package Desafios;

public class cidade implements descricao {
    private String nome;
    private int populacao;

    public cidade(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    @Override
    public void descricao() {
        System.out.println("É uma cidade com " + populacao + " habitantes");
    }
}
