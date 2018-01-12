/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conf.NewHibernateUtil;
import entity.Candidato;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario
 */
public class candidatoDAO {
    
    private Transaction transaction;
    private Session session;
    
    public void addCandidato(Candidato candidato){
        session = NewHibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        try{
            session.save(candidato);
            transaction.commit();
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        
    }
    
    
    
}
