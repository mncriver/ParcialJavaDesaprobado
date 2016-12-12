package Desaprobado;

public class VendedorConPremio extends Vendedor{
	double basePremio,premio;
	
	Factura f = new Factura();
	
	public double getBasePremio() {
		return basePremio;
	}

	public void setBasePremio(double basePremio) {
		this.basePremio = basePremio;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}
	
	public double getBono()
	{
		double bono=0;
		if (f.getTotal()>getBasePremio())
		bono=getPremio();
		return bono;
	}

	
	
	
}
