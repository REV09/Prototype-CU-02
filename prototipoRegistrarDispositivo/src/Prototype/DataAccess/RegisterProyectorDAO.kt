package Prototype.DataAccess

import Prototype.Domain.Proyector
import java.sql.Connection

fun registerProyector(proyector: Proyector): Int{
    val conection = ConecctionDB()
    val conected : Connection = conection.connection
    val statement = conected.prepareStatement("INSERT INTO Proyector (estado, marca, claveDispositivo, "+
            "descripcion, capacidad) VALUES (?,?,?,?,?)")
    statement.setString(1,proyector.estado)
    statement.setString(2,proyector.marca)
    statement.setString(3,proyector.claveDispositivo)
    statement.setString(4,proyector.descripcion)
    statement.setString(5,proyector.capacidad)
    val answer = statement.executeUpdate()
    conection.closeConnection()
    return answer
}