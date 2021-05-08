/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.atividade.saras2luzs2.repository;

import java.util.List;

/**
 *
 * 
 */
public interface IFRepositore<T, KEY> {

    void atualizar(T entidade);

    T find(Class<T> tipo, KEY id);

    List<T> list(Class<T> tipo);

    void remover(T entidade);

    void salvar(T entidade);

}
