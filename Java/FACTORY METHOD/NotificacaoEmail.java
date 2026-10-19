package Exercicios_fixacao;

public class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String destinatario, String mensagem) {
		super(destinatario, mensagem);
	}

    @Override
	public double calcularCusto() {
		double custo = 0.02;

		return mensagem.length()*custo;
		
	}

    @Override
	public String getTipo() {
		return "Email";
	}

}
