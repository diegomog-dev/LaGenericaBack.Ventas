package co.edu.unbosque.lagenericaGr38Eq5.model;

import java.lang.reflect.Array;

import javax.lang.model.type.ArrayType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="db_ventas")
public class DetVentaP3 {

	
	private int codProducto3;
	private int cantProducto3;
	private double precioCompra3;
	private double ivaCompra3;
	private double precioVenta3;
	
	public DetVentaP3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetVentaP3(int codProducto3, int cantProducto3, double precioCompra3, double ivaCompra3,
			double precioVenta3) {
		super();
		this.codProducto3 = codProducto3;
		this.cantProducto3 = cantProducto3;
		this.precioCompra3 = precioCompra3;
		this.ivaCompra3 = ivaCompra3;
		this.precioVenta3 = precioVenta3;
	}

	public int getCodProducto3() {
		return codProducto3;
	}

	public void setCodProducto3(int codProducto3) {
		this.codProducto3 = codProducto3;
	}

	public int getCantProducto3() {
		return cantProducto3;
	}

	public void setCantProducto3(int cantProducto3) {
		this.cantProducto3 = cantProducto3;
	}

	public double getPrecioCompra3() {
		return precioCompra3;
	}

	public void setPrecioCompra3(double precioCompra3) {
		this.precioCompra3 = precioCompra3;
	}

	public double getIvaCompra3() {
		return ivaCompra3;
	}

	public void setIvaCompra3(double ivaCompra3) {
		this.ivaCompra3 = ivaCompra3;
	}

	public double getPrecioVenta3() {
		return precioVenta3;
	}

	public void setPrecioVenta3(double precioVenta3) {
		this.precioVenta3 = precioVenta3;
	}

	@Override
	public String toString() {
		return "DetVentaP3 [codProducto3=" + codProducto3 + ", cantProducto3=" + cantProducto3 + ", precioCompra3="
				+ precioCompra3 + ", ivaCompra3=" + ivaCompra3 + ", precioVenta3=" + precioVenta3 + "]";
	}

			
	
}