package Variaveis;

public class variaveisETiposJava {

	public static void main(String[] args) {
		
		/* tipos primitivos:
		 byte: valor mínimo -128 e máximo 127 (1 byte)
		 short: -32.768 até 32.767 (2 bytes)
		 int: -2.147.483.648 até 2.147.483.647 (4 bytes)
		 long: -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 (8 bytes)
		 
		 float: números fracionários (4 bytes)
		 double: números fracinonários maiores (8 bytes)
		 
		 */
		
		/* declarações de variáveis
		 Estrutura padrão: <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
		 Exemplos a seguir
		 */
		
		int idade; //variável idade que recebe um número inteiro que ainda não foi atribuído
		int ano = 2024; 
		int cep = 18608240; //não pode começar com 0
		long cpf = 123456789L; //não pode começar com 0, precisa terminar com L
		float pi = 3.14F; //float necessita terminar com F
		double valorProduto = 39.50;
		
		/* constantes 
		  para definirmos uma constante seguiremos o padrão final <Tipo> <NOMEDACONSTANTE>
		 */
		
		final double VALOR_DE_PI = 3.14; //não é obrigatório que a constante seja escrita em caixa alta, porém é uma boa prática
		
		// Strings = representam texto
		
		String nome = "Caio"; //o tipo String começa com a letra maíuscula na declaração do tipo e o conteúdo será de texto.
							  //esse texto deverá estar entre aspas
		
		
		
	}
}
