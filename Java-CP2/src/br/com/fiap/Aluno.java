package br.com.fiap;

import java.time.LocalDate;
import java.time.Period;

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
            System.out.println(e.getMessage());
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
        try {
            LocalDate anoAtual = LocalDate.now(); // Pega a data atual do sistema
            if (dataDeNascimento.getYear() >= 1900 && dataDeNascimento.getYear() <= anoAtual.getYear()) { // Dentro da condição ele vai pegar o ano da data inserida pelo usuario e verificar se é maior que 1900 -- Novamente ele o ano da data inserida pelo usuario e verifica se é maior ou igual ao ano atual da data do sistema.
                this.dataDeNascimento = dataDeNascimento; // Caso esteja tudo dentro da regra de negocios ele setta a data.
            } else {
                this.dataDeNascimento = LocalDate.parse("1900-01-01"); // Para melhor exibição, caso ele não esteja dentro dos padrões ele insere a data acima (podemos analisar e tirar)
                System.out.println("DATA DE NASCIMENTO INVÁLIDA!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }}

        public String calculaIdadeCompleta(int anoAtual) {
            Period periodo = Period.between(dataDeNascimento, LocalDate.now());
            
            String idadeCompleta = periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias";

            return idadeCompleta;
        }
}
