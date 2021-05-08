package br.edu.ifpb.dac.atividade.saras2luzs2.repository;

import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Banda;
import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Integrante;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;
import javafx.scene.chart.PieChart;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class IntegrantePersistencia {

    @PersistenceContext(unitName = "dac-Pu")
    private EntityManager em;

    public void salvar(Integrante entidade) {
        em.merge(entidade);
    }

    public void remover(Integrante entidade) {

        try {
            em.remove(entidade);
        } catch (Exception e) {
            return;
        }
    }

    public Integrante find(long id) {
        //recupera uma entidade apartir de uma chave
        return em.find(Integrante.class, id);
    }

    public List<Integrante> list() {
        return em.createQuery("select i from Integrante i ", Integrante.class).getResultList();
    }

    public List<Integrante> localizarintegranteCPF(String cpf) {
        List<Integrante> result = Collections.EMPTY_LIST;
        String consulta = "SELECT * FROM integrante WHERE cpf ilike '" + cpf + "%' ";

        Query query = em.createNativeQuery(consulta, Integrante.class);
        result = query.getResultList();
        return result;
    }

    public List<Integrante> localizarintegranteData() {

        //Query query = em.createNamedQuery("select * from Integrante i where i.datadenascimento between ? and ?",Integrante.class);
        List<Integrante> result = Collections.EMPTY_LIST;
        String consulta = "select * from Integrante i where i.datadenascimento  between ? and ?";
        Query query = em.createNativeQuery(consulta, Integrante.class);
        query.setParameter(1, LocalDate.of(2000, Month.JANUARY, 1));
        query.setParameter(2, LocalDate.of(2016, Month.APRIL, 20));
        result = query.getResultList();
        return result;
    }

}
