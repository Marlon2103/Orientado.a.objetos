package exercicioherançaepolimorfismo;

public class animalcaraterer {

	public static void main(String[] args) {
		cahorro c = new cahorro ();
		cavalo ca = new cavalo ();
		Preguiça p = new Preguiça ();
		
		
		c.setCor("marron");
		c.setRaça("pitbull");
		c.setIdade(1);
		c.setNome("thomas");
		
		ca.setPais("Arabia saudita");
		ca.setValor(30.00);
		ca.setIdade(1);
		
		p.setDataselo(2020);
		p.setEstado("Minas gerais");
		p.setPeso(30);
		p.setIdade(5);
		
		System.out.println("Cor do cachorro é " +c.getCor()+" / raça  "+c.getRaça()+"/ idade "+c.getIdade()+" ano(s) / e nome "+c.getNome());
		System.out.println("Cavalo origem "+ca.getPais()+"  / valor estimado "+ca.getValor()+"reais / "+ca.getIdade()+" ano(s) de vida ");
		System.out.println("A preguiça foi marcada pelo ibama em "+p.getDataselo()+ " / no estado de(o) "+p.getEstado()+" / pesa "+p.getPeso()+" kilos / sua idade é de "+p.getIdade()+" anos");
		// TODO Auto-generated method stub

	}

}
