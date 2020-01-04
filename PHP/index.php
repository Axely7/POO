<?php
require_once('car.php');
require_once('account.php');
require_once('uberX.php');
require_once('uberPool.php');

    
$uberx = new UberX("ABC123", new Account("Axel", "1938JO"), "Chevrolet", "Spark");
$uberx->printDataCar();


?>