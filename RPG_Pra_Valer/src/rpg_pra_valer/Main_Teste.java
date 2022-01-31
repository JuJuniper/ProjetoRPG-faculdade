/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_pra_valer;

import Itens.Arma;
import Itens.Armadura;
import Personagem.Classe;
import Personagem.Personagem;
import Personagem.Raca;
import Tormenta.Classe_Tormenta;
import Tormenta.Personagem_Tormenta;
import Tormenta.Raca_Tormenta;

/**
 *
 * @author 6514286
 */
public class Main_Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dado dadoTeste = new Dado(1, 4);
        Armadura Teste_armadura = new Armadura(2, 0, "cota de malha");
        Atributo atributos = new Atributo(10, 10, 10, 10, 10, 10);
        
        
        Arma teste_arma = new Arma(19, dadoTeste, "adaga");
        Ataque ataqueTeste = new Ataque(teste_arma, "", 5, 8);
        
        
        Classe Druida = new Classe_Tormenta(Classe_Tormenta.UM_A_CADA_DOIS_LVL, "Duida", 16, 4);
        Raca Elfo = new Raca_Tormenta(new Atributo(0, 4, 0, 2, 0, 0), "Elfo");
        
        Personagem Teste_personagem = new Personagem_Tormenta("Gandalf", Druida, Elfo, Teste_armadura, 10, atributos);
        Teste_personagem.addAtaque(teste_arma, "Teste");
        
        System.out.println(Teste_personagem.CalcularCA(Teste_armadura));
        System.out.println(Teste_personagem.calcularVida());
        System.out.println(Teste_personagem.CalcularModificadorAtaque());
        System.out.println(Teste_personagem.CalcularModificadorDano());
        Teste_personagem.addAtaque(teste_arma, "Teste");
        System.out.println(Teste_personagem.Atacar(Teste_personagem, ataqueTeste));
        System.out.println(Teste_personagem.getPV_ATUAL());
        
        int QTD_TESTE = 1000000;
        int jogada = 0;
        int erro = 0;
        float mediaErro = 0; 
        int acerto = 0;
        int contador = 0;
        boolean parar = false;
                
        /*do {
            contador++;
            
            jogada = ataqueTeste.JogadaDeAtaque(20);
            if (jogada == 0)
                erro++;
            else 
                acerto += jogada;
            
            if (contador % 10 == 0){
                mediaErro = (erro*100)/contador;
                System.out.println("Teste: " + contador);
                System.out.println("Media Erro: " + mediaErro);
                System.out.println("Dano medio: " + acerto/(contador-erro));
                System.out.println("");
                System.out.println("");
                System.out.println("");
                if (69.9999 <= mediaErro && 70.0001 >= mediaErro) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Encerrado");
                    System.out.println(contador);
                    parar = true;
                }
            }
        }while (parar == false);
            
        */
        
        
    }
    
}
