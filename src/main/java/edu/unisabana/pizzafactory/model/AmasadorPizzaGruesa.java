package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Amasador;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaGruesa  implements Amasador {

    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa gruesa.");
        
        // CÓDIGO DE LLAMADO AL MICROCONTROLADOR
    }
     
}
