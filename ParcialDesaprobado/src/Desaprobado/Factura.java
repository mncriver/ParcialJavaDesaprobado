package Desaprobado;

import java.sql.Date;
import java.util.ArrayList;

public class Factura {
	int nro,caja;
	Date fecha;
	double iva;
	double total;
	ArrayList<Vendedor> vendedores;
	TipoFactura tf = new TipoFactura();
	
	public double getTotal()
	{
		
		if (tf.ivaDiscriminado=true)
		{
			return total;
		}
		else
		{
			return (total-iva);
		}
	}
	public double getIva()
	{
		return iva;
	}
	
	
}
