package Aula6POO;

public class AviaoMain {
	public static void main(String[] args) {
		Aviao Aviao1 = new Aviao("Boing 137",1800,400);
		
		System.out.println("Modelo do Avi�o: "+Aviao1.Tipo);
		System.out.println("Velocidade M�xima: "+Aviao1.VelocidadeMax);
		System.out.println("Quantidade de poltronas dispon�veis: "+Aviao1.QtPoltronas);
		
	}
}
