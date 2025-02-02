package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Amasador;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaIntegral  implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa integral.");
        
        // CÓDIGO DE LLAMADO AL MICROCONTROLADOR
    }

}