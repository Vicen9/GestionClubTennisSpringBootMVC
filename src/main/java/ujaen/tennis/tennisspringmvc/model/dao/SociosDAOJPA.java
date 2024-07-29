package ujaen.tennis.tennisspringmvc.model.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ujaen.tennis.tennisspringmvc.model.Socio;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Repository("sociosDAOJPA")
@Transactional
public class SociosDAOJPA implements SociosDAO{
    private final Logger logger = Logger.getLogger(SociosDAOJPA.class.getName());


    @PersistenceContext
    private EntityManager em;

    public SociosDAOJPA(){}

    @Override
    public Socio buscaId(Integer id){
        Socio c=null;
        try {
            c=em.find(Socio.class, id);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);

        }
        return c;
    }

    @Override
    public List<Socio> buscaTodos(){
        List<Socio> ls = null;
        try {
            Query q = em.createQuery("Select s from Socio s", Socio.class);
            ls = (List<Socio>)q.getResultList();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return ls;
    }


    public Socio buscaByDNI(String dni){
        Socio s = null;
        try {
            TypedQuery<Socio> q = em.createQuery("Select s from Socio s where s.dni=:dni",Socio.class);
            q.setParameter("dni", dni);
            s = q.getSingleResult();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return s;
    }

    @Override
    public boolean crea(Socio s){
        boolean creado = false;
        try {
            em.persist(s);
            creado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return creado;
    }

    @Override
    public boolean guarda(Socio s){
        boolean guardado = false;
        try {
            s = em.merge(s);
            guardado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return guardado;
    }

    @Override
    public boolean borra(Integer id){
        boolean borrado = false;
        try {
            Socio s = null;
            s = em.find(Socio.class, id);
            em.remove(s);
            borrado = true;
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return borrado;
    }



}
