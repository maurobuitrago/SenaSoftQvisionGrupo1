Feature: I as a user  enter to the Bon bonite page
  As a user  registered
  I want to select a product for
  to add to shopping cart

  @BuySuccessfulProduct
  Scenario: Add product to shopping cart
    #prepositions
    Given Sebas on the product page of the shoes category
    #actions
    When he selects the product
    #consequences
    Then He should add to shopping cart