package br.usjt.Veiculos.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.Veiculos.model.bean.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}