package co.com.funlam.ods.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.funlam.ods.entity.TipoIdentificacion;

@Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {
}
