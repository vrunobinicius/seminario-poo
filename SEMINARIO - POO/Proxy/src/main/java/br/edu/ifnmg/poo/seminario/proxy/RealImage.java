package br.edu.ifnmg.poo.seminario.proxy;

/**
 *
 * @author Bruno Vinícius (bvan)
 */
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Carregando imagem do disco: " + filename);
    }

    public void display() {
        System.out.println("Exibindo imagem: " + filename);
    }
}


