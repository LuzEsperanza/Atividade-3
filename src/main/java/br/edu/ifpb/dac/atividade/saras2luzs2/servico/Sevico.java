/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.atividade.saras2luzs2.servico;


import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Usuario;
import br.edu.ifpb.dac.atividade.saras2luzs2.repository.Teste;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jose
 */
@Stateless
public class Sevico {
    @Inject
    private Teste teste;

    public Sevico() {
    }

    public void save(Usuario u) {
       teste.salvar(u);
    }
    
    
}
