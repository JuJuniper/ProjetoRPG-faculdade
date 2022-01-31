package Simulação;


import Personagem.Entidade;
import java.util.Collection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6514286
 */
public class Party {
    private Collection<Entidade> grupo;

    public Collection<Entidade> getGrupo() {
        return grupo;
    }
    
    public void addInParty(Entidade entidade){
        grupo.add(entidade);
    }
}
