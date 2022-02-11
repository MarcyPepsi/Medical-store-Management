/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marcy GADEU
 */
public enum ECodeAction {
     NOUVELLE(10), RENOUVSANSNOUVPAN(20),RENOUVAVECNOUVPAN(21), 
     REMPLACEMENTSANSNOUVPAN(30), REMPLACEMENTAVECNOUVPAN(31),REEDITIONDEPIN(40), RECALCULDEPIN(41);
    private Integer code;

    private ECodeAction() {
     
    }

    private ECodeAction(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        switch(code)
        {
            case 10:
                return "Nouvelle";
             
            case 20:
                return "Renouv. sans nouv PAN";
               
            case 21 :
                return "Renouv. avec nouv. PAN";
                
             case 30 :
                return "Remplacement sans nouv. PAN";
                
             case 31 :
                return "Remplacement avec nouv. PAN";
               
              case 40 :
                return "Réédition de pin";
            
              case 50 :
                return "Re-calcul de pin";
              default:
                  break;
                  
        }
        return null;
    }
    
    
    
}
