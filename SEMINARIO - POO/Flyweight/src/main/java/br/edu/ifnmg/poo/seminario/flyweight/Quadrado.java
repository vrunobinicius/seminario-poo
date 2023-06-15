package br.edu.ifnmg.poo.seminario.flyweight;

/**
 *
 * @author Bruno Vinícius (bvan)
 */
class Quadrado implements Forma {
    private String cor;

    public Quadrado(String cor) {
        this.cor = cor;
    }

    public void desenhar() {
        System.out.println("Desenhando um quadrado " + cor);
    }
}
