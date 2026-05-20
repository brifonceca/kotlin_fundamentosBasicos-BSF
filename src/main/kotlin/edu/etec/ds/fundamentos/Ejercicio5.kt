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
    var suma = 0
    for (numero in numeros) {
        suma += numero
    }
    return suma
}

fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    var contador = 0
    for (letra in texto) {
        if (letra in "aeiouAEIOU") {
            contador++
        }
    }
    return contador
}

fun esPalindromo(texto: String): Boolean {
    val textosinespacio = texto.filter { !it.isWhitespace() }
    return textosinespacio.reversed() == textosinespacio
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val lista = 1..10
    val tabla = mutableListOf<Int>()
    for (i in lista){
        tabla.add(i*numero)
    }
    return tabla
}
