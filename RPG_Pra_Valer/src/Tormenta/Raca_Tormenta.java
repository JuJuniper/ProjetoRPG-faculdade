/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tormenta;

import Personagem.Raca;
import rpg_pra_valer.Atributo;

/**
 *
 * @author Samuel
 */
public class Raca_Tormenta extends Raca{

    public Raca_Tormenta(Atributo modificadorRacial, String Nome) {
        super(modificadorRacial, Nome);
    }

    @Override
    public Atributo ModificarAtributos(Atributo AtributoFinal) {
        
        Atributo modAtributo = super.modificadorRacial;
                
        AtributoFinal.setForca(AtributoFinal.getForca().getValor() + modAtributo.getForca().getValor());
        AtributoFinal.setConstituicao(AtributoFinal.getConstituicao().getValor() + modAtributo.getConstituicao().getValor());
        AtributoFinal.setDestreza(AtributoFinal.getDestreza().getValor() + modAtributo.getDestreza().getValor());
        AtributoFinal.setInteligencia(AtributoFinal.getInteligencia().getValor() + modAtributo.getInteligencia().getValor());
        AtributoFinal.setSabedoria(AtributoFinal.getSabedoria().getValor() + modAtributo.getSabedoria().getValor());
        AtributoFinal.setCarisma(AtributoFinal.getCarisma().getValor() + modAtributo.getCarisma().getValor());
        
        return AtributoFinal;
    }
    
}
