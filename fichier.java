import java.io.*;

public class fichier{

    private String nom;

    public fichier(String n){
        this.nom = n;
    }
    
    // chager le fichier
    public String charger() throws IOException{
        BuffferReader br = new BufferReader(new FileReader(this.nom));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        while(s!=null){
            sb.append(s);
            s=br.readline();
        }
        br.close();
        return sb.toString();
    }

    // sauvegarder le fichier
    public void sauver(String nom) throws IOException{

    }


    public static void main(String[] args) throws IOException {
        fichier f = new fichier("fichier.txt");
        fichier.sauver("fichier.txt");
        System.out.println(fichier.charger());
    }
}