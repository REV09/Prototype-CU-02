package Prototype.DataAccess

import Prototype.Domain.Cable
import java.sql.Connection

fun registerCable(cable: Cable): Int{
    val conection = ConecctionDB()
    val conected : Connection = conection.connection
    val statement = conected.prepareStatement("INSERT INTO Cable (estado, marca, claveDispositivo, "+
            "descripcion, adaptador) VALUES (?,?,?,?,?)")
    statement.setString(1,cable.estado)
    statement.setString(2,cable.marca)
    statement.setString(3,cable.claveDispositivo)
    statement.setString(4,cable.descripcion)
    statement.setString(5,cable.adaptador)
    val answer = statement.executeUpdate()
    conection.closeConnection()
    return answer
}