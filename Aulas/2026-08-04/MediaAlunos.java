public class MediaAlunos {
    public static void main(String[] args) {
        
        int numeroAlunos = Integer.parseInt(IO.readln("numero de alunos: "));
        int numeroAvaliacoes = Integer.parseInt(IO.readln("numero de avaliacoes: "));

        double[][] notas = new double[numeroAlunos][numeroAvaliacoes+1];
        double[] somaAv = new double[notas[0].length-1];
        // double a1Soma = 0;
        // double a2Soma = 0;
        double mediaGeral =0;
        for (int k =0; k<notas.length;k++) {
            
            double somaAluno = 0;
            for(int i =0; i < notas[0].length-1;i++){
                
                double nota = Double.parseDouble(IO.readln("insira nota:"));
                somaAluno += nota;
                somaAv[i] += nota;
                //aluno[i] = nota;
                notas[k][i] = nota;
                
            }
            notas[k][notas[k].length-1] = Math.round(somaAluno/(notas[k].length-1));
            mediaGeral += notas[k][notas[k].length-1];
            System.out.println("====================");
        }

        // for (double[] notaLinha : notas) {
        //     for (double nt : notaLinha) {
        //         System.out.print(nt+ "   ");
        //     }
        //     System.out.println("");
        // }

      
        //imprimir medias

        for (int i =0; i< notas.length;i++) {
            for (double nt : notas[i]) {
                System.out.print(nt+ "   ");
            }
            System.out.println("");
        }

        for (double soma: somaAv) {
            System.out.print(String.format("%03d", (Math.round(  soma / (notas.length)))) +"   ");
        }
        System.out.println(String.format("%03d", (Math.round(mediaGeral/notas[0].length))));
        System.out.println("+++++++++++++++++++++++++++++++++++");






        




    }
}
