/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tormenta;

import Personagem.Criatura;
import Personagem.Entidade;
import rpg_pra_valer.Ataque;
import rpg_pra_valer.Atributo;

/**
 *
 * @author Samuel
 */
public class Criatura_Tormenta extends Criatura{

    public static int INFIMO = 1;
    public static int DIMINUTO = 2;
    public static int MINIMO = 3;
    public static int PEQUENO = 4;
    public static int MEDIO = 5;
    public static int GRANDE = 6;
    public static int ENORME = 7;
    public static int DESCOMUNAL = 8;
    public static int COLOSSAL = 9;
    
    public static Classe_Tormenta ANIMAL = new Classe_Tormenta(Classe_Tormenta.TRES_A_CADA_QUATRO_LVL, "Animal", 0, 4);
    public static Classe_Tormenta CONSTRUCTO = new Classe_Tormenta(Classe_Tormenta.TRES_A_CADA_QUATRO_LVL, "Constructo", 0, 5);
    public static Classe_Tormenta ESPIRITO = new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Espirito", 0, 4);
    public static Classe_Tormenta HUMANOIDE = new Classe_Tormenta(Classe_Tormenta.TRES_A_CADA_QUATRO_LVL, "Humanoide", 0, 3);
    public static Classe_Tormenta MONSTRO = new Classe_Tormenta(Classe_Tormenta.UM_LVL, "Monstro", 0, 6);
    public static Classe_Tormenta MORTO_VIVO = new Classe_Tormenta(Classe_Tormenta.UM_A_CADA_DOIS_LVL, "Morto-Vivo", 0, 6);
    
    
    private final int Tamanho;
    private final Classe_Tormenta Tipo;

    public Criatura_Tormenta(int Tamanho, Classe_Tormenta Tipo, String Nome, int LVL, Atributo atributos) {
        super(Nome, LVL, atributos);
        this.Tamanho = Tamanho;
        this.Tipo = Tipo;
    }
    
    
    public int CalcularCA() {
        return (LVL/2) + atributos.getDestreza().modificador() + ModTamanho(Tamanho);
    }

    
    public int CalcularPV() {
        int ModConstructo = 0;
        
        if (Tipo == CONSTRUCTO && Tamanho > 3){
            switch (Tamanho){
                case 4:
                    ModConstructo = 10;
                    break;
                case 5:
                    ModConstructo = 20;
                    break;
                case 6:
                    ModConstructo = 30;
                    break;
                case 7:
                    ModConstructo = 40;
                    break;
                case 8:
                    ModConstructo = 60;
                    break;
                case 9:
                    ModConstructo = 80;
                    break;
            }            
        }
        
        return (Tipo.getPV_LVL()+atributos.getConstituicao().modificador())*LVL + ModConstructo;
    }

    @Override
    public int CalcularModificadorAtaque() {
        return Tipo.ModAtaque(LVL) + atributos.getForca().modificador() + ModTamanho(Tamanho);
    }

    @Override
    public int CalcularModificadorDano() {
        return atributos.getForca().modificador() + (LVL/2);
    }

    @Override
    public boolean Atacar(Entidade inimigo, Ataque ataque) {
        inimigo.TomarDano(ataque.JogadaDeAtaque(inimigo.getCA()));
        
        return inimigo.getPV_ATUAL() <= 0;
    }
    
    public Atributo GerarAtributoAleatorio(int Int, int Sab, int Car){
        Atributo retornavel = new Atributo(0, 0, 0, Int, Sab, Car);
        
        switch (Tamanho){
            case 1:
                retornavel.setForca(1);
                retornavel.setDestreza((int)(Math.random()*12)+16);
                retornavel.setConstituicao((int)(Math.random()*10)+2);
                break;
            case 2:
                retornavel.setForca(1);
                retornavel.setDestreza((int)(Math.random()*12)+14);
                retornavel.setConstituicao((int)(Math.random()*10)+4);
                break;
            case 3:
                retornavel.setForca((int)(Math.random()*4)+2);
                retornavel.setDestreza((int)(Math.random()*12)+12);
                retornavel.setConstituicao((int)(Math.random()*12)+4);
                break;
            case 4:
                retornavel.setForca((int)(Math.random()*8)+4);
                retornavel.setDestreza((int)(Math.random()*12)+10);
                retornavel.setConstituicao((int)(Math.random()*12)+6);
                break;
            case 5:
                retornavel.setForca((int)(Math.random()*12)+8);
                retornavel.setDestreza((int)(Math.random()*12)+8);
                retornavel.setConstituicao((int)(Math.random()*12)+8);
                break;
            case 6:
                retornavel.setForca((int)(Math.random()*10)+18);
                retornavel.setDestreza((int)(Math.random()*12)+6);
                retornavel.setConstituicao((int)(Math.random()*14)+10);
                break;
            case 7:
                retornavel.setForca((int)(Math.random()*10)+24);
                retornavel.setDestreza((int)(Math.random()*12)+4);
                retornavel.setConstituicao((int)(Math.random()*16)+12);
                break;
            case 8:
                retornavel.setForca((int)(Math.random()*12)+30);
                retornavel.setDestreza((int)(Math.random()*10)+4);
                retornavel.setConstituicao((int)(Math.random()*18)+14);
                break;
            case 9:
                retornavel.setForca((int)(Math.random()*14)+36);
                retornavel.setDestreza((int)(Math.random()*10)+2);
                retornavel.setConstituicao((int)(Math.random()*22)+18);
                break;
        }
        
        if (Tipo == ANIMAL){
            retornavel.setInteligencia((int)(Math.random()*2)+1);
        }
        else if (Tipo == CONSTRUCTO || Tipo == MORTO_VIVO){
            retornavel.setConstituicao(0);
        }
        return retornavel;
    }
    
    private int ModTamanho(int Tamanho){
        switch (Tamanho){
            case 1:
                return 8;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
                return 0;
            case 6:
                return -1;
            case 7:
                return -2;
            case 8:
                return -4;
            case 9:
                return -8;
        }
        return 0;
    }
}
