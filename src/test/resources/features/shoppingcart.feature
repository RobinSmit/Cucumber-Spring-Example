Feature: Adding and deleting Iphones from my shopping cart

  Scenario Outline: Adding Iphones to my shopping cart
    Given the shopping cart total is <INITIAL TOTAL>
    When i add <AMOUNT IPHONES> Iphone to my shopping cart
    Then the shopping cart total should be <END TOTAL>

    Examples:
      | INITIAL TOTAL | AMOUNT IPHONES | END TOTAL |
      | 100           | 1              | 1000      |
      | -200          | 1              | 700       |
      | 0             | 4              | 3600      |

  Scenario Outline: Adding and removing Iphone to my shopping cart
    When i add <ADD IPHONES> Iphone to my shopping cart
    And i remove <REMOVE IPHONES> Iphone from my shopping cart
    Then the shopping cart total should be <END TOTAL>

    Examples:
      | ADD IPHONES | REMOVE IPHONES | END TOTAL |
      | 5           | 2              | 2700      |
      | 1           | 2              | 0         |
      | 1           | 1              | 0         |