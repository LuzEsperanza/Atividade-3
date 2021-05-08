/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.atividade.saras2luzs2.repository;


import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * 
 */
@Stateless
public class Teste {

    public Teste() {
    }
    @PersistenceContext(unitName = "dac-Pu")
    private EntityManager em;

    public void salvar(Usuario entidade) {
        System.err.println("Save " + entidade);
        em.persist(entidade);
    }
}
