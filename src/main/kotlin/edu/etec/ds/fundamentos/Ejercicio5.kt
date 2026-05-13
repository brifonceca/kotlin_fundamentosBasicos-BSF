package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var acumulador = 0
    for (i in 0..n){
        acumulador += i
    }
    return acumulador
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin){
        if (i % 2 == 0){
            contador++
        }
    }
    return contador
}

fun fibonacci(n: Int): Int {
    if (n<=1) return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun factorial(n: Int): Int {
    var resultado = 1
    for (i in 1..n){
        resultado*=i
    }
    return resultado
}
fun encontrarMaximo(numeros: List<Int>): Int {
    var maximo = numeros[0]
    for (numero in numeros){
        if (numero > maximo){
            maximo = numero
        }
    }
    return maximo
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var minimo = numeros[0]
    for (numero in numeros){
        if (numero < minimo){
            minimo = numero
        }
    }
    return minimo
}

fun sumarLista(numeros: List<Int>): Int {
    TODO("Sumar todos los elementos de la lista")
}

fun inverter(texto: String): String {
    TODO("Invertir la cadena de texto")
}

fun contarVocales(texto: String): Int {
    TODO("Contar las vocales en el texto (considerar mayusculas y minusculas)")
}

fun esPalindromo(texto: String): Boolean {
    TODO("Verificar si el texto es un palindromo (ignorando espacios)")
}

fun tablaMultiplicar(numero: Int): List<Int> {
    TODO("Retornar lista con la tabla de multiplicar del 1 al 10")
}
