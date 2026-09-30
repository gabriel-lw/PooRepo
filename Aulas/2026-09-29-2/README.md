```mermaid
classDiagram

class Aviao{

    - int maxTripulantes
    - int maxPassageiros
    - int maxCombustivel
    - boolean ligado
    - ArrayList~Motor~
  

    +Aviao(maxTripulantes:int,
    maxPassageiro:int, maxCombustivel:int,
    numMotores:int,
    tipoMotor:String
    )

    +ligarAviao()
    +desligarAviao()

    +ligarMotorN(n:int)
    +desligarMotorN(n:int)

    
}

class Motor{
    - String tipoMotor
    - boolean ligado

    +ligarDesligarMotor(boolean estado)
    
}

Aviao "1" *-- "1..8" Motor : contains

```