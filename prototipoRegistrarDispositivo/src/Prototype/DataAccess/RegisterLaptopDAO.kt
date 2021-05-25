package Prototype.DataAccess

import Prototype.Domain.Laptop
import java.sql.Connection

fun registerLaptop(laptop: Laptop): Int{
    val conection = ConecctionDB()
    val conected : Connection = conection.connection
    val statement = conected.prepareStatement("INSERT INTO Laptop (estado, marca, claveDispositivo, "+
            "descripcion, procesador, capacidad) VALUES (?,?,?,?,?,?) ")
    statement.setString(1,laptop.estado)
    statement.setString(2,laptop.marca)
    statement.setString(3,laptop.claveDispositivo)
    statement.setString(4,laptop.descripcion)
    statement.setString(5,laptop.procesador)
    statement.setString(6,laptop.capacidad)
    val answer = statement.executeUpdate()
    conection.closeConnection()
    return answer
}