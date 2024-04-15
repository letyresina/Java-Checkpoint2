package br.com.fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class UsaAluno {
    public static void main(String[] args) {
    	LocalDate dataAtual = LocalDate.now();

        try {
            // Declaração, instanciação e exibição de dois objetos com constructor vazio.
            Aluno vitor = new Aluno();
            Aluno leticia = new Aluno();

            vitor.setNome("Vitor Hugo Gonçalves Rodrigues");
            vitor.setRm(97758);
            vitor.setDataDeNascimento(LocalDate.parse("2005-03-08")); // LocalDate.parse() define uma data -- OBS: settar no formato americano, caso deseje alterar o formato use o ofPattern(dd-MM-yyyy).
            
            leticia.setNome("Leticia Cristina Gandarez Resina");
            leticia.setRm(98069);
            leticia.setDataDeNascimento(LocalDate.parse("2004-08-04"));

            JOptionPane.showMessageDialog(null, "RM: " + vitor.getRm() + " - NOME: " + vitor.getNome() + " - IDADE COMPLETA: " + vitor.calculaIdadeCompleta(dataAtual));
            JOptionPane.showMessageDialog(null, "RM: " + leticia.getRm() + " - NOME: " + leticia.getNome() + " - Idade completa: " + leticia.calculaIdadeCompleta(dataAtual));      
            
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