@posts
Feature: Check page home fonctionality

  Background: 
    Given je me connecte sur l'application OrangeHRM
    When je saisis le username "Admin"
    When je saisis le password "admin123"
    And je clique sur le boutton LOGIN
    Then je me redirige vers la page home "Welcome"

  Scenario: Tester ajout du message
    When je clique sur Buzz
    And je saisis le message "My first message"
    And je clique sur Post
    Then je vérifis l affichage de "My first message"
