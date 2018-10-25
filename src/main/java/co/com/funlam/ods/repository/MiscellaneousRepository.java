package co.com.funlam.ods.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.funlam.ods.entity.TipoIdentificacion;
import co.com.funlam.ods.projection.Selector;

@Repository
public interface MiscellaneousRepository extends JpaRepository<TipoIdentificacion, Long> {

    @Query(value = "SELECT t.IDTIPOID AS value, t.TEXTO AS text FROM TIPOIDENTIFICACION t ORDER BY t.IDTIPOID", nativeQuery = true)
    public List<Selector> getTiposIdentificacion();

    @Query(value = "SELECT n.IDEDUCACION AS value, n.TITULO AS text FROM NIVELEDUCACION n ORDER BY n.IDEDUCACION", nativeQuery = true)
    public List<Selector> getNivelesEducacion();

    @Query(value = "SELECT d.IDDPTO AS value, d.NOMBRE AS text FROM DEPARTAMENTO d ORDER BY d.NOMBRE", nativeQuery = true)
    public List<Selector> getDepartamentos();

    @Query(value = "SELECT c.IDCIUDAD AS value, c.NOMBRE AS text FROM CIUDAD c WHERE c.IDDEPARTAMENTO = ?1 ORDER BY c.NOMBRE", nativeQuery = true)
    public List<Selector> getCiudades(Long idDepartamento);

}
