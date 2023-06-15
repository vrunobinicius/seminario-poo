package br.edu.ifnmg.poo.seminario.proxy;

/**
 *
 * @author Bruno Vinícius (bvan)
 */
class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}