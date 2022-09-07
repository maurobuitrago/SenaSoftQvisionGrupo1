Feature: Product Reserve Successful
  As a web user
  I want to reserve the product
  to make the purchase later

  #First Scenario
  @ReserveProduct
  #Title of scenario
  Scenario: Reserve product
    #Prepositions
    Given Sebas want to reserve a product
    #Actions
    When she selects a product and fills in all the data on the form in the Outlet interface
    #Consequences
    Then she should see on the screen the text reservation successful.