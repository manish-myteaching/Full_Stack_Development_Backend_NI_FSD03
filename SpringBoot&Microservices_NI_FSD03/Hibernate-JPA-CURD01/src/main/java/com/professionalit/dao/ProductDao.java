package com.professionalit.dao;

import java.util.List;

import com.professionalit.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {
	private EntityManagerFactory emf;

	public ProductDao() {
		emf = Persistence.createEntityManagerFactory("my-persistence-unit");
	}

	public void createProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(product);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx.isActive()) {
				tx.rollback();
			}
			throw e;
		} finally {
			em.close();
		}
	}

	public Product getProduct(Long id) {
		EntityManager em = emf.createEntityManager();
		try {
			return em.find(Product.class, id);
		} finally {
			em.close();
		}
	}

	public void updateProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(product);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx.isActive()) {
				tx.rollback();
			}
			throw e;
		} finally {
			em.close();
		}
	}

	public void deleteProduct(Long id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Product product = em.find(Product.class, id);
			if (product != null) {
				em.remove(product);
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx.isActive()) {
				tx.rollback();
			}
			throw e;
		} finally {
			em.close();
		}
	}

	public List<Product> getAllProduct() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("SELECT u FROM Product u", Product.class).getResultList();
		} finally {
			em.close();
		}
	}
}
