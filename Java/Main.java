class Main{
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Pepe", "ASE123"));
        //Nombre_de_clase nombre_de_objeto = new nombre_de_metodo_constructor
        //El nombre del método constructor es el mismo nombre de la clase
        //car.passenger = 4;
       
        car.printDataCar(); //Este método se encuentra dentro de la clase
        //Se encarga de imprimir la información de los atributos

        Car car2 = new Car("WQE23", new Account("Axel Jim", "PNN100"));
        car2.printDataCar();


        //Imprimiendo objeto Usuario:

        User user1 = new User("Karol", "kiju123", 1456, "karol123@hotmail.com", "nochebuenas");
        user1.printDataUser();

        //Imprimiendo objeto Driver:

        Driver driver1 = new Driver(888, "Osmar456@gmail.com", "loscabos123", "Osmar", "MKLO12");
        driver1.printDataDriver();

        //Imprimiendo objeto uberx:

        UberX uberx1 = new UberX("MKLO", new Account("Neo", "AKI9"), "Chevrolet", "Sonic");
        uberx1.setPassenger(4);
        uberx1.printDataCar();

        UberVan ubervan1 = new UberVan("URYE123", new Account("Neo", "AKI9"));
        ubervan1.setPassenger(6);
        ubervan1.printDataCar();
    }
}

/*Al haber sido creado el método constructor de manera explícita, la arquitectura del programa cambia, por lo que el código de abajo,
es cuando NO se crea el método constructor explícitamente: 
        Car car = new Car()
         //En el lenguaje de Java, el compilador crea por defecto el método constructor
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passenger = 4;
        car.printDataCar();

        Creación de objeto 2:

        Car car2 = new Car();
        car2.license = "WQE23";
        car2.driver = "Axel Jim";
        car2.passenger = 3;

        System.out.println("Car license : " + car2.license);
*/