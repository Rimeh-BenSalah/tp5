package tp5;

public class Main {

    public static void main(String[] args) {
        Dictionnaire d = new Dictionnaire("Dico", 10);

        Mot_dict m1 = new Mot_dict("mot", "ensemble des alphabets");
        Mot_dict m2 = new Mot_dict("phrase", "ensemble des mots");
        Mot_dict m3 = new Mot_dict("paragraphe", "ensemble des phrases");

        d.ajouterMot(m1);
        d.ajouterMot(m2);
        d.ajouterMot(m3);

        System.out.println("Contenu du dictionnaire :");
        d.listerDictionnaire();

        System.out.println("\nRecherche du mot 'mot' : " + d.recherche("mot"));

        System.out.println("\nSuppression du mot 'phrase'");
        d.supprimerMot(m2);

        System.out.println("\n=== Contenu du dictionnaire après suppression ===");
        d.listerDictionnaire();

        System.out.println("\nNombre de synonymes de 'mot' : " + d.nombreSynonyme(m1));
    }
}
