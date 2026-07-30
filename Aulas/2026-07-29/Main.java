public class Main{

    void main() {
        
        //faça um programa que o usuario deve informar
        // sigla - da diciplina
        //todos os dias da semana que tem aula dessa diciplina

        //até 5 diciplinas

        //por fim imprima:
        // na disciplina **** voce tem aulas nos seguintes dias:
        // seg,ter,qua.qui.sex

        
        
        String[][] agenda = new String[5][5];
        String[] nomesDisciplinas = new String[5];
        String entrada;
        int dia = 0;
        int discCount = 0;


        for(String[] disciplina : agenda){

            String entradaDisci = IO.readln("entre com uma disciplina: ");
            if(entradaDisci.toLowerCase().equals("nao")){
                System.out.println("************************");
                break;
            }
            else if(entradaDisci.isBlank()){
                System.out.println("entrada invalida");
            }
            else{
                nomesDisciplinas[discCount] = entradaDisci;
                
                do { 
                entrada = IO.readln("dia da semana:").toLowerCase();
                boolean sair = false;

                switch (entrada) {
                    case "seg","ter","qua","qui","sex" ->{
                        agenda[discCount][dia] = entrada;
                        dia++;
                    }
                    case "nao" -> {sair = true; discCount++; dia = 0;}
                    default -> System.out.println("opçao invalida");

                }

                if(sair){
                    break;
                }

                } while (dia<  agenda[discCount].length );
            }

        }

        if(agenda[0][0] == null){
            System.out.println("voce nao informou nem um dia para uma disciplina");
        }
        else{
            System.out.print("Voce tem aula nos seguintes dias: ");

            for(int i =0; i < discCount; i++){
                System.out.println();
                if(agenda[i][0] == null){
                    break;
                }

                System.out.print(nomesDisciplinas[i]+": ");
                for(String diaDasemana : agenda[i]){
                    if(diaDasemana == null){
                        continue;
                    }
                    System.out.print(diaDasemana+", ");
                }
            }
        }

        System.out.println();
    }
}