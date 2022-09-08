Feature: Discard  the product
  As a user of the website
  I want to remove the product from the shopping cart
  Not to make the buy

  @DiscardProduct
  Scenario: Discard a product from the shopping cart
    #prepositions
    Given Sebas wants to add a product to the shopping cart
    #actions
    When He discard the product from the shopping cart
    #consequences
    Then He should see an empty shopping cart