class Car{
    private Integer id;
    private String license;
    private Account driver; //Account se toma como un tipo de dato hacia driver, ya que driver hereda de la clase account, es decir driver tomará parte o 
    // todos los atributos de la clase account
    private Integer passenger;//Este atributo será unicamente afectado o modificado UNICAMENTE en la clase car, al ser aplicado el modificador de acceso PRIVATE

    public Car(String license, Account driver){ //Este es el método constructor, se está definiendo (o creando explícitamente) para entender 
        //el funcionamiento del método constructor y movernos hacia javascript, los parámetos que se indican en el método constructor
        /*son los mínimos necesarios para que se pueda crear el objeto en java.*/
        this.license = license; //Al escribir "this" hacemos referencia al atributo "original" de la clase, esto se iguala con el valor
        //que tomara el parámetro en el método -------->  this.atributo_de_clase = nombre_del_parámetro(el cual tomará el valor que se le asigne
        // en el archivo main.py)
        this.driver = driver;

    }
    void printDataCar(){
        if(passenger!=null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenger: "+ passenger);
        }
    }

    /*public Integer getPassenger(){ 
        return passenger;
    }*/
     
    public void setPassenger(Integer passenger){ //Función que no regresa nada, por eso es void, recibe como parámetro el número de pasajeros.
        if(passenger==4){
            this.passenger = passenger;
        }
        else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }


    
}