package ujaen.tennis.tennisspringmvc.model.dao;

import org.springframework.stereotype.Repository;
import ujaen.tennis.tennisspringmvc.model.Socio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository("sociosDAOList")
public class SociosDAOList implements SociosDAO{
    private static ArrayList<Socio> socios=null;
    private static int idSocio = 1;

    public SociosDAOList() {
        if (socios == null) {
            socios = new ArrayList<>();
            socios.add(new Socio(idSocio++, "76594825A", 722457484, "Calle PaT", LocalDate.now(),"bat@gmail.com",2,"Paco","Lopez","Hombre", "Paypal"));
            socios.add(new Socio(idSocio++, "76234825A", 726457484, "Calle Biedma", LocalDate.now(),"qwrt@gmail.com",2,"Elena","Lopez","Mujer", "Visa"));
        }
    }

    @Override
    public Socio buscaId(Integer id) {
        Socio encontrado=null;
        for (Socio s: socios) {
            if (s.getIdSocio()==id) encontrado=s;
        }
        return encontrado;
    }
    @Override
    public List<Socio> buscaTodos() {
        return socios;
    }

    @Override
    public boolean crea(Socio s) {
        Socio ns=new Socio(s);
        ns.setIdSocio(idSocio);
        socios.add(ns);
        s.setIdSocio(idSocio);
        idSocio++;
        return true;
    }

    @Override
    public boolean guarda(Socio s) {
        boolean result=false;
        Socio ns=new Socio(s);
        for (int i=0; i<socios.size();i++) {
            if (socios.get(i).getIdSocio()==ns.getIdSocio()) {
                socios.set(i, ns);
                result=true;
            }
        }
        return result;
    }

    @Override
    public boolean borra(Integer id) {
        boolean result=false;
        for (int i=0; i<socios.size();i++) {
            if (socios.get(i).getIdSocio()==id) {
                socios.remove(i);
                result=true;
            }
        }
        return result;
    }

    public int numSocios() {
        return socios.size();
    }
}
