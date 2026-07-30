public class Main{

    void main() {
        
        //faça um programa que o usuario deve informar
        // sigla - da diciplina
        //todos os dias da semana que tem aula dessa diciplina

        //por fim imprima:
        // na disciplina **** voce tem aulas nos seguintes dias:
        // seg
        // - qua
        //- sex

        
        
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
                discCount++;
                do { 
                entrada = IO.readln("dia da semana:").toLowerCase();
                boolean sair = false;

                switch (entrada) {
                    case "seg","ter","qua","qui","sex" ->{
                        agenda[discCount][dia] = entrada;
                        dia++;
                    }
                    case "nao" -> {sair = true;}
                    default -> System.out.println("opçao invalida");

                    
                }

                if(sair){
                    break;
                }

                // if(entrada.equals("nao")){
                //     break;
                // }
                // else{
                //     dias[dia] = entrada;
                //     dia++;
                // }
            } while (dia<  agenda[discCount].length );
            }





            

        }















        // do { 

        //     String disciplina = IO.readln("informe uma disciplina: ");

        //     do { 
        //         entrada = IO.readln("dia da semana:").toLowerCase();
        //         boolean sair = false;

        //         switch (entrada) {
        //             case "seg","ter","qua","qui","sex" ->{
        //                 agenda[discCount][dia] = entrada;
        //                 dia++;
        //             }
        //             case "nao" -> {sair = true;}
        //             default -> System.out.println("opçao invalida");

                    
        //         }

        //         if(sair){
        //             break;
        //         }

        //         // if(entrada.equals("nao")){
        //         //     break;
        //         // }
        //         // else{
        //         //     dias[dia] = entrada;
        //         //     dia++;
        //         // }
        //     } while (dia<  agenda.length );

        // } while (discCount < agenda.length);

      

        


        
        if(agenda[0][0] == null){
            System.out.println("voce nao informou nem um dia para uma disciplina");
        }
        else{
            System.out.print("Voce tem aula nos seguintes dias: ");

            for(int i =0; i < discCount; i++){
                if(nomesDisciplinas[i] == null){
                    break;
                }
                for(String diaDasemana : agenda[i]){
                    if(diaDasemana == null){
                        continue;
                    }
                    System.out.print(diaDasemana+", ");
                }

            System.out.print(agenda[i]+", ");
            }
        }

        
        
       
        System.out.println();
    }
}