package Aula7POOHerancaPolimorfismo;

public class Preguica extends Animal {
	@Override
	public void emitirSom() {
		System.out.println("Aaaaaaaaaaaaai!");
	}

	@Override
	public void locomover() {
		System.out.println("Subir em �rvores");
	}
}
