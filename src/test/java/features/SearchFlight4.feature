Feature: Search flights on Makemytrip
  I want to search and book flights

  @tag1
  Scenario: user enters the boarding info 
    When  I open Browser
    Given I want to write book a flight 
    And set date of journey 
    When I click on search
    Then list of flights should be displayed
   

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
