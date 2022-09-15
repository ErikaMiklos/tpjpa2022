package jpa.repositories;

public interface IProfDao {

    void createProfs();
    void listProfs();
    void listProfsBySujet(String s);
}
