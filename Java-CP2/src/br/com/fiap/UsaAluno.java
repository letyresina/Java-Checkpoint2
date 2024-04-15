//Duvidas que tenho, qual a necessidade do anoAtual aqui e no metodo calcular idade
//Onde esta comentado com leticia, tirar os coments e colocar suas informações reais
//Terminar os outros dois objetos com passagem de parametros e input do usuario (Olha melhor no documento) 
// Falta fazer os packages Bean e Main e atribuir a class/file Aluno no package Bean e UsaAluno dentro do Package Main
// Não esquecer de fazer os imports dos packages import br.com.fiap.bean.Aluno;

package br.com.fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class UsaAluno {
    public static void main(String[] args) {
        LocalDate anoAtual;

        try {
            // Declaração, instanciação e exibição de dois objetos com constructor vazio.
            Aluno vitor = new Aluno();
            Aluno leticia = new Aluno();

            vitor.setNome("Vitor Hugo Gonçalves Rodrigues");
            vitor.setRm(97758);
            vitor.setDataDeNascimento(LocalDate.parse("2005-03-08")); // LocalDate.parse() define uma data -- OBS: settar no formato americano, caso deseje alterar o formato use o ofPattern(dd-MM-yyyy).
            
            //leticia.setNome(null);
            //leticia.setRm(12345);
            //leticia.setDataDeNascimento(LocalDate.parse("seu niver"));

            JOptionPane.showMessageDialog(null, "RM: " + vitor.getRm() + " - NOME: " + vitor.getNome() + " - IDADE COMPLETA: " + vitor.calculaIdadeCompleta(anoAtual));
            //JOptionPane.showMessageDialog(null, "RM: " + leticia.getRm() + " - NOME: " + leticia.getNome() + " - Idade completa: " + leticia.calculaIdadeCompleta(anoAtual));      
            
            // Declaração, instanciação e exibição de dois objetos com constructor com passagem de parametros.


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

/*Exemplo de formatação de formato de data
    LocalDate data = vitor.getDataDeNascimento();
    DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formatada = data.format(dft);
    System.out.println(formatada);
 */