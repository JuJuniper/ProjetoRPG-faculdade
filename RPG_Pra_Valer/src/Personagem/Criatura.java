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
public abstract class Criatura extends Entidade{
    
    String Nome;

    public Criatura(String Nome, int LVL, Atributo atributos) {
        super(LVL, atributos);
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }
}
