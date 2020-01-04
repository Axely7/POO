<?php
include_once 'Account.php';

class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    #Método constructor:

    public function __construct($license, account $driver){
        $this->license= $license;
        $this->driver= $driver;
    }

    public function printDataCar(){
        echo "Licencia: ". $this->license. "Driver: ".$this->driver->name;
    }



}

