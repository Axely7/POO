class UberX extends Car{ //Al usar la palabra extends, indica que UberX es una clase hija
    /* de Car, por lo que las propiedades de Car heredan hacia UberX*/
    String brand;
    String model;


    public UberX(String license, Account driver, String brand,
    String model){
        super(license, driver); //Con la función super, lo que se está aplicando es la herencia
        //Está trayendo los atributos o parámetro de la clase Car hacia el método constructor
        //hacia el método constructor de UberX.
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenger: "+ passenger);
    }
}