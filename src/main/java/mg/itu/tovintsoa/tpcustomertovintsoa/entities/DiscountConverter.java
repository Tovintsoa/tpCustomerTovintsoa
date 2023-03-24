/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tovintsoa.tpcustomertovintsoa.entities;

import jakarta.ejb.EJB;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import mg.itu.tovintsoa.tpcustomertovintsoa.ejb.DiscountManager;

/**
 *
 * @author Tovintsoa-Capri
 */
@FacesConverter(value="discountConverter",managed=true)
public class DiscountConverter implements Converter<Discount> {
    @EJB
    private DiscountManager discountManager;
    
    @Override
    public Discount getAsObject(FacesContext fc, UIComponent uic, String string) {
         if (string == null) return null;
        return discountManager.findById(string);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Discount t) {
        if (t == null) return "";
         return t.getCode();
    }
    
}
