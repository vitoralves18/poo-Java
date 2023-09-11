package Desafios;

public abstract class pais {
    private String nome;
    private int populacao;

    public void setNome(String nome){

    }
    public String getNome(){
        return nome;
    }
    public pais(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public abstract void descricao();

    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("População: " + populacao + " habitantes");
        descricao();
        System.out.println();
    }
}
