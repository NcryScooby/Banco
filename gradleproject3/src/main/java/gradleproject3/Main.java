package gradleproject3;

public class Main {

    public static void main(String[] args) {
       
        Banco p1 = new Banco();
        
        p1.setNumConta(1);
        p1.setDono("Guilherme");
        p1.abrirConta("CC");
        
        Banco p2 = new Banco();
        
        p2.setNumConta(2);
        p2.setDono("Lucas");
        p2.abrirConta("CP");
        
        Banco p3 = new Banco();
        
        p3.setNumConta(2);
        p3.setDono("Alice");
        p3.abrirConta("CC");
        
        p1.depositar(100);
        p2.depositar(500);
        p3.depositar(600);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        p3.estadoAtual();

    }
    
}
