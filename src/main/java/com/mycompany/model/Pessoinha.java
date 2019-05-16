/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author desmerio
 */
public class Pessoinha {

    private static List<Pessoinha> pessoinhas = new ArrayList<>();

    public static void setPessoinhas(List<Pessoinha> p) {
        Pessoinha.pessoinhas = p;
    }

    public static List<Pessoinha> getPessoinhas() {
        return new ArrayList<>() {
            {
                addAll(Pessoinha.pessoinhas);
            }
        };
    }

    private final String cpf;
    private final String nome;
    private final String email;

    public String getCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Pessoinha comEmail(String email) {
        return new Pessoinha(this.cpf, this.nome, email);
    }

    public Pessoinha comNome(String nome) {
        return new Pessoinha(this.cpf, nome, this.email);
    }

    public Pessoinha(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return pessoinhas.indexOf(this)+" - CPF: " + cpf + " - " + nome + " - " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoinha){
            return this.cpf.equals(((Pessoinha)obj).getCPF());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.cpf);
        return hash;
    }
    
    

}
