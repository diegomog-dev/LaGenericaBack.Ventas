package co.edu.unbosque.lagenericaGr38Eq5.model;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.type.ArrayType;

import org.apache.tomcat.util.http.parser.Vary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import co.edu.unbosque.lagenericaGr38Eq5.model.DetalleVenta;


@Document(collection="db_ventas")


public class Ventas {
	
	@Id
	
	private int codigoVenta;
	private int cedulaCliente;
	private String nombreCliente;
	private double precioCompraTotal;
	private double ivaCompraTotal;
	private double precioVentaTotal;
	private DetalleVenta[] detalleVenta;
		
	public Ventas() {
		
	}
	
	
	public Ventas(int codigoVenta, int cedulaCliente, String nombreCliente, DetalleVenta[] detalleVenta, double precioCompraTotal,
			double ivaCompraTotal, double precioVentaTotal) {
		super();
		this.codigoVenta = codigoVenta;
		this.cedulaCliente = cedulaCliente;
		this.nombreCliente = nombreCliente;
		this.detalleVenta = detalleVenta;
		this.precioCompraTotal = precioCompraTotal;
		this.ivaCompraTotal = ivaCompraTotal;
		this.precioVentaTotal = precioVentaTotal;
	}

	
	public DetalleVenta[] getDetalleVenta() {
		return detalleVenta;
	}


	public int getCodigoVenta() {
		return codigoVenta;
	}


	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}


	public int getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(int cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public DetalleVenta[] getDetalleVenta(int i, Object object, double j, double k, double l) {
		return detalleVenta;
	}

	public void setDetalleVenta(DetalleVenta[] detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	public double getPrecioCompraTotal() {
		return precioCompraTotal;
	}

	public void setPrecioCompraTotal(double precioCompraTotal) {
		this.precioCompraTotal = precioCompraTotal;
	}

	public double getIvaCompraTotal() {
		return ivaCompraTotal;
	}

	public void setIvaCompraTotal(double ivaCompraTotal) {
		this.ivaCompraTotal = ivaCompraTotal;
	}

	public double getPrecioVentaTotal() {
		return precioVentaTotal;
	}

	public void setPrecioVentaTotal(double precioVentaTotal) {
		this.precioVentaTotal = precioVentaTotal;
	}

	@Override
	public String toString() {
		return "Ventas [cedulaCliente=" + cedulaCliente + ",nombreCliente=" + nombreCliente + ", detalleVenta="
				+ detalleVenta + ", precioCompraTotal=" + precioCompraTotal + ", ivaCompraTotal=" + ivaCompraTotal
				+ ", precioVentaTotal=" + precioVentaTotal + "]";
	
	}


	
	} 

			
	
