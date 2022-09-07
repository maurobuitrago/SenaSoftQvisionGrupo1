Feature: I as user use pqrs services in Bon bonite
  As a user pqrs services
  i want do a pqrs in Bon bonite
  to use the pqrs services

  @doPqrsUser
  Scenario: Pqrs services
    #prepositions
    Given Sebas in the pqrs page
    #actions
    When He fills in the form login
    #consequences
    Then he should perform a pqrs