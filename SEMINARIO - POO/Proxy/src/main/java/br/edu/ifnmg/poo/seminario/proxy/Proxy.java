package br.edu.ifnmg.poo.seminario.proxy;

/**
 *
 * @author Bruno Vinícius (bvan)
 */
public class Proxy {
    public static void main(String[] args) {
        // Criando o proxy para a imagem
        Image image = new ProxyImage("image.jpg");

        // A imagem só será carregada do disco quando o método display() for chamado
        image.display();

        // A segunda vez que o método display() for chamado, a imagem será exibida diretamente
        image.display();
    }
}
