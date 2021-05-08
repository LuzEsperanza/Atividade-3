package br.edu.ifpb.dac.atividade.saras2luzs2.servico;

import br.edu.ifpb.dac.atividade.saras2luzs2.entidades.Integrante;
import br.edu.ifpb.dac.atividade.saras2luzs2.repository.IntegrantePersistencia;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class IntegranteServico {

    @Inject
    private IntegrantePersistencia integrantePersistencia;

    public IntegranteServico() {
       

    }

    public void add(Integrante integrante) {
            integrantePersistencia.salvar(integrante);
      
        
    }

    public Integrante buscarPorId(long id) {
        System.err.println("buis aid "+id);
        return this.integrantePersistencia.find(id);
    }

    public List<Integrante> todas() {
        return integrantePersistencia.list();
    }

    public void removeIntegrante(Integrante i) {
        integrantePersistencia.remover(buscarPorId(i.getId()));
    }

    public List<Integrante> localizarintegranteCPF(String cpf) {
        return integrantePersistencia.localizarintegranteCPF(cpf);
    }
    public List<Integrante> localizarintegranteData(){
       return integrantePersistencia.localizarintegranteData();
    }

}
