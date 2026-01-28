package Trapezes;

public class Epixiriseis extends Trapezes{
	
	private double EterikaDaneia;
	
public Epixiriseis(String Epwnumia, double Ypoloipo, String AFM, int ForologikiKatigoria, double EterikaDaneia) {
		
		super (Epwnumia, Ypoloipo, AFM, ForologikiKatigoria);
		this.EterikaDaneia = EtrikaDaneia;
	}

public double getDaneia() {
	return EterikaDaneia;
}

}
