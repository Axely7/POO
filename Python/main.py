from car import Car
from account import Account
from uberX import UberX
from user import User
from driver import Driver

if __name__ == "__main__":
    print("Heeey")

    car = Car("AMS234", Account("Jackson", "1234FJFM"))
    print(vars(car))
    print(vars(car.driver))


    uberX = UberX("QWRT", Account("Valeria", "141pjjo"), "Chevrolet", "Spark")
    print(vars(uberX))
    print(vars(uberX.driver))


    #Imprimiendo a objeto usuario:

    user1 = User("Carolina", "jkmi", 487, "carolina12@crist.com","yisuscrist")
    print(vars(user1))

    #Imprimiendo a objeto driver:

    driver1 = Driver("Abner", "JMIL", 1996, "abner123@hotmail.com", "cuadrovlogs")
    print(vars(driver1))



    #El código de abajo es cuando no se crea el método constructor de manera explícita

    #car = Car() #Nombre_de_objeto = Nombre_del método_constructor(que tiene el mismo nombre que la clase)
    #car.license = "AWMW9"
    #car.driver = "Pedro"
    #print(vars(car))

    #car2 = Car()
    #car2.license = "MKI21"
    #car2.driver = "Emilio"
    #print(vars(car2))