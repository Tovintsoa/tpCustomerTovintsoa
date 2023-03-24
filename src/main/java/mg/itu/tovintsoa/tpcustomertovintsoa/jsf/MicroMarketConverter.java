/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package mg.itu.tovintsoa.tpcustomertovintsoa.jsf;
import jakarta.ejb.EJB;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import mg.itu.tovintsoa.tpcustomertovintsoa.ejb.MicroMarketManager;
import mg.itu.tovintsoa.tpcustomertovintsoa.entities.MicroMarket;

/**
 *
 * @author Tovintsoa-Capri
 */
@FacesConverter(value="microMarketConverter",managed=true)
public class MicroMarketConverter implements Converter<MicroMarket> {
    @EJB
    MicroMarketManager microMarketManager;
    @Override
    public MicroMarket getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null) return null;
        return microMarketManager.findById(string);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, MicroMarket t) {
        if (t == null) return "";
         return t.getZipCode();
    }
    
}
