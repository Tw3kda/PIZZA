package edu.unisabana.pizzafactory.consoleview;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.unisabana.pizzafactory.factory.FabricaPizzaIntegral;
import edu.unisabana.pizzafactory.factory.FabricaPizzaGruesa;
import edu.unisabana.pizzafactory.factory.FabricaPizzaDelgada;
import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.FabricaPizza;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Tamano;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    private FabricaPizza fabrica;

    public PreparadorPizza(FabricaPizza fabrica) {
        this.fabrica = fabrica;
    }

    public static void main(String args[]) {
        try {
            FabricaPizza fabrica = new FabricaPizzaGruesa(); // Seleccionar la fábrica
            
            PreparadorPizza pp = new PreparadorPizza(fabrica);
            
            Ingrediente[] ingredientes = {
                new Ingrediente("queso", 1),
                new Ingrediente("jamon", 2)
            };
            
            pp.prepararPizza(ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparación de la Pizza", ex);
        }
    }
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam) throws ExcepcionParametrosInvalidos {
        Amasador am = fabrica.crearAmasador();
        Horneador hpd = fabrica.crearHorneador();
        Moldeador mp = fabrica.crearMoldeador();
        
        am.amasar();
        
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamaño de pizza inválido:" + tam);
        }

        aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
    }
    
}
