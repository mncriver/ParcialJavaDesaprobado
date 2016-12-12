package Desaprobado;

public class VendedorComisionFija extends Vendedor{
	double porcentajeComision;
	
	Factura f = new Factura();
	
	public double getPorcentajeComision() {
		return porcentajeComision;
	}

	public void setPorcentajeComision(double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}
	
	public double getBono(){
	
	double bono=0;
		
	for(Factura f:facturas)
	{
		bono =(getPorcentajeComision()/f.getTotal());
	}
	return bono;
		
		}

}
