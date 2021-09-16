
public class Principal {
    public static void main(String args []){

        Conta minhaConta=new Conta();
        minhaConta.setNumero(4);
        System.out.println(minhaConta.getNumero());
        minhaConta.setNumero(6);
        System.out.println(minhaConta.getNumero());
        minhaConta.setTitular("Carla");
        System.out.println(minhaConta.getTitular());
        minhaConta.setSaldo(197.89);
        System.out.println(minhaConta.getSaldo ());

    }
    
}
