package co.edu.unbosque.lagenericaGr38Eq5.controller;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.ConsoleHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.lagenericaGr38Eq5.model.Ventas;
import co.edu.unbosque.lagenericaGr38Eq5.model.DetalleVenta;
import co.edu.unbosque.lagenericaGr38Eq5.repository.VentasRepository;

@SuppressWarnings("unused")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")


public class VentasController {
	@Autowired
	VentasRepository ventasRepository;
	
	//@RequestMapping("/api")
	
	@PostMapping("/db_ventas")
	public ResponseEntity<Ventas> createVentas(@RequestBody Ventas ventas) {
		try {
			Ventas _vents = ventasRepository.save(new Ventas(ventas.getCodigoVenta(), ventas.getCedulaCliente(), ventas.getNombreCliente(), ventas.getDetalleVenta(0, null, 0, 0, 0), ventas.getIvaCompraTotal(), ventas.getPrecioCompraTotal(), ventas.getPrecioVentaTotal()));
			System.out.println("Aqui create siiii");
			System.out.println(_vents);
			return new ResponseEntity<>(_vents, HttpStatus.CREATED);
			}catch (Exception e) {
				System.out.println("Aqui create");
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}

		
	private int codigoVenta() {
		// TODO Auto-generated method stub
		return 0;
	}


	@GetMapping("/db_ventas")
	  public ResponseEntity<List<Ventas>> getAllVentas(@RequestParam(required = false) String cedulaCliente) {
		  try {
			    List<Ventas> vents = new ArrayList<Ventas>();
			    System.out.println(vents);
			    System.out.println("vents");
			    	  

			    if (cedulaCliente == null)
			      System.out.println("vents null");
			      System.out.println(vents);
			      ventasRepository.findAll().forEach(vents::add);
			      System.out.println(vents);
			    

			    if (vents.isEmpty()) {
			    	System.out.println("vents Empty");
			    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			      }
			    System.out.println("Aqui GetAll hay datos");
			    return new ResponseEntity<>(vents, HttpStatus.OK);
			    
			  } catch (Exception e) {
				  System.out.println("Aqui GetAll");
				  
			    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			  }
		  }
 
	@GetMapping("/db_ventas/{codigoVenta}")
	
	  public ResponseEntity<Ventas> getVentasBycedulaCliente(@PathVariable("codigoVenta") int codigoVenta) {
		  Optional<Ventas> ventasData = ventasRepository.findBycodigoVenta(codigoVenta);

		  if (ventasData.isPresent()) {
		    return new ResponseEntity<>(ventasData.get(), HttpStatus.OK);
		  } else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	  }

//	@PostMapping("/db_ventas")
//	public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
//		try {
//			Producto _product = productoRepository.save(new Producto(producto.getId(), producto.getCodProducto(), producto.getNomProducto(), producto.getNitProveedor(), producto.getPrecioCompra(), producto.getIvaCompra(), producto.getPrecioVenta()));
//			return new ResponseEntity<>(_product, HttpStatus.CREATED);
//		}catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//	}
//	
//	@GetMapping("/db_ventas")
//	  public ResponseEntity<List<Producto>> getAllProducto(@RequestParam(required = false) String nomProducto) {
//		  try {
//			    List<Producto> products = new ArrayList<Producto>();
//
//			    if (nomProducto == null)
//			      productoRepository.findAll().forEach(products::add);
//			    else
//			      productoRepository.findByNomProducto(nomProducto).forEach(products::add);
//
//			    if (products.isEmpty()) {
//			      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			    }
//
//			    return new ResponseEntity<>(products, HttpStatus.OK);
//			} catch (Exception e) {
//			    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//	  }

}


	

