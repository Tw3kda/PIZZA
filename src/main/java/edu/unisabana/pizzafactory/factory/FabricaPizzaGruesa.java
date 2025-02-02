package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.interfaces.Amasador;
import edu.unisabana.pizzafactory.interfaces.FabricaPizza;
import edu.unisabana.pizzafactory.interfaces.Horneador;
import edu.unisabana.pizzafactory.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaGruesa;

public class FabricaPizzaGruesa implements FabricaPizza {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
    
}
