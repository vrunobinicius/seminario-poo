package br.edu.ifnmg.poo.seminario.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bruno Vinícius (bvan)
 */
class FormaFactory {
    private static final Map<String, Forma> cacheFormas = new HashMap<>();

    public static Forma getForma(String cor) {
        Forma forma = cacheFormas.get(cor);

        if (forma == null) {
            forma = new Quadrado(cor);
            cacheFormas.put(cor, forma);
        }

        return forma;
    }
}
