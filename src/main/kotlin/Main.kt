fun main(args: Array<String>) {

    print("Insira abaixo seu valor de venda para saber sua comissão: ")
    var comissao = readLine()!!.toDouble()

    if (comissao < 1000){
        println("Você não receberá comissão")
    }else if (comissao >= 1000 && comissao <= 5000){
        comissao = comissao * 0.1
        println("Sua comissão será de: $comissao")
    }else if (comissao > 5000 && comissao <= 10000){
        comissao = comissao * 0.2
        println("Sua comissão será de: $comissao")
    }else if (comissao > 10000) {
        comissao = comissao * 0.3
        println("Sua comissão será de: $comissao")
    }else{
        println("Comissão inválida")
    }
}