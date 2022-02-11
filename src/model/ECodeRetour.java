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
public enum ECodeRetour {
    TRAITERAVECSUCCESPARS2M(00), MOTIFDEREMPLACEMENTVIDE(30),PRODUITCARTEINVALIDE(40), 
     TYPEGENERATIONPANINVALIDE(47), ERREURDETRAITEMENT(50),FORMATDELALIGNEINCORRECTE(51), 
     TYPEDEDEMANDEINVALIDE(54),IDENTIFIANTDELABANKINVALIDE(55),TYPECLIENTINVALIDE(56),
     IDENTIFIANTDUCLIENTNUL(57), TYPEIDENTITENONDEFINIT(58) , IDENTIFIANTNUL(59),
     TYPEDECOMPTEINVALIDEON(60) , COMPTEBANCAIRENUL(61) , MONNAIECOMPTEINVALIDE(62) ,
     NOMSURLACARTENUL(63) , FLAGCARTEPIRMAIRESECONDAIREINVALIDE(64), NUMEROCARTEPRIMAIRENUL (65) ,
     TYPEDECOMPTENOTCARDHOLDER(66) , IDENTIFIANTDAGENCEINVALIDE (67) , IDENTIFIANTDEPRODUITDEBITINVALIDE(68),
     TYPEDECOMPTEINVALIDECN(69);
    private Integer code;

    private ECodeRetour() {
     
    }

    private ECodeRetour(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        switch(code)
        {
            case 00:
                return "Traiter avec succès par S2M";
             
            case 30:
                return "Motif de remplacement vide";
               
            case 40 :
                return "Produit carte invalide";
                
             case 47 :
                return "Type Génération PAN Invalide";
                
             case 50 :
                return "Erreur de traitement";
               
              case 51 :
                return "Format de la lignr Incorrecte(Longueur Invalide) ";
            
              case 54 :
                return "Type Demande Invalide";
                
               case 55 :
                return "Identifiant de la Bank Invalide";
                
               case 56 :
                return "Type Clinet Invalide (NOT IN ('O','N'))";
                  
                case 57 :
                return "Identifiant du Client Nul";
                
                case 58 :
                return "Type Identité Non Définit";
                
                case 59 :
                return "Identifiant Nul";
                
                case 60 :
                return "Type Compte Invalide";
                
                case 61 :
                return "Compte Bancaire Nul";
                
                case 62 :
                return "Monnaie Compte Invalide";
                
                case 63 :
                return "Nom sur la carte Nul";
               
                case 64 :
                return "Flag Carte Primaire / Secondaire Invalide (NOT IN ('P','S')";
             
                case 65 :
                return "N° Carte Primaire Nul ";
                
                case 66 :
                return "Type de Compte NOT CARDHOLDER ";
                 
                case 67 :
                return "Identifiant d’agence Invalide";
               
                case 68: 
                    return "Identifiant de Produit Débit Invalide";
                    
                case 69:
                    return "Type Compte Invalide (NOT IN (‘C’,’E’))";
                 default:
                  break;
                  
        }
        return null;
    }
    
    
}
