package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    if (numero >= 5){
        return "Positivo"
    }
    return "No positivo"
}

fun clasificarNumero(numero: Int): String {
    if (numero >= 10){
        return "Mayor a 10"
    } else{
    return "Menor a 10"
    }
}

fun evaluarEdad(edad: Int): String {
    if (edad >= 25){
        return "Adulto mayor"
    } else if (edad <= 18){
        return "Menor de edad"
    } else {
        return "Adulto"
    }

}

fun obtenerDescuento(monto: Double): Double {
    return when {
        monto >= 200 -> 30.00
        monto >= 150 -> 20.00
        monto >= 100 -> 10.00
        else ->0.00
    }
}

fun calcular(operador: Char, a: Int, b: Int): Double {
    if ( b == 0){return 0.0
    }
    return when(operador){
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> (a / b).toDouble()
        else -> 0.0
    }
}
