package test;

public class Fournisseurs{
	
	private conn connexion;

    public Fournisseurs(String url) {
      
    	// Crée une instance de la classe Connexion
        
    	this.connexion = new conn(url);
    }
	
    public void effectuerAutreTache() {
        // Utilise la connexion pour effectuer d'autres tâches
       
    	
    	connexion.ouvrirNavigateur("chrome");
        connexion.seConnecter();
        // Ajoutez d'autres tâches spécifiques à cette classe
    }
    
    }

