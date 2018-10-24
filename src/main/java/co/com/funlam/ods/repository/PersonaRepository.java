package co.com.funlam.ods.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.funlam.ods.entity.Persona;
import co.com.funlam.ods.projection.VotosObjetivo;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Query(value = "SELECT p.SEXO AS titulo, COUNT(*) AS cantidadVotos FROM PERSONA p GROUP BY p.SEXO", nativeQuery = true)
    public List<VotosObjetivo> getCantidadSexo();

    @Query(value = "SELECT ne.TITULO AS titulo, COUNT(*) AS cantidadVotos FROM PERSONA p JOIN NIVELEDUCACION ne ON p.IDEDUCACION = ne.IDEDUCACION GROUP BY ne.TITULO", nativeQuery = true)
    public List<VotosObjetivo> getCantidadNivelEducacion();

    @Query(value = "SELECT idh.GRADO AS titulo, COUNT(*) AS cantidadVotos FROM PERSONA p JOIN CIUDAD c ON p.IDCIUDAD = c.IDCIUDAD JOIN INDICEDLLOHUMANO idh ON idh.IDINDICEDLLOHUMANO = c.IDINDICEDLLOHUMANO GROUP BY idh.GRADO", nativeQuery = true)
    public List<VotosObjetivo> getCantidadIDH();

}
