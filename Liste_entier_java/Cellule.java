public class Cellule {

    protected int contenu;
     
    protected Cellule successeur;

    public Cellule () {

        this.contenu = 0;
            
        this.successeur = null;
    }

    public Cellule (int contenu) {

        this.contenu = contenu;
        
        this.successeur = null;
    }

    public Cellule getSuccesseur () {

        return this.successeur;    
    }

        
    public void setSuccesseur (Cellule celluleEntier) {

        this.successeur = celluleEntier;    
    }
         
    public void setSuccesseur (int contenu) {
     
        this.successeur = new Cellule (contenu);    
    }
         
    public int getContenu () {

        return this.contenu;
    }

    public void setContenu (int contenu) {

        this.contenu = contenu;    
    }

    public String toString () {

        return "" + this.contenu;

    }
}