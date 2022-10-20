public class Main2 {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.inserirDados();
		produto1.calcularVenda(20);
		produto1.mostrar();
		
		Agua Agua = new Agua();
		Agua.setDescricaoProduto("Agua Potavel");
		Agua.setCusto(12.90);
		Cerveja Cerveja = new Cerveja();
		Cerveja.setFabricanteNome("AMBEV");
		Cerveja.setCusto(30.90);
		Cerveja.setTeorAlcoolico(90.80);
		
		Suco Suco = new Suco();
		Suco.setDescricaoProduto("Suco de fruta");
		Suco.setFabricanteNumero(1190909090);
	
		System.out.println("Descrição: " + Agua.getDescricaoProduto() + " Custo: " + Agua.getCusto());
		System.out.println("Custo: " + Cerveja.getCusto() + " Fabricante: " + Cerveja.getFabricanteNome() + " Teor Alcoolico: " + Cerveja.getTeorAlcoolico());
		System.out.println("Descrição: " + Suco.getDescricaoProduto() + " Numero do fabricante: " + Suco.getFabricanteNumero());

	}

}