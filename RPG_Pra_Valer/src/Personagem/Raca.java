/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import rpg_pra_valer.Atributo;

/**
 *
 * @author 6514286
 */
public abstract class Raca {
    
    protected Atributo modificadorRacial;
    protected String Nome;

    public Raca(Atributo modificadorRacial, String Nome) {
        this.modificadorRacial = modificadorRacial;
        this.Nome = Nome;
    }

    abstract public Atributo ModificarAtributos(Atributo AtributoFinal);
}
