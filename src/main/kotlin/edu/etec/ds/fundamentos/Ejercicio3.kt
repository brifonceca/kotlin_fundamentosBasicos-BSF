package edu.etec.ds.fundamentos

fun saludar(): String {
    return "Hola, bienvenido!";
}

fun saludarConNombre(nombre: String): String {
   return "Hola, $nombre!";
}

fun saludarPersona(nombre: String, apellido: String): String {
    return "Hola, $nombre$apellido!";
}

fun saludarConDefault(nombre: String = "Usuario"): String {
    return "Hola, $nombre!";
}

fun crearSaludo(titulo: String, nombre: String): String {
    return "Hola, $titulo $nombre";

}

fun funcionSinRetorno(): Unit {

}

fun cuadrado(numero: Int): Int {
    return numero * numero;
}

fun contarCaracteres(texto: String): Int {
    TODO("Contar caracteres del string")
}

fun String.cuentaCaracteres(): Int {
    TODO("Extension para contar caracteres de un String")
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    TODO("Funcion infix para comparar numeros")
}

fun sumarTodos(vararg numeros: Int): Int {
    TODO("Sumar todos los numeros pasados como varargs")
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    TODO("Aplicar una operacion lambda a dos numeros")
}
