package banco;

public class Main {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();

		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(200);
		p1.sacar(50);

		ContaBanco p2 = new ContaBanco();

		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.depositar(567);
		p2.sacar(100);

		p1.estadoAtual();
		p2.estadoAtual();

		p1.sacar(200);
		p1.fecharConta();

	}

}
