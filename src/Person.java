//import java.util.concurrent.atomic.AtomicInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Person {


//    instances
    private static int identification = 1;
    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private String dateNaiss;


//    constructeur
    public Person(String nom, String prenom, int age, String dateNaiss){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = genererMat();
        this.age = age;
        this.dateNaiss = dateNaiss;
        identification++;
    }
    public Person(){

    }


//      setter
    public void setNom(String nom) {
    this.nom = nom;
}
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDateNaiss(String dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

//      getter


//      method
    private String genererMat(){
        String matricule = (prenom.substring(0,1)) + nom.substring(0,1).toUpperCase();
        String numeroIdentification = String.format("%04d", identification) ;
        return matricule + numeroIdentification;
    }
    public int calculAge() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateNaiss = dateFormat.parse(this.dateNaiss);
            Date dateActuelle = new Date();

            long differenceEnMillis = dateActuelle.getTime() - dateNaiss.getTime();
            long differenceEnAnnees = TimeUnit.MILLISECONDS.toDays(differenceEnMillis) / 365;

            return (int) differenceEnAnnees;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1; // En cas d'erreur de format de date
        }

    }


//    Autre methode d'affichage
//public void Affichage() {
//    System.out.println("Matricule: " + matricule + ", Nom: " + nom + ", Prénom: " + prenom +
//            ", Age: " + age + ", Date de naissance: " + dateNaiss);
//}


    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateNaissance='" + dateNaiss + '\'' +
                ", matricule='" + matricule + '\'' +
                '}';
    }

}

