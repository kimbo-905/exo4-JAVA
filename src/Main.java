public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Doe", "Joe", 29, "01/01/1991");
        Person person2 = new Person();

//        System.out.print("Personne 1 - ");
//        person1.Affichage();
//        System.out.print("Age est: " + person1.calculAge() + " ans");


        person1.setNom("popoui");
        person1.setPrenom("DIOP");
        person1.setAge(120);
        person1.setDateNaiss("01/01/1991");
        System.out.println(person1.toString());
        System.out.print("Age est: " + person1.calculAge() + " ans");

        person2.setNom("jack");
        person2.setPrenom("DIOP");
        person2.setAge(120);
        person2.setDateNaiss("01/01/1991");
        System.out.println(person2.toString());

        System.out.print("Age est: " + person2.calculAge() + " ans");

    }
}