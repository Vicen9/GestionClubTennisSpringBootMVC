package ujaen.tennis.tennisspringmvc.model.dao;

import org.springframework.stereotype.Repository;
import ujaen.tennis.tennisspringmvc.model.Socio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository("sociosDAOMap")
public class SociosDAOMap implements SociosDAO, Serializable {
    private Map<Integer,Socio> socios;
    private Integer idSocio=1;
    public SociosDAOMap(){
        socios=new HashMap<>();
    }

    @Override
    public Socio buscaId(Integer id){
        Socio busca=socios.get(id);
        if (busca!=null)
            busca=new Socio(busca);
        return busca;
    }
    @Override
    public List<Socio> buscaTodos(){
        return socios.values().stream().collect(Collectors.toList());
    }
    @Override
    public boolean crea(Socio s){
        Socio sc=new Socio(s);
        sc.setIdSocio(idSocio);
        socios.put(idSocio,sc);
        s.setIdSocio(idSocio);
        idSocio++;
        return true;
    }
    @Override
    public boolean guarda(Socio s){
        boolean guardado=false;
        if (socios.containsKey(s.getIdSocio())) {
            Socio ns=new Socio(s);
            socios.replace(s.getIdSocio(),ns);
            guardado=true;
        }
        return guardado;
    }

    @Override
    public boolean borra(Integer id) {
        boolean borrado=false;
        if (socios.containsKey(id)) {
            socios.remove(id);
            borrado = true;
        }
        return borrado;
    }

    public int numSocios(){
        return socios.size();
    }
/*
    @Override
    public Socio buscaByDNI(String dni) {
        Socio encontrado = null;

        for (Socio c:socios.values()){
            if (c.getDni().equals(dni)){
                encontrado=c;
                break;
            }
        }

        if (encontrado!=null) encontrado = new Socio(encontrado);
        return encontrado;
    }
    */
}
