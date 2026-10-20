```mermaid

classDiagram

class Aluno{
    -pessoa:Pessoa;
    matriculas:ArrayList~Matricula~

}

class Professor{
    -pessoa:Pessoa;
    -curso:String
    -materiasLecionadas:ArrayList
    salario:Double

}

class Coordernador{
    pessoa:Pessoa
}

class Diretor{
    pessoa:Pessoa
    campus:String
}

class Pessoa{
    -id:int
    -nome:String
    -email:String
    -dataDeNasc:LocalDate

}

class Coordenador{
    curso:Curso
}

class Matricula{
    -numero:String
    -curso:String

}

class Disciplina


Pessoa <| -- Professor
Pessoa <| -- Aluno
Pessoa <| -- Diretor
Pessoa <| -- Coordenador


Professor <| -- Coordenador

Coordenador *-- Coordenadorias
Coordenadorias o-- Curso