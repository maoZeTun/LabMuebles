/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import java.util.List;

/**
 *
 * @author don_d
 */
interface IServicioOfertaMockLocal {
    public void agregarOferta(Oferta oferta)throws OperacionInvalidaException;

    public List<Oferta> darOferta();
}
