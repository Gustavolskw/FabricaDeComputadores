package gustavo.material.MaterialDeConstrucao.DAO;

import gustavo.material.MaterialDeConstrucao.model.Compras;

import javax.persistence.EntityManager;
import java.util.List;

public class ComprasDao {
    private EntityManager em;
    public ComprasDao(EntityManager em){
        this.em = em;
    }
    public void cadastrarPedido(Compras pedido){
        em.persist(pedido);
    }
    public List<Compras> listaDePedidos(){
        String jpql = "SELECT p FROM Pedidos p ";
        return em.createQuery(jpql, Compras.class).getResultList();
    }





















}
