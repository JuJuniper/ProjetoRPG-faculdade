package Simulação;


import Personagem.Entidade;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import rpg_pra_valer.Ataque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6514286
 */
public class Simulação {
    
    private Collection<Party> Simulado;

    public Collection<Party> getSimulado() {
        return Simulado;
    }
    
    public void addInSimulacao(Party grupo){
        Simulado.add(grupo);
    }

    public Simulação(Collection<Entidade> GrupoA, Collection<Entidade> GrupoB) {
        this.Simulado = Simulado;
    }
    
    
    
    public List<Entidade> Simular(){
                
        List<Entidade> Iniciativa = ListarIniciativa();
        int Turnos = 0;
        
        boolean parar = true;
        while (parar) {
            Turnos++;
            for (Entidade atacante : Iniciativa) {
            if (!AtaquePossivel(atacante, Iniciativa))
                parar = false;
            }
        }
        
        return Iniciativa;
    }
    
    private List<Entidade> ListarIniciativa(){
        List<Entidade> retornavel = new ArrayList<>();
     
        for (Party party : Simulado) {
            for (Entidade ent : party.getGrupo()) {
                ent.Iniciativa();
                retornavel.add(ent);
            }
        }
        
        Collections.sort(retornavel);
        return retornavel;
    }
    
    private boolean MesmaParty(Entidade atacante, Entidade atacado){
        
        for (Party party : Simulado) {
            for (Entidade ent : party.getGrupo()) {
                if (ent.equals(atacante)){
                    for (Entidade entidade : party.getGrupo()) {
                        if (entidade.equals(atacado))
                            return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    private boolean AtacarOponente(Entidade atacante, Entidade atacado){
        
        for (Ataque ataque : atacante.getAtaques()) {
            if (atacante.Atacar(atacado, ataque) == true)
                return true;
        }
        return false;
    }
    
    private boolean AtaquePossivel(Entidade atacante, List<Entidade> Iniciativa){
        
        for (Entidade atacado : Iniciativa) {
            if (MesmaParty(atacante, atacado) == false){
                if(AtacarOponente(atacante, atacado) == true)
                    return Iniciativa.remove(atacado);
            }
        }
        return false;
        
    }

}
