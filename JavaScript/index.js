var car = new Car("AMQIE", new Account("Axel", "QWORIU")) //Creación del objeto llamado car, en donde se le otrogan los parámetros de license y
// driver
car.passenger = 4
car.printDataCar(); //el objeto car llama al método para que pueda imprimir los parámetros otorgados


var uberX = new UberX("AMS123", new Account("Xime", "qwetr45"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();

//Imprimiendo al objeto usuario: 

var user1 = new User("Tania", "MWJS", 12587, "tania987@yahoo.com", "manu");
user1.printDataUser();

//Imprimiendo al objeto driver:

var driver1 = new Driver("Fernando", "KML123", 1497, "fernando65@hotmail.com", "ferji23");
driver1.printDataDriver();