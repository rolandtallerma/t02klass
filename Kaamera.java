public class Kaamera{
	double a, b, c;
	public Kaamera(double pikkus, double laius, double k6rgus){
		if(pikkus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		if(k6rgus <=0){throw new RuntimeException("Sobimatu k6rgus");}
		a=pikkus;
		b=laius;
		c=k6rgus;
	}
	public double pindala(){
		return a*b;
	}
	//lisage funktsioon ristkyliku ruumala arvutamiseks
	public double ruumala(){
		return a*b*c;
	}
	public String toString(){
		return "Kaamera "+a+" x "+b+" x "+c+" millimeetrit, ruumala "+
		       ruumala()+" kuupmillimeetrit, pindala "+pindala()+" ruutmillimeetrit.";
	}
}