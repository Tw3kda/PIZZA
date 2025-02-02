package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Amasador;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaDelgada  implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        
        // CÓDIGO DE LLAMADO AL MICROCONTROLADOR
    }
     
}
