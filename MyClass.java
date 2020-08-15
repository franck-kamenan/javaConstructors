package be.intecbrussel.javaConstructors;

public class MyClass
{
    int a;
    int poids;
    int anneeDeFabrication;
    String lieuDeFabrication;

    public MyClass()
    {
        a = 5;
    }
    public MyClass(int x)
    {
        this.a = x;
    }
    public MyClass(int poids, int anneeDeFabrication, String lieuDeFabrication)
    {
        this.poids = poids;
        this.anneeDeFabrication = anneeDeFabrication;
        this.lieuDeFabrication = lieuDeFabrication;
    }
}


