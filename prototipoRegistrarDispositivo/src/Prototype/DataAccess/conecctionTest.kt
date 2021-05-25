package Prototype.DataAccess

import Prototype.DataAccess.ConecctionDB
import java.sql.Connection
import java.sql.DriverManager


fun main() {
    val conection = ConecctionDB()
    val conected : Connection = conection.connection
    if (conected != null){
        println("Conexion establecida")
    }else{
        println("No se ha establecido la conexion")
    }
}