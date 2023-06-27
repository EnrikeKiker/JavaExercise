public enum Celular{
    IPHONE("Apple", "IPhone 13 Pro Max", "iOS", "128GB", 3500, "Cámara triple", 25999),
    SAMSUNG("Samsung", "Galaxy S23+", "Android", "128GB", 4700, "Cámara triple", 22990),
    XIAOMI("Xiaomi", "12T pro", "MIUI13", "256GB", 5000, "Cámara triple", 599),
    HUAWEI("Huawei", "Draco-L29C", "EMUI13", "256GB", 4700, "Cámara cuádruple", 18090),
    MOTOROLA("Motorola", "G60", "Android", "128GB", 6000, "Cámara triple", 4200),
    GOOGLE("Google", "GE2AE", "Android", "256GB", 5000, "Cámara triple", 21999);

    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private String almacenamiento;
    private double bateria;
    private String camara;
    private double precio;

    private Celular(String marca, String modelo, String sistemaOperativo, String almacenamiento,
                    double bateria, String camara, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.almacenamiento = almacenamiento;
        this.bateria = bateria;
        this.camara = camara;
        this.precio = precio;
    }

    // Getters

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getSistemaOperativo(){
        return sistemaOperativo;
    }

    public String getAlmacenamiento(){
        return almacenamiento;
    }

    public double getBateria(){
        return bateria;
    }

    public String getCamara(){
        return camara;
    }

    public double getPrecio(){
        return precio;
    }
}
