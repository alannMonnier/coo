public class fichier {

    // chager le fichier
    public String charger() throws IOException {


    }

    // sauvegarder le fichier
    public void sauver(String nom) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(nom));
        bw.write("Bonjon");
        bw.newLine();
        bw.write("correction :\nBonjour");
        bw.close();
        this.nom = nom;
    }
}