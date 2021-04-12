package controle;

import java.util.Scanner;

import modelo.Modelo;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Modelo dados = new Modelo();
		Controle control = new Controle();
		String auxiliar;
		Short operacao;
		
		do {
            System.out.println("[1]Cadastro Cliente");      
            System.out.println("[2]Cadastro Veículo");
            System.out.println("[3]Consultar Cliente");
            System.out.println("[4]Consultar Cliente");
            System.out.println("[0]Sair");
            System.out.print("Opção:");
            operacao = teclado.nextShort();
            
            if (operacao == 0) {
           	 System.out.println("OBRIGADO!");
           	 break;
            }
            
            switch(operacao) {
            case 1:
            	System.out.println("\n\nCPF: ");
                auxiliar = teclado.nextLine();
                dados.setCpf(auxiliar);
                
                System.out.println("NOME: ");
                auxiliar = teclado.nextLine();
                dados.setNome(auxiliar);
           
            	System.out.println("ENDEREÇO: ");
            	auxiliar = teclado.nextLine();
            	dados.setEndereço(auxiliar);
                
                System.out.println("TELEFONE: ");
                auxiliar = teclado.nextLine();
                dados.setFone(auxiliar);
                
                System.out.print("E-MAIL: ");
                auxiliar = teclado.nextLine();
                dados.setEmail(auxiliar);
            	break;
            case 2:
            	System.out.println("\n\nPLACA: ");
                auxiliar = teclado.nextLine();
                control.setPlaca(auxiliar);
                
                System.out.println("MODELO: ");
                auxiliar = teclado.nextLine();
                control.setModelo(auxiliar);
           
            	System.out.println("ANO: ");
            	auxiliar = teclado.nextLine();
            	control.setAno(auxiliar);
                
                System.out.println("FABRICANTE: ");
                auxiliar = teclado.nextLine();
                control.setFabricante(auxiliar);
                
                System.out.print("COR: ");
                auxiliar = teclado.nextLine();
                control.setCor(auxiliar);
            	break;
            case 3:
            	System.out.printf("O Sr. %s possui o CPF %s e reside na %s.", dados.getNome(), dados.getCpf(), dados.getEndereço());
            	System.out.printf("Telefone %s", dados.getFone());
            	System.out.printf("E-mail %s", dados.getEmail());
            	break;
            case 4:
            	System.out.printf("O veículo %s do ano %s tem a cor %s.", control.getModelo(), control.getAno(), control.getCor());
            	System.out.printf("Placa: %s", control.getPlaca());
            	System.out.printf("Fabricante: ", control.getFabricante());
            	break;
            default:
            	System.out.print("Escolha uma opção válida!");
            	break;
            }
                      
       }while (operacao != 0);
	}
}

class Controle{
	private String placa;
	private String modelo;
	private String ano;
	private String fabricante;
	private String cor;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}