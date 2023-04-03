Feature: Gérer compte bancaire
  En tant que client de la banque Universite
  Je veux pouvoir gerer mon compte bancaire
  Afin de controler mes depenses par rapport à ce que je gagne
  de mon travail et à ce que je retire pour effectuer des paiements.

  @Depot
  Scenario Outline: Deposer avec succes
    Given je suis sur la page de depot avec un <solde> dans mon compte
    When je remplis le champ avec un <montant>
    And je clique sur Deposer
    Then je devrais voir un message de depot effectue avec succes et le solde <attendue>


  Examples:
    | solde | montant | attendue |
    | 10    | 100     | 110      |
    | 0     | 2000    | 2000     |