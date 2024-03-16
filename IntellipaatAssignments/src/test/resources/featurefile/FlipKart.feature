#Flipkart Testcases
Feature:Flipkart product search validation
  @SC01
  Scenario:Search for Mobile Phone on the flipkart.com homepage
    When Enter "MobilePhone" in search bar
    And Fetch and save results
    Then validate folder creation

    @SC02
    Scenario:iPhone12 64GB phone till payment journey
      When Enter "iPhone12" in search bar
      And product sorting
      And select 64GB phone and add to cart
      And change the shipping address and proceed to checkout
      Then validate checkout page

