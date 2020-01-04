<?php
require_once('car.php');
class UberVan extends Car{
    public $seatsMaterial = array();
    public $typeCarAccepted = array_map();

    public function __construct($license, $driver, $seatsMaterial, $typeCarAccepted){
        parent::__construct($license, $driver){
            $this->seatsMaterial = $seatsMaterial;
            $this->typeCarAccepted = $typeCarAccepted;
        }
    }

}


?>