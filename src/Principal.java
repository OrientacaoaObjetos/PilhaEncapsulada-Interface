
public class Principal {
	
	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Emanuel");
		p.empilhar("Maria");
		p.empilhar("Jose");
		
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
		
//		p.setTopo(6);
		
		//Desempilhando
		System.out.println("-----------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
	}

}
