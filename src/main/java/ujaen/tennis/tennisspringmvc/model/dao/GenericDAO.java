package ujaen.tennis.tennisspringmvc.model.dao;

import java.util.List;

public interface GenericDAO<T,K>{
    T buscaId(K id);
    List<T> buscaTodos();
    boolean crea(T c);
    boolean guarda(T c);
    boolean borra(K id);
}
