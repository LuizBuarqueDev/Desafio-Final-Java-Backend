package dio.teste.DesafioFinalJavaBackend.repository;

import dio.teste.DesafioFinalJavaBackend.model.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Long> {
}
