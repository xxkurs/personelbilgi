  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakurs.personelbilgi.facade;

import com.javakurs.personelbilgi.entity.Kisi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author BEM
 */
@Stateless
public class KisiFacade extends AbstractFacade<Kisi> {
    @PersistenceContext(unitName = "com.javakurs_PeronelBilgi_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KisiFacade() {
        super(Kisi.class);
    }
    
}
