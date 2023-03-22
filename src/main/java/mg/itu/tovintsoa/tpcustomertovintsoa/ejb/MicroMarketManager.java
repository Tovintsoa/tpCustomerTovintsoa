/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tovintsoa.tpcustomertovintsoa.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import mg.itu.tovintsoa.tpcustomertovintsoa.entities.MicroMarket;

/**
 *
 * @author Tovintsoa-Capri
 */
@Stateless
public class MicroMarketManager {
    @PersistenceContext
    private EntityManager em;
    
    public List<MicroMarket> getAllMicroMarket(){
        Query query = em.createNamedQuery("MicroMarket.findAll");
        System.out.print(query.getResultList());
        return query.getResultList();
    }
    public MicroMarket update(MicroMarket microMarket){
         return em.merge(microMarket);
    } 
    public void persist(MicroMarket customer) {
        em.persist(customer);
    }
    public MicroMarket findById(int idCustomer) {  
        return em.find(MicroMarket.class, idCustomer);  
    }
}
