
package funcionariospoo;


public class Funcionariosmetodos {
    

    double salario;
    int idade;
    String nome;
    String dataentrada;
    String departamento;
    int rg;
            
            
            void metodo1(){
        
        if(salario<1300){
        System.out.println(this.nome );
                System.out.println("Você está precisando de um aumento");
    }
        if(salario>1300){
            System.out.println(this.nome );
            System.out.println("Seu salário está ótimo");
        }
        
    }
    void metodo2(){
        if(salario<1300){
            this.salario=this.salario+150;
            System.out.println(this.nome);
                System.out.println("Você receberá 150 reais de aumento de salário, seu novo salário é: ");
                System.out.println(this.salario);
                
                
                
        }else{
            System.out.println(this.nome);
                System.out.println("Seu salário continuara igual a:");
                System.out.println(this.salario);
        }
        
    }
    
    void metodo3(){
        
        System.out.println(this.nome);
        System.out.println("Seu ganho anual é igual a:");
        System.out.println(this.salario=this.salario*12);
        
    }
    
    
}

            

