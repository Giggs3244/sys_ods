package co.com.funlam.ods.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.funlam.ods.entity.Objetivo;
import co.com.funlam.ods.projection.VotosObjetivo;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, Long> {

    @Query(value = "SELECT ob.TITULO AS name, COUNT(*) AS value FROM PERSONA p JOIN OBJETIVOFUNDAMENTAL o ON p.IDPERSONA = o.IDPERSONA JOIN OBJETIVO ob ON o.IDOBJETIVO = ob.IDOBJETIVO GROUP BY o.IDOBJETIVO ORDER BY ob.TITULO", nativeQuery = true)
    public List<VotosObjetivo> getVotosObjetivos();

    @Query(value = "SELECT ob.TITULO AS name, COUNT(*) AS value FROM PERSONA p JOIN OBJETIVOFUNDAMENTAL o ON p.IDPERSONA = o.IDPERSONA JOIN OBJETIVO ob ON o.IDOBJETIVO = ob.IDOBJETIVO WHERE p.IDEDUCACION = ?1 GROUP BY o.IDOBJETIVO ORDER BY ob.TITULO", nativeQuery = true)
    public List<VotosObjetivo> getVotosObjetivosByNivelEducacion(Long idEducacion);

    @Query(value = "SELECT ob.TITULO AS name, COUNT(*) AS value FROM PERSONA p JOIN OBJETIVOFUNDAMENTAL o ON p.IDPERSONA = o.IDPERSONA JOIN OBJETIVO ob ON o.IDOBJETIVO = ob.IDOBJETIVO WHERE p.SEXO = ?1 GROUP BY o.IDOBJETIVO ORDER BY ob.TITULO", nativeQuery = true)
    public List<VotosObjetivo> getVotosObjetivosBySexo(String sexo);

    @Query(value = "SELECT ob.TITULO AS name, COUNT(*) AS value FROM PERSONA p JOIN OBJETIVOFUNDAMENTAL o ON p.IDPERSONA = o.IDPERSONA JOIN OBJETIVO ob ON o.IDOBJETIVO = ob.IDOBJETIVO WHERE FLOOR(DATEDIFF(dd, p.FECHANACIMIENTO, CURRENT_DATE)/365.25) >= ?1 GROUP BY o.IDOBJETIVO ORDER BY ob.TITULO", nativeQuery = true)
    public List<VotosObjetivo> getVotosObjetivosByEdad(Integer edad);

    @Query(value = "SELECT COUNT(o.IDOBJETIVOFUNDAMENTAL) AS value FROM OBJETIVOFUNDAMENTAL o", nativeQuery = true)
    public Integer getCantidadVotosObjetivos();

    @Query(value = "SELECT o.IDOBJETIVO AS idObjetivo, o.TITULO AS titulo, o.DESCRIPCION AS descripcion FROM OBJETIVO o ORDER BY o.IDOBJETIVO", nativeQuery = true)
    public List<co.com.funlam.ods.projection.Objetivo> getObjetivos();

}
