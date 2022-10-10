package jpa.repositories;

import jpa.entities.Prof;

import java.util.List;

public interface IProfDao {

    void createProfs();
    List<Prof> listProfs();
    void listProfsBySujet(String s);
}
