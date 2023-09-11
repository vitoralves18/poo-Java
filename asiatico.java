package Desafios;

public class asiatico extends pais implements descricao {
    private String religiao;

    public asiatico(String nome, int populacao, String religiao) {
        super(nome, populacao);
        this.religiao = religiao;
    }

    @Override
    public void descricao() {
        System.out.println("Localizado na Ásia e a religião predominante é " + religiao);
    }
}
