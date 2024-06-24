package Servico;

import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements ServiceRepository<Service> {
    private List<Service> servicos;
    public ServiceRepositoryImpl() {
        this.servicos = new ArrayList<>();
        this.popularCatalogo();
    }

    public Service consultar(int id) {
        for (Service servico : servicos) {
            if (servico.getId() == id) {
                return servico;
            }
        }
        return null;
    }

    public void inserir(Service servico) {
        servicos.add(servico);
    }

    @Override
    public List<Service> listarTodos() {
        return new ArrayList<>(servicos);
    }
    
	// Método privado para popular o catálogo de serviços (simulação)
    private void popularCatalogo() {
        ServiceBemEstar servico1 = new ServiceBemEstar(1, "Massagem Relaxante", "Massagem terapêutica para relaxamento muscular", 100.0, "Massagem");
        ServiceBemEstar servico2 = new ServiceBemEstar(2, "Yoga", "Aulas de yoga para relaxamento e flexibilidade", 120.0, "Yoga");

        this.inserir(servico1);
        this.inserir(servico2);
    }
}