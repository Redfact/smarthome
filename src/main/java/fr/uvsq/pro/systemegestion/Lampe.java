package fr.uvsq.pro.systemegestion;
public class Lampe extends Objet{

    protected int Indice_de_luminosite;

    public Lampe(int Indice_de_luminosite){
        this.Indice_de_luminosite = Indice_de_luminosite;
    }

    public int getLuminosite() {
        return this.Indice_de_luminosite;
    }

    public void ModifieLuminosite(int Indice_de_luminosite){
        this.Indice_de_luminosite = Indice_de_luminosite;
    }
}
