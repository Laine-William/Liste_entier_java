public class Test {

	public static void main (String[] args) {

        Cellule celluleEntier1 = new Cellule (2);

        Cellule celluleEntier2 = new Cellule (4);
        
        Cellule celluleEntier3 = new Cellule (14);
        
        Cellule celluleEntier4 = new Cellule (20);

        System.out.println ("CelluleEntier1 : " + celluleEntier1.toString ());
        System.out.println ("CelluleEntier2 : " + celluleEntier2.toString ());
        System.out.println ("CelluleEntier3 : " + celluleEntier3.toString ());
        System.out.println ("CelluleEntier4 : " + celluleEntier4.toString ());

        ListeEntier listeEntier = new ListeEntier (celluleEntier1);

        System.out.println ("\n" + "Affichage de la liste obtenue      : ");
        System.out.println ("Initialisation avec celluleEntier1 : ");
        System.out.println ("ListeEntier                        : " + listeEntier.toString ());
        
        celluleEntier3.setSuccesseur (celluleEntier4);

        listeEntier.setTete (celluleEntier3);

        System.out.println ("\n" + "Affichage de la liste obtenue                        : ");
        System.out.println ("Initialisation avec celluleEntier2 et celluleEntier3 : ");
        System.out.println ("ListeEntier                                          : " + listeEntier.toString ());

        Cellule celluleEntier5 = new Cellule (40);

        listeEntier.ajouteTete (celluleEntier5);

        System.out.println ("\n" + "Affichage de la liste obtenue  : ");
        System.out.println ("Initialisation avec ajouteTete : ");
        System.out.println ("ListeEntier                    : " + listeEntier.toString ());

        listeEntier.ajouteQueue (celluleEntier2);

        System.out.println ("\n" + "Affichage de la liste obtenue   : ");
        System.out.println ("Initialisation avec ajouteQueue : ");
        System.out.println ("ListeEntier                     : " + listeEntier.toString ());

        listeEntier.retireTete ();

        System.out.println ("\n" + "Affichage de la liste obtenue  : ");
        System.out.println ("Initialisation avec retireTete : ");
        System.out.println ("ListeEntier                    : " + listeEntier.toString ());

        listeEntier.setTete (celluleEntier1);

        listeEntier.ajouteQueue (celluleEntier2);

        listeEntier.retireQueue ();
        
        System.out.println ("\n" + "Affichage de la liste obtenue   : ");
        System.out.println ("Initialisation avec retireQueue : ");
        System.out.println ("ListeEntier                     : " + listeEntier.toString ());
        
        listeEntier.inserePosition (2, celluleEntier5);
        listeEntier.inserePosition (3, celluleEntier4);

        System.out.println ("\n" + "Affichage de la liste obtenue      : ");
        System.out.println ("Initialisation avec inserePosition : ");
        System.out.println ("ListeEntier                        : " + listeEntier.toString ());
        
        listeEntier.retirePosition (1);
        listeEntier.retirePosition (2);
        
        System.out.println ("\n" + "Affichage de la liste obtenue      : ");
        System.out.println ("Initialisation avec retireposition : ");
        System.out.println ("ListeEntier                        : " + listeEntier.toString ());

        
        System.out.println ("\n" + "Affichage de la liste obtenue      : ");
        System.out.println ("ListeEntier                        : " + listeEntier.toString ());
	}
}