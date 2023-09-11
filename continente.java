package Desafios;

import java.util.ArrayList;
import java.util.List;

public class continente {
    private String nome;
    private List<pais> paises;

    public continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(pais pais) {
        paises.add(pais);
    }

    public void listarPaises() {
        System.out.println("Países no continente " + nome + ":");
        for (pais pais : paises) {
            System.out.println("- " + pais.getNome());
        }
    }
}
