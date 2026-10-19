package Exercicios_fixacao;

public class CriadorEmail extends CriadorNotificacao{

    protected String destinatario;
    protected String mensagem;
    
    public CriadorEmail(String destinatario, String mensagem) {
		this.destinatario = destinatario;
        this.mensagem = mensagem;
	}

    @Override
	protected Notificacao enviarNotificacao() {
		return new NotificacaoEmail(destinatario, mensagem);
	}   
}
