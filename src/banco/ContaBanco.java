package banco;

public class ContaBanco {
	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// construtor
	public void ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);

	}

	// métodos personalizados

	public void abrirConta(String t) {
		this.setStatus(true);
		if (t.equalsIgnoreCase("CC")) {
			this.setSaldo(50);
			this.setTipo(t);
		} else if (t.equalsIgnoreCase("CP")) {
			this.setSaldo(150);
			this.setTipo(t);
		}
		System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Esvazie o saldo e tente novamente");
		} else if (this.getSaldo() < 0) {
			System.out.println("Quite suas dívidas primeiro e tente novamente");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
	}

	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depósito de:" + v + " reais realizado com sucesso na conta de: " + this.getDono());
		} else {
			System.out.println("Impossível realizar depósito");
		}

	}

	public void sacar(double v) {
		if (this.getStatus() && this.getSaldo() >= v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque de:" + v + " reais" + " realizado com sucesso na conta de:" + this.getDono());
		} else {
			System.out.println("Impossivel realizar saque");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo().equalsIgnoreCase("CC")) {
			v = 12;

		} else if (this.getTipo().equalsIgnoreCase("CP")) {
			v = 20;

		}
		if (this.getStatus() && this.getSaldo() > v) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso");
		} else {
			System.out.println("Impossivel pagar");
		}

	}

	public void estadoAtual() {
		System.out.println("Conta:" + this.getNumConta() + "\nDono:" + this.getDono() + "\nTipo:" + this.getTipo()
				+ "\nSaldo:" + this.getSaldo() + "\nStatus" + this.getStatus());
		System.out.println("-----------------------------------------------------------");

	}

	// getters e setters
	public void setNumConta(int n) {
		this.numConta = n;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
