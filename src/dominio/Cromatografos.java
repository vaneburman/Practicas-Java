package dominio;

public abstract class Cromatografos {
    public void instalar() {
        System.out.println("Equipo en instalación...");
    }

    public abstract void separarComponentes();

    public abstract void detectarComponentes(Detectores detector);
}
