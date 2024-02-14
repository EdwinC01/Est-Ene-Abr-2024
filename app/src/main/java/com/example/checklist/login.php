<?php

require('conexion.php');

$usuario = $_POST['usuario'];
$contrasena = $_POST['contrasena'];

$query = "SELECT * FROM empleados WHERE rpe_empleado = ?";
$queryVehiculos = "SELECT * FROM vehiculos WHERE no_economico = ?";

$sentenciaUser = $mysqli->prepare($query);
$sentenciaUser->bind_param('s', $usuario);
$sentenciaUser->execute();
$resultadoUser = $sentenciaUser->get_result();

$sentenciaVehiculos = $mysqli->prepare($queryVehiculos);
$sentenciaVehiculos->bind_param('s', $contrasena);
$sentenciaVehiculos->execute();
$resultadoVehiculos = $sentenciaVehiculos->get_result();

if ($resultadoUser->num_rows > 0 && $resultadoVehiculos->num_rows > 0) {
    session_start();
    
    $filaUsuario = $resultadoUser->fetch_assoc();
    $nombreUsuario = $filaUsuario['nombre_empleado'];
    $clave_zona = $resultadoVehiculos->fetch_assoc();
    $zona = $clave_zona['clave_zona'];

    $_SESSION["usuario"] = $usuario;
    $_SESSION["contrasena"] = $contrasena;
    
    echo json_encode(array('status' => 'Correcto', 'rpe_empleado' => $usuario, 'nombre_empleado' => $nombreUsuario, 'clave_zona' => $zona, 'no_economico' => $contrasena), JSON_UNESCAPED_UNICODE);
} else {
    echo json_encode(array('status' => 'Incorrecto'), JSON_UNESCAPED_UNICODE);
}

$sentenciaUser->close();
$sentenciaVehiculos->close();
$mysqli->close();

?>
