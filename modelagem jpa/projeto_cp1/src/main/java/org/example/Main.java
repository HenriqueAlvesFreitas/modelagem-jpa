package org.example;

import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        var entityManagerFactory =
                Persistence.createEntityManagerFactory(
                        "oracle-fiap");
        var entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();
        entityManagerFactory.close();

    }
}