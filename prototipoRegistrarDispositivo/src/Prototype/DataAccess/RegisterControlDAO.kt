package Prototype.DataAccess

import Prototype.Domain.Control
import java.sql.Connection

fun registerControl(control: Control): Int{
    val conection = ConecctionDB()
    val conected : Connection = conection.connection
    val statement = conected.prepareStatement("INSERT INTO Control (estado, marca, claveDispositivo, "+
            "descripcion, claveProductoAsociado) VALUES (?,?,?,?,?) ")
    statement.setString(1,control.estado)
    statement.setString(2,control.marca)
    statement.setString(3,control.claveDispositivo)
    statement.setString(4,control.descripcion)
    statement.setString(5,control.claveProductoAsociado)
    val answer = statement.executeUpdate()
    conection.closeConnection()
    return answer
}