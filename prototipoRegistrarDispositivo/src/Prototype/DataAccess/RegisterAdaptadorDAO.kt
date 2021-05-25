package Prototype.DataAccess

import Prototype.Domain.Dispositivo
import java.sql.Connection

fun registerAdaptador(adaptador: Dispositivo): Int{
    val conection = ConecctionDB()
    val conected : Connection = conection.connection
    val statement = conected.prepareStatement("INSERT INTO Adaptador (estado, marca, claveDispositivo, "+
            "descripcion) VALUES (?,?,?,?)")
    statement.setString(1,adaptador.estado)
    statement.setString(2,adaptador.marca)
    statement.setString(3,adaptador.claveDispositivo)
    statement.setString(4,adaptador.descripcion)
    val answer = statement.executeUpdate()
    conection.closeConnection()
    return answer
}