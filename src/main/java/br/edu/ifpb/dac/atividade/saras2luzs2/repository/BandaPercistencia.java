package br.edu.ifpb.dac.atividade.saras2luzs2.repository;

import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Banda;
import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class BandaPercistencia {

    @PersistenceContext(unitName = "dac-Pu")
    private EntityManager em;

    public void salvar(Banda entidade) {
        em.merge(entidade);
    }

    public void atualizar(Banda entidade) {
        em.merge(entidade);
    }

    public void remover(long id) {
        em.remove(this.find(id));
    }

    public Banda find(long id) {
        //recupera uma entidade apartir de uma chave
        return em.find(Banda.class, id);
    }

    public List<Banda> list() {

        return em.createQuery("select b from Banda b ", Banda.class).getResultList();

    }

    public List<Banda> localizarLocalDeOrigem(String origem) {
        List<Banda> result = Collections.EMPTY_LIST;
        String consulta = "SELECT * FROM banda WHERE localdeorigem ilike '" + origem + "%' ";

        Query query = em.createNativeQuery(consulta, Banda.class);
        query.setParameter(1, origem);
        result = query.getResultList();
        return result;
    }
    public Banda localizarLocarPorNome(String nome) {
        
        String consulta = "SELECT * FROM banda WHERE nomefantasia ilike '" + nome + "%' ";

        Query query = em.createNativeQuery(consulta, Banda.class);
        return (Banda) query.getSingleResult();
        
    }
    
}
