public class Llamada {
    private String origen;
    private String destino;
    private int duracion;
    private int banda;
    private boolean local;

    public Llamada(int origen, int destino, int duracion, int banda, boolean local) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.banda = banda;
        this.local = local;
    }

    @Override
    public String toString() {
        String tipo;
        if (local) {
            tipo = "local";
        } else {
            tipo = "provincial";
        }

        return "Origen: " + origen + " Destino: " + destino +
                " Duración: " + duracion + " Banda: " + banda +
                " Tipo: " + tipo;
    }

    public int getCost() {
        if (local) {
            return 15 * duracion;
        } else {
            if (banda == 1) {
                return 20 * duracion;
            } else {
                return 30 * duracion;
            }
        }
    }
}
