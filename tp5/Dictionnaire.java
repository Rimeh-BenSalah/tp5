package tp5;

public class Dictionnaire {
    private int nbMots;
    private Mot_dict[] dict;
    private String nom;

    public Dictionnaire(String n, int taille) {
        this.nom = n;
        this.dict = new Mot_dict[taille];
        this.nbMots = 0;
    }

    public void ajouterMot(Mot_dict m) {
        if (nbMots < dict.length) {
            dict[nbMots] = m;
            nbMots++;
            trier();
        } else {
            System.out.println("Le dictionnaire est plein !");
        }
    }

    public void trier() {
        for (int i = 0; i < nbMots - 1; i++) {
            for (int j = i + 1; j < nbMots; j++) {
                if (dict[i].getMot().compareTo(dict[j].getMot()) > 0) {
                    Mot_dict temp = dict[i];
                    dict[i] = dict[j];
                    dict[j] = temp;
                }
            }
        }
    }

    public void supprimerMot(Mot_dict m) {
        for (int i = 0; i < nbMots; i++) {
            if (dict[i].getMot().equals(m.getMot())) {
                for (int j = i; j < nbMots - 1; j++) {
                    dict[j] = dict[j + 1];
                }
                dict[nbMots - 1] = null;
                nbMots--;
                return;
            }
        }
    }

    public String recherche(String mot) {
        for (int i = 0; i < nbMots; i++) {
            if (dict[i].getMot().equals(mot)) {
                return dict[i].getDefinition();
            }
        }
        return "Mot non trouvé.";
    }

    public void listerDictionnaire() {
        System.out.println("Dictionnaire : " + nom);
        for (int i = 0; i < nbMots; i++) {
            System.out.println(dict[i]);
        }
    }

    public int nombreSynonyme(Mot_dict m) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (m.synonyme(dict[i])) {
                count++;
            }
        }
        return count;
    }
}
