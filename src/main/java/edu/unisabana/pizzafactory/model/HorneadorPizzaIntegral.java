package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Horneador;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaIntegral implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa integral.");

        // CÓDIGO DE LLAMADO AL MICROCONTROLADOR
    }

}