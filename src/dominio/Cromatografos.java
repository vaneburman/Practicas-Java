package dominio;

public abstract class Cromatografos {
    public void instalar() {
        System.out.println("Equipo en proceso de instalación...");
    }

    public abstract void separarComponentes();

    public abstract void detectarComponentes(Detectores detector);
}
