package teste.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.base.Usuario;

public class UsuarioTeste {
	public static void main(String[] args) {
            try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario novoUsuario = new Usuario("Djalma", "djalma@gmail.com");

		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();

		em.close();
		emf.close();
            } finally {
                System.out.println("Usuário inserido com sucesso!");
            }
	}
}
