package sistemafaturamento;
/**
 * @author tiago
 */

import java.util.Scanner;

public class Menus {
    Scanner tec = new Scanner(System.in);
    float saldo, despesas, rendas, valor;
    int opcao;
    int continuar = 1;
    

    
    //Getters e Setters
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getDespesas() {
        return despesas;
    }

    public void setDespesas(float despesas) {
        this.despesas = despesas;
    }

    public float getRendas() {
        return rendas;
    }

    public void setRendas(float rendas) {
        this.rendas = rendas;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }
    
    //Metodos
    public void menu(){
        System.out.println("Escolha uma opção: ");
        System.out.println("(1) Adicionar renda");
        System.out.println("(2) Adicionar despesa");
        System.out.println("(3) Verificar saldo");
        System.out.println("(4) Sair");
        opcao = tec.nextInt();
        System.out.println("-------------------------");
        
        switch(opcao){
            case 1 -> renda();
            case 2 -> despesa();
            case 3 -> extrato();
        }
    }
    
    public void renda(){
        do{
            System.out.print("Digite o valor que deseja adicionar: ");
            this.valor = tec.nextFloat();
            rendas = rendas + this.valor;
            saldo = rendas - despesas;
            System.out.println("Saldo atual: " + saldo);
            System.out.println("(1) Adicionar renda");
            System.out.println("(2) Retornar ao menu");
            continuar = tec.nextInt();
            System.out.println("-------------------------");
        } while(continuar==1);
        menu();
    }
    
    public void despesa(){
        do{
            System.out.print("Digite o valor da despesa:");
            this.valor = tec.nextFloat();
            despesas = despesas + this.valor;
            saldo = rendas - despesas;
            System.out.println("Saldo atual: " + saldo);
            System.out.println("(1) Adicionar despesa");
            System.out.println("(2) Retornar ao menu");
            continuar = tec.nextInt();
            System.out.println("-------------------------");
        } while(continuar==1);
        menu();
    }
    
    public void extrato(){
        System.out.println("Saldo atual: " + saldo);
        System.out.println("-------------------------");
        menu();
    }
}
