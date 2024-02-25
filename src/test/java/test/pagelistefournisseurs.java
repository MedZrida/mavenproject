package test;

import org.testng.annotations.Test;

public class pagelistefournisseurs {
	@Test
	public static void main(String[] args) {
	        // Crée une instance de la classe AutreClasse
	        Fournisseurs autreClasse = new Fournisseurs("https://dev.accorhotels.projets-en-cours.net/fr/user/login");

	        // Appel des méthodes de AutreClasse, qui utilise la classe Connexion
	        autreClasse.effectuerAutreTache();
	    }
	
	

}

