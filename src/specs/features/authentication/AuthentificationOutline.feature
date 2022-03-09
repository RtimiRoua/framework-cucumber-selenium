@authentification-outline
Feature: Authentification -OrangeHRM
  ETQ utlisateur je me souhaite m'autehtifier avec un scenario outline

  @outline
  Scenario Outline: Authentification avec un scenario outline
    Given je me connecte sur l'application OrangeHRM
    When je saisis le username "<username>"
    And je saisis le password "<password>"
    And je clique sur le boutton LOGIN

    # Then je me redirige vers la page home "Welcome"
    Examples: 
      | username | password |
      | Admin    | admin123 |
      | roua     | admin123 |
