/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Itens.Arma;
import Itens.Armadura;
import java.util.ArrayList;
import java.util.List;
import rpg_pra_valer.Ataque;
import rpg_pra_valer.Atributo;
import rpg_pra_valer.Dado;

/**
 *
 * @author 6514286
 */
public abstract class Entidade implements Comparable<Entidade>{
    
    protected int LVL;
    protected int PV;
    protected int PV_ATUAL;    
    protected int CA;
    protected Atributo atributos;
    protected List<Ataque> ataques = new ArrayList<>();
    private int Iniciativa;

    public Entidade(int LVL, int PV, int CA, Atributo atributos) {
        this.LVL = LVL;
        this.PV = PV;
        this.PV_ATUAL = PV;
        this.CA = CA;
        this.atributos = atributos;
    }
    
    public Entidade(int LVL, Atributo atributos) {
        
        this.LVL = LVL;
        this.atributos = atributos;
        
    }
    
    public int CalcularCA(Armadura armadura){
        return 10 + atributos.getDestreza().modificador() + armadura.BonusCA() + (LVL/2);
    }
    
    
    public void Iniciativa() {
        Dado D20 = new Dado(1, 20);
        Iniciativa = D20.jogar() + LVL + atributos.getDestreza().modificador();
    }
    public int getIniciativa() {
        return Iniciativa;
    }
    
    
    
    public abstract boolean Atacar(Entidade inimigo, Ataque ataque);
    public abstract int CalcularModificadorAtaque();
    public abstract int CalcularModificadorDano();
    
    
    public void addAtaque(Arma arma, String descricao) {
        int ModAtq = CalcularModificadorAtaque();
        int ModDan = CalcularModificadorDano();
        
        this.ataques.add(new Ataque(arma, descricao, ModAtq, ModDan));
    }
    public void TomarDano(int Dano) {
        PV_ATUAL -= Dano;
    }
    public void RestaurarVida(){
        PV_ATUAL = PV;
    }
    
    public int getCA(){
        return CA;
    }
    public int getPV_ATUAL() {
        return PV_ATUAL;
    }
    public List<Ataque> getAtaques() {
        return ataques;
    }
    public Atributo getAtributos() {
        return atributos;
    }

    @Override
    public int compareTo(Entidade t) {
        if (this.Iniciativa > t.Iniciativa)
            return -1;
        else if (this.Iniciativa < t.Iniciativa)
            return 1;
        else {
            if (this.atributos.getDestreza().getValor() > t.atributos.getDestreza().getValor())
                return -1;
            else if (this.atributos.getDestreza().getValor() < t.atributos.getDestreza().getValor())
                return 1;
            else {
                if (this.LVL > t.LVL)
                    return -1;
                else if (this.LVL < t.LVL)
                    return 1;
                else 
                    return 0;
            }
        }
            
    }
}
