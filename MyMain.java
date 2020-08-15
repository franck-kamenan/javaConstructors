package be.intecbrussel.javaConstructors;

public class MyMain
{
    public static void main(String[] args)
    {
        MyClass monObjet = new MyClass();
        System.out.println(monObjet.a);
        MyClass monObjet2 = new MyClass(21);
        System.out.println(monObjet2.a);
        MyClass monObjet3 = new MyClass(82, 2020, "Lyon");
        System.out.println("Mon objet pèse " + monObjet3.poids + " kg et date de " + monObjet3.anneeDeFabrication + " en provenance de " + monObjet3.lieuDeFabrication + ".");
    }


}
