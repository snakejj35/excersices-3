package objetos;

public class Cubo extends Cuadrado{
	private double lado;

	public Cubo(double lado) {
		super(lado);
		this.lado=lado;
	}
	public double calcularVolumen() {
		return lado*lado*lado;
	}
	public double calcularPerimetro() {
		return lado*12;
	}
}