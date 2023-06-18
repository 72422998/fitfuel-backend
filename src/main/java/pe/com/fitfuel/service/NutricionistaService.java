package pe.com.fitfuel.service;

import pe.com.fitfuel.exception.NutricionistaException;
import pe.com.fitfuel.models.Nutricionista;

import java.util.List;

public interface NutricionistaService {
    /**
    * Obtiene todos los nutricionistas
    *
    * @return Lista nutricionistas
    *  */
    List<Nutricionista> findAll();
    /**
     * Obtiene un nutricionista por id
     *
     * @param id ID del nutricionista
     * @return nutricionista encontrado,o null si no existe
     *  */
    Nutricionista findById(Integer id);
    /**
     * Agrega un nuevo nutricionista
     *
     * @param  n  Nutricionista a agregar
     * @return El nutricionista agregado
     *  */
    Nutricionista add(Nutricionista n)throws NutricionistaException;
    /**
     * Actualiza un nutricionista existente
     *
     * @param  n  Nutricionista a actualizar
     * @return El nutricionista actualizado
     *  */
    Nutricionista update(Nutricionista n)throws NutricionistaException;
    /**
     * Elimina un nutricionista existente
     *
     * @param  n  Nutricionista a eliminar
     *  */
    Nutricionista delete(Nutricionista n)throws NutricionistaException;
}
