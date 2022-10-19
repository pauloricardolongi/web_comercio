package br.com.comercio.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.comercio.domain.ItemVenda;
import br.com.comercio.domain.Venda;
import br.com.comercio.util.HibernateUtil;

public class VendaDAO extends GenericDAO<Venda> {
	
	
	public void salvar(Venda venda, List<ItemVenda> itensVenda){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction();
		
			sessao.save(venda);
			
			for(int posicao = 0; posicao < itensVenda.size(); posicao++){
				ItemVenda itemVenda = itensVenda.get(posicao);
				itemVenda.setVenda(venda);
				
				sessao.save(itemVenda);
			}
			
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}
	}
}



