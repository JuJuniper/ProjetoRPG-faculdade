/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author 6514286
 */
public class RPG_Industry {
    
    public static enum Tipo_RPG{
        Tormenta, DnD;
    }
    
    public static RPG_Factory createFactry(Tipo_RPG entrada){
        
        if (entrada == Tipo_RPG.Tormenta){
            return new TormentaFactory();
        }
        else if (entrada == Tipo_RPG.DnD){
            return new DnDFactory();
        }
        return null;
    }
}
