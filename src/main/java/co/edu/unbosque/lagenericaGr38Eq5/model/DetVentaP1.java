package co.edu.unbosque.lagenericaGr38Eq5.model;

import java.lang.reflect.Array;

import javax.lang.model.type.ArrayType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="db_ventas")
public class DetVentaP1 {

	
	private int codProducto1;
	private int cantProducto1;
	private double precioCompra1;
	private double ivaCompra1;
	private double precioVenta1;
	
	public DetVentaP1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetVentaP1(int codProducto1, int cantProducto1, double precioCompra1, double ivaCompra1,
			double precioVenta1) {
		super();
		this.codProducto1 = codProducto1;
		this.cantProducto1 = cantProducto1;
		this.precioCompra1 = precioCompra1;
		this.ivaCompra1 = ivaCompra1;
		this.precioVenta1 = precioVenta1;
	}

	public int getCodProducto1() {
		return codProducto1;
	}

	public void setCodProducto1(int codProducto1) {
		this.codProducto1 = codProducto1;
	}

	public int getCantProducto1() {
		return cantProducto1;
	}

	public void setCantProducto1(int cantProducto1) {
		this.cantProducto1 = cantProducto1;
	}

	public double getPrecioCompra1() {
		return precioCompra1;
	}

	public void setPrecioCompra1(double precioCompra1) {
		this.precioCompra1 = precioCompra1;
	}

	public double getIvaCompra1() {
		return ivaCompra1;
	}

	public void setIvaCompra1(double ivaCompra1) {
		this.ivaCompra1 = ivaCompra1;
	}

	public double getPrecioVenta1() {
		return precioVenta1;
	}

	public void setPrecioVenta1(double precioVenta1) {
		this.precioVenta1 = precioVenta1;
	}

	@Override
	public String toString() {
		return "DetVentaP1 [codProducto1=" + codProducto1 + ", cantProducto1=" + cantProducto1 + ", precioCompra1="
				+ precioCompra1 + ", ivaCompra1=" + ivaCompra1 + ", precioVenta1=" + precioVenta1 + "]";
	}

	
	
	
}