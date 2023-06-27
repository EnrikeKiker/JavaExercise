public enum Bocina{
    BOSE("Bose", "Bose S1 Pro", "Multiroom", 160, 13900),
    JBL("JBL", "IRX108BT", "Pasivos", 1300, 7800),
    SONY("Sony", "HT-S100F", "Barra", 120, 2700),
    HARMAN_KARDON("Harman Kardon", "HKOS6", "Portatil", 20, 3600),
    EDIFIER("Edifier", "R1280T", "Activos", 42, 3780),
    LOGITECH("Logitech", "Z607", "Surround", 160, 2200);

    private String marca;
    private String modelo;
    private String tipo;
    private int potencia;
    private double precio;

    private Bocina(String marca, String modelo, String tipo, int potencia, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.precio = precio;
    }

    // Getters

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getTipo(){
        return tipo;
    }

    public int getPotencia(){
        return potencia;
    }

    public double getPrecio(){
        return precio;
    }
}
