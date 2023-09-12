package Desafios;

public class exec {
    public static void main(String[] args) {
        pais pais1 = new europeu("França", 67000000, "Francês");
        pais pais2 = new asiatico("China", 1400000000, "Budismo");

        continente asia = new continente("Ásia");
        asia.adicionarPais(pais2);

        continente europa = new continente("Europa");
        europa.adicionarPais(pais1);

        pais1.imprimirInfo();
        
        pais2.imprimirInfo();

        asia.listarPaises();
        europa.listarPaises();
    }
}
