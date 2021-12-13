package co.edu.unbosque.lagenericaGr38Eq5.model;

import java.lang.reflect.Array;

import javax.lang.model.type.ArrayType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="db_ventas")
public class DetVentaP2 {

	
	private int codProducto2;
	private int cantProducto2;
	private double precioCompra2;
	private double ivaCompra2;
	private double precioVenta2;
	
	public DetVentaP2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetVentaP2(int codProducto2, int cantProducto2, double precioCompra2, double ivaCompra2,
			double precioVenta2) {
		super();
		this.codProducto2 = codProducto2;
		this.cantProducto2 = cantProducto2;
		this.precioCompra2 = precioCompra2;
		this.ivaCompra2 = ivaCompra2;
		this.precioVenta2 = precioVenta2;
	}

	
	public int getCodProducto2() {
		return codProducto2;
	}

	public void setCodProducto2(int codProducto2) {
		this.codProducto2 = codProducto2;
	}

	public int getCantProducto2() {
		return cantProducto2;
	}

	public void setCantProducto2(int cantProducto2) {
		this.cantProducto2 = cantProducto2;
	}

	public double getPrecioCompra2() {
		return precioCompra2;
	}

	public void setPrecioCompra2(double precioCompra2) {
		this.precioCompra2 = precioCompra2;
	}

	public double getIvaCompra2() {
		return ivaCompra2;
	}

	public void setIvaCompra2(double ivaCompra2) {
		this.ivaCompra2 = ivaCompra2;
	}

	public double getPrecioVenta2() {
		return precioVenta2;
	}

	public void setPrecioVenta2(double precioVenta2) {
		this.precioVenta2 = precioVenta2;
	}

	@Override
	public String toString() {
		return "DetVentaP2 [codProducto2=" + codProducto2 + ", cantProducto2=" + cantProducto2 + ", precioCompra2="
				+ precioCompra2 + ", ivaCompra2=" + ivaCompra2 + ", precioVenta2=" + precioVenta2 + "]";
	}

		
	
}