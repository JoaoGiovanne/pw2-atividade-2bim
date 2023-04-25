public class UsuarioTeste {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setCodigo(1);
        usuario.setNome("horacio.augusto");
        usuario.exibir();
        usuario.inativar();
        usuario.exibir();
    }

}
