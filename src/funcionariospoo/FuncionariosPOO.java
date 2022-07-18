
package funcionariospoo;


public class FuncionariosPOO {

    
    public static void main(String[] args) {
     Funcionariosmetodos u1 = new Funcionariosmetodos();
        u1.nome="Pedro";
        u1.idade=18;
        u1.salario=1250;
        u1.dataentrada="01/03/1998";
        u1.departamento="TI";
        u1.rg=548761125;
        u1.metodo1();
        u1.metodo2();
        u1.metodo3();
        
        
        Funcionariosmetodos u2 = new Funcionariosmetodos();
        u2.nome="Amanda";
        u2.idade=23;
        u2.salario=1350;
        u2.dataentrada="01/05/2012";
        u2.departamento="Administração";
        u2.rg=867878676;
        u2.metodo1();
        u2.metodo2();
        u2.metodo3();
    }
    
}

