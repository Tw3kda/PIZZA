package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.FabricaPizza;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaIntegral;

public class FabricaPizzaIntegral implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }

}
