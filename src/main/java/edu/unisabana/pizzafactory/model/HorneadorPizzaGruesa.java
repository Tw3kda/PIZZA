package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.interfaces.Horneador;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaGruesa implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa gruesa.");

        // CÓDIGO DE LLAMADO AL MICROCONTROLADOR
    }

}