package Desafios;

public class europeu extends pais implements descricao {
    private String idioma;

    public europeu(String nome, int populacao, String idioma) {
        super(nome, populacao);
        this.idioma = idioma;
    }

    @Override
    public void descricao() {
        System.out.println("Localizado na Europa e fala-se " + idioma);
    }
}
