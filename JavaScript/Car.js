//Código nuevo con actualización en javascript:

class Car{
    constructor(license, driver){
        this.id;
        this.license=license ;
        this.driver=driver;
        this.passenger;
    }

    printDataCar(){
        console.log(this.license)
        console.log(this.driver.name)
        console.log(this.driver.document)

    }


} 


/*Debido a una actualización de javascript, a partir de nuevas especificaciones
del EcmaScript 6, ya se puede declarar una clase mediante la palabra reservada
class (como en java), por lo que el código de abajo, digamos es el viejo: 
*/

/*function Car(license, driver){ /*En esta misma parte de la clase se encuentra el método constructor, el cual tiene como parámetros lo 
    mímino necesario para que se pueda crear el objeto*/
 /*   this.id;
    this.license = license; /*El atributo de la clase toma el valor del parámetro */
   /* this.driver = driver; //Lo mismo que arriba :v
    this.passenger;
}
Car.prototype.printDataCar = function(){ /*Esta función se encarga de imprimir el valor de los parámetros*/
    /*console.log(this.license)
    console.log(this.driver.name) //Se toma el valor del parámetro que a su vez utiliza la clase de account la cual hereda hacia el atributo drive
    console.log(this.driver.document)
}*/
