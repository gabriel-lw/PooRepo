```mermaid

classDiagram

class Veiculo{
    
    velocidade:Double
    
    meioDePropulsao:String
    numeroOcupantes:int
    carga:
    acelerar(n:int)
}

class VeiculoTerrestre{
    rodas:int

}

class veiculoAquatico{
    
    
}

class Carro{
    //nao precisa
}

class Aviao{
    numeroMotores
    tipoDeMotores
    +

}

class Barco{
    tamanho:int
    atrito:double
    possuiAncora:bool
    ancoraLançada:bool
    lancarAncora() : bool
}

class Caminhao{
    possuiBasculante:bool
    basculanteaberto:bool
  
}

Veiculo <| -- VeiculoTerrestre
VeiculoTerrestre <| -- Caminhao
VeiculoTerrestre <| -- Carro

