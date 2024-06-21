package Servico;

import java.util.List;

public interface ServiceRepository<T extends Service> {
    T consultar(int id);
    void inserir(T servico);
    List<T> listarTodos();
}