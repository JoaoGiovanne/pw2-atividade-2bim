public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setCodigo(1);
        usuario.setNome("horacio.augusto");
        usuario.setPrimeiroAcesso(true);
        usuario.exibir();
        System.out.println("------------------------");
        usuario.setCodigo(1);
        usuario.setNome("horacio.augusto");
        usuario.setPrimeiroAcesso(true);
        for (int i = 0;i <= 3; i++ ){
            while (usuario.setTentativasDeAcesso("abc")){

            }
        }
    }

}
