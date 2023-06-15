package br.edu.ifnmg.poo.seminario.flyweight;

/**
 *
 * @author Bruno Vinícius (bvan)
 */
public class Flyweight {
    public static void main(String[] args) {
        Forma forma1 = FormaFactory.getForma("azul");
        forma1.desenhar();

        Forma forma2 = FormaFactory.getForma("verde");
        forma2.desenhar();

        Forma forma3 = FormaFactory.getForma("azul");
        forma3.desenhar();

        System.out.println("As formas 1 e 3 são o mesmo objeto? " + (forma1 == forma3));
        System.out.println("As formas 1 e 2 são o mesmo objeto? " + (forma1 == forma2));
        System.out.println("As formas 2 e 3 são o mesmo objeto? " + (forma2 == forma3));
    }
}
