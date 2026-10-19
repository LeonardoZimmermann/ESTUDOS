package Exercicios_fixacao;

public class NotificacaoSMS extends Notificacao{

    public NotificacaoSMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public double calcularCusto() {
        double custo = 0.05;

        return mensagem.length() * custo;
    }

    @Override
    public String getTipo() {
		return "SMS";
	}
    
}
