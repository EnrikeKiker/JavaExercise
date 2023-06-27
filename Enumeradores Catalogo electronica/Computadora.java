public enum Computadora{
    ESCRITORIO_HP("HP", "Intel", "16GB", "1TB", "Windows", 24, "Mouse, Teclado y Monitor"),
    NOTEBOOK_DELL("Dell", "AMD", "8GB", "512GB", "Windows", 15.6, "Sin periféricos"),
    NOTEBOOK_APPLE("Apple", "Apple Silicon", "32GB", "1TB", "MacOS", 27, "Mouse"),
    TABLET_SAMSUNG("Samsung", "Snapdragon", "4GB", "128GB", "Android", 10.1, "Stylus"),
    SERVIDOR_IBM("IBM", "Intel Xeon", "64GB", "4TB", "Linux", 0, "Sin periféricos"),
    MINI_PC_INTEL("Intel", "Intel", "8GB", "256GB", "Windows", 8, "Teclado y mouse"),
    ALL_IN_ONE_LENOVO("Lenovo", "AMD", "12GB", "1TB", "Windows", 23.8, "Teclado y mouse");

    private String marca;
    private String procesador;
    private String memoriaRAM;
    private String almacenamiento;
    private String sistemaOperativo;
    private double tamanioPantalla;
    private String perifericos;

    private Computadora(String marca, String procesador, String memoriaRAM, String almacenamiento,
                        String sistemaOperativo, double tamanioPantalla, String perifericos){
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.perifericos = perifericos;
    }

    // Getters

    public String getMarca(){
        return marca;
    }

    public String getProcesador(){
        return procesador;
    }

    public String getMemoriaRAM(){
        return memoriaRAM;
    }

    public String getAlmacenamiento(){
        return almacenamiento;
    }

    public String getSistemaOperativo(){
        return sistemaOperativo;
    }

    public double getTamanioPantalla(){
        return tamanioPantalla;
    }

    public String getPerifericos(){
        return perifericos;
    }
}
