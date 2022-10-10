# Projet pour le TP JPA 2022

### TP1 - BD-MySql

Lancez votre Base de Donnée type MySql. Créer une nouvelle 
Database qui s'appelle : 
```
taa_tp
```
Démarrez l'application à partir de main méthode dans la classe JpaTest.

L'application fait peupler la table User avec 3 exemples des Profs 
et 3 exemples des Elèves. Puis dans la console on peut trouver les resultats
des requêtes celles qui lisent des données se trouvant
dans la table User.

### TP2 - Formulaire-JDBC

J'ai utilisé Intellij Ultimate comme EDI avec Java JDK 11 et pour
faire tourner l'application j'ai configuré Tomcat comme
serveur sur le port: 8080.
C'est-à-dire il faut tout d'abord lancer Tomcat puis on trouve le formulaire
sur url :
```
localhost:8080/testjpa_war_exploded/myform.html
```

(Attention: avec différente configuration ou serveur appliqué
l'url ciblé sera différent également.)

En remplissant le formulaire et cliquant sur le bouton send la page UserInfo
apparaît en retournant les infos précédemments fournis.





