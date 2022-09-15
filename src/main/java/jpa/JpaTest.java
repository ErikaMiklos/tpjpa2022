package jpa;

import jpa.entities.Prof;
import jpa.repositories.EleveDao;
import jpa.repositories.IEleveDao;
import jpa.repositories.IProfDao;
import jpa.repositories.ProfDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();

		tx.begin();

		IProfDao profDao = new ProfDao();
		IEleveDao eleveDao = new EleveDao();
		try {
			profDao.createProfs();
			profDao.listProfs();
			profDao.listProfsBySujet("TAA");

			eleveDao.createEleves();
			eleveDao.listEleves();

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
