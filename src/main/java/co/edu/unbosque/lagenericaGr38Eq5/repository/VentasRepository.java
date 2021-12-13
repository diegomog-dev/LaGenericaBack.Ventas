package co.edu.unbosque.lagenericaGr38Eq5.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.lagenericaGr38Eq5.model.Ventas;
import co.edu.unbosque.lagenericaGr38Eq5.model.DetalleVenta;

public interface VentasRepository extends MongoRepository<Ventas, String>{
	List<Ventas> findByCedulaCliente(String cedulaCliente);

	Optional<Ventas> findBycodigoVenta(int codigoVenta);

	void deleteByCodigoVenta(int codigoVenta);

	Ventas save(Ventas entity);
}