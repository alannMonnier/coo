public class fichier {

import java.io .*;


        private String nom;

        public fichier(String n) {
            this.nom = n;
        }

        // charger le fichier
        public String charger() throws IOException {
            BuffferReader br = new BufferReader(new FileReader(this.nom));
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            while (s != null) {
                sb.append(s);
                s = br.readline();
            }
            br.close();
            return sb.toString();
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


        public static void main(String[] args) throws IOException {
            fichier f = new fichier("fichier.txt");
            fichier.sauver("fichier.txt");
            System.out.println(fichier.charger());
        }
    }