package br.senai.model;

import java.util.Date;

public class Comprador {
    private String nome;
    private String email;
    private String telefone;
    private String RG;
    private String Cpf;
    private String Endereco;
    private String Pagamento;
    private int Numerocartao;
    private Date Datavencimento;
    private int cod;
    private String Parcelas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getPagamento() {
        return Pagamento;
    }
    public void setPagamento(String pagamento) {
        Pagamento = pagamento;
    }
    public int getNumerocartao() {
        return Numerocartao;
    }
    public void setNumerocartao(int numerocartao) {
        Numerocartao = numerocartao;
    }
    public Date getDatavencimento() {
        return Datavencimento;
    }
    public void setDatavencimento(Date datavencimento) {
        Datavencimento = datavencimento;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public String getParcelas() {
        return Parcelas;
    }
    public void setParcelas(String parcelas) {
        Parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", RG='" + RG + '\'' +
                ", Cpf='" + Cpf + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", Pagamento='" + Pagamento + '\'' +
                ", Numerocartao=" + Numerocartao +
                ", Datavencimento=" + Datavencimento +
                ", cod=" + cod +
                ", Parcelas='" + Parcelas + '\'' +
                '}';
    }
}

