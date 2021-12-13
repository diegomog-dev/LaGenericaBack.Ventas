package co.edu.unbosque.lagenericaGr38Eq5.model;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.lang.model.type.ArrayType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="db_ventas")
public class DetalleVenta {

	private DetVentaP1[] detVentaP1;
	private DetVentaP2[] detVentaP2;
	private DetVentaP3[] detVentaP3;
	

	public DetalleVenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleVenta(DetVentaP1[] detVentaP1, DetVentaP2[] detVentaP2, DetVentaP3[] detVentaP3) {
		super();
		this.detVentaP1 = detVentaP1;
		this.detVentaP2 = detVentaP2;
		this.detVentaP3 = detVentaP3;
	}

	public DetVentaP1[] getDetVentaP1() {
		return detVentaP1;
	}

	public void setDetVentaP1(DetVentaP1[] detVentaP1) {
		this.detVentaP1 = detVentaP1;
	}

	public DetVentaP2[] getDetVentaP2() {
		return detVentaP2;
	}

	public void setDetVentaP2(DetVentaP2[] detVentaP2) {
		this.detVentaP2 = detVentaP2;
	}

	public DetVentaP3[] getDetVentaP3() {
		return detVentaP3;
	}

	public void setDetVentaP3(DetVentaP3[] detVentaP3) {
		this.detVentaP3 = detVentaP3;
	}

	@Override
	public String toString() {
		return "DetalleVenta [detVentaP1=" + Arrays.toString(detVentaP1) + ", detVentaP2=" + Arrays.toString(detVentaP2)
				+ ", detVentaP3=" + Arrays.toString(detVentaP3) + "]";
	}

		
	
}
