public class ListeEntier {

	private Cellule tete;

    public ListeEntier () {

        this.tete = null;
    }

    public ListeEntier (Cellule celluleEntier) {

        this.tete = celluleEntier;
    }

    public Cellule getTete () {

        return this.tete;
    }

    public void setTete (Cellule celluleEntier) {

		this.tete = celluleEntier;
    }

	public int taille () {

		int taille = 0;

		Cellule celluleTemporaire = this.tete;

		while (celluleTemporaire != null) {

			taille++;

			celluleTemporaire = celluleTemporaire.successeur;
		}

		return taille;
	} 

    public void ajouteTete (Cellule celluleEntier) {

        if (this.tete == null) {
	
        	setTete (celluleEntier);
	
		} else {

			Cellule celluleTemporaire = this.tete;

			setTete (celluleEntier);

			this.tete.successeur = celluleTemporaire; 
    	}
	}
	
    public void retireTete () {

        if (this.tete != null) {

        	this.tete = tete.getSuccesseur ();
        }
    }

    public void ajouteQueue (Cellule queue) {

        Cellule celluleTemporaire = this.tete;

        if (celluleTemporaire == null) {

        	setTete (queue);
	
        } else {

            while (celluleTemporaire.successeur != null) {

                celluleTemporaire = celluleTemporaire.successeur;
            }

            celluleTemporaire.successeur = queue;
        }
    }

    public void retireQueue () {

		Cellule celluleTemporaire = this.tete;

		if (celluleTemporaire.successeur == null) {

			retireTete ();
	
		} else {

			while (celluleTemporaire.successeur.successeur != null) {

				celluleTemporaire = celluleTemporaire.successeur;

				celluleTemporaire.successeur = null; 
    		}
		}
	}

    public void inserePosition (int position, Cellule contenu) {

		int nombre;

		Cellule celluleTemporaire = this.tete;

		if (position > 0 && position <= taille () + 1) {

			if (position == 1) {

				ajouteTete (contenu);

		    } else if (position == taille () + 1) {

		    	ajouteQueue (contenu);
			
		    } else {

		    	nombre = 1;
			
		    	while (nombre <= taille () + 1) {

		    		nombre++;
				
		    		if (position == nombre) {

		    			contenu.successeur = celluleTemporaire.successeur;

		    			celluleTemporaire.successeur = contenu;
				
		    		} else {

		    			celluleTemporaire = celluleTemporaire.successeur;
		    		}
		    	}
		    }
		} else {

			System.out.println ("\n" + "Impossible d'inserer la cellule a la position donnee");
		}
    }

    public void retirePosition (int position) {

		Cellule celluleTemporaire = this.tete;

		if (position > 0 && position <= taille ()) {

			if (position == 0) {

				retireTete ();

			} else if (position == taille ()) {

				retireQueue ();

			} else {

				int nombre = 0;

				while (nombre < taille ()) {

					nombre++;

					if (position == nombre) {

						celluleTemporaire.successeur = celluleTemporaire.successeur.successeur;
				
					} else {

						celluleTemporaire = celluleTemporaire.successeur;
					}
		
				}
			}
		} else {

			System.out.println ("\n" + "Impossible de supprimer la cellule");
		}
    }

    public String toString () {

		String string = "";

		Cellule celluleEntier = this.tete;

		while (celluleEntier != null) {

			string = string + celluleEntier + " -> ";

			celluleEntier = celluleEntier.successeur;			
		}

		return string + "null";
    }
}