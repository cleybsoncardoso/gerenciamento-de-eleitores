/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ADM
 */
public class EleitoresNovo implements Serializable, Comparable<EleitoresNovo> {

    private String nome;
    private String nascimento;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String CEP;
    private String email;
    private String telefone, celular1, celular2;
    private ArrayList<String> comentario;
    private String dateFormat;
    private int d, m;
    private boolean enviada;
    private boolean marcado;

    public EleitoresNovo(String nome, String nascimento, String rua, String numero, String bairro, String cidade, String CEP, String telefone, String celular1, String celular2, String email, String dateFormat) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
        this.telefone = telefone;
        this.comentario = new ArrayList<String>();
        this.email = email;
        this.nascimento = nascimento;
        this.dateFormat = dateFormat;
        if (!this.nascimento.equals("  /  /    ")) {
            this.d = Integer.parseInt(this.nascimento.substring(0, 2));
            this.m = Integer.parseInt(this.nascimento.substring(3, 5));
        }
        this.enviada = false;
        this.celular1 = celular1;
        this.celular2 = celular2;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getNascimento() {
        return nascimento;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getDia() {
        return d;
    }

    public int getMes() {
        return m;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<String> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<String> comentario) {
        this.comentario = comentario;
    }

    @Override
    public int compareTo(EleitoresNovo o) {
        return nome.compareTo(o.getNome());
    }

}
