package br.edu.ifpb.dac.atividade.saras2luzs2.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CPF implements Serializable {

    private static final int TAMANHO = 11;
    
    private String cpf;

    public CPF() {
    }

    public CPF(String numero) {
        this.cpf = numero;
    }

    public boolean valido() {
        return this.cpf.length() == TAMANHO;
    }

    // 111.222.333-44
    public String formatado() {
        return String.format("%s.%s.%s-%s",
                this.cpf.substring(0, 3), // 111222
this.cpf.substring(3, 6),
                this.cpf.substring(6, 9),
                this.cpf.substring(9, 11)
        );
    }

}
