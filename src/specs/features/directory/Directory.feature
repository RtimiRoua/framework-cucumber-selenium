@directory
Feature: Check page home fonctionality

  Background: 
    Given je me connecte sur l'application OrangeHRM
    When je saisis le username "Admin"
    When je saisis le password "admin123"
    And je clique sur le boutton LOGIN
    Then je me redirige vers la page home "Welcome"

  Scenario: Tester ajout du message
    When je clique sur Directory
    And je selectionne les jobs title QA Engineer
    And je clique sur Search
    Then je vérifis l affichage de liste des jobs
