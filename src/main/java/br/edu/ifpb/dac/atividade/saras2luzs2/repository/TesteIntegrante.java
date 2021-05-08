/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.atividade.saras2luzs2.repository;

import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Integrante;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jose
 */
public class TesteIntegrante {

    public TesteIntegrante() {
    }
    
    public Integrante buscar(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dac-Pu");
        EntityManager em = emf.createEntityManager();
        return em.find(Integrante.class, 101L);
        
    }
}
