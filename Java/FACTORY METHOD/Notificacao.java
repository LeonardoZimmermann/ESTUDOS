package Exercicios_fixacao;


public abstract class Notificacao {
	
	
	// Atributos protegidos para que as classes filhas (Auto, Residencial, etc.) tenham acesso direto
	protected String destinatario;
	protected String mensagem;
	
	
	
	// Construtor: obriga a receber o nome e os documentos no momento da criação
	public Notificacao(String destinatario, String mensagem) {
		this.destinatario = destinatario;
		this.mensagem = mensagem;
	}
	
	public abstract double calcularCusto();
	public abstract String getTipo();
	public String getDestinatario() {
        return this.destinatario;
    }
}