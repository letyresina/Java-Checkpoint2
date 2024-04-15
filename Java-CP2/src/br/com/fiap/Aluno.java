//Duvidas que tenho, qual a necessidade do anoAtual aqui e no metodo calcular idade
// Falta fazer os packages Bean e Main e atribuir a class/file Aluno no package Bean e UsaAluno dentro do Package Main

package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Aluno {
    private int rm;
    private String nome;
    private LocalDate dataDeNascimento;

    public Aluno(){} //Criação de constructors vazio e com passagem de parametros

    public Aluno(String nome, int rm, LocalDate dataDeNascimento){
        this.nome = nome;
        setRm(rm); // Não coloco um this.rm = rm; porque ele precisa passar pela verificação antes de definir o rm.
        setDataDeNascimento(dataDeNascimento); // A mesma coisa serve para a data de nascimento.
    }

    public int getRm() {
        return rm;
    }
    public void setRm(int rm) {
        try {
            if (rm >= 97001 && rm <= 551999) {
                this.rm = rm;
            } else {
                throw new Exception("RM INVÁLIDO!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        LocalDate minimo = LocalDate.parse("1899-12-31");
        LocalDate anoAtual = LocalDate.now(); // Pega a data atual do sistema
        try {
            if (dataDeNascimento.isAfter(minimo) && dataDeNascimento.isBefore(anoAtual)) { // Dentro da condição ele vai pegar o ano da data inserida pelo usuario e verificar se é maior que 1900 -- Novamente ele o ano da data inserida pelo usuario e verifica se é maior ou igual ao ano atual da data do sistema.
                this.dataDeNascimento = dataDeNascimento; // Caso esteja tudo dentro da regra de negocios ele setta a data.
            } else {
                throw new Exception("Data fora da faixa permitida (1900-01-01" + " - " + anoAtual + ")");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }}

        public String calculaIdadeCompleta(LocalDate dataAtual) {
            Period periodo = Period.between(dataDeNascimento, dataAtual);
            
            String idadeCompleta = periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias";

            return idadeCompleta;
        }
}
