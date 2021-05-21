Feature: Disposable - Feature for internal validation

  @disposableIgnore
  Scenario: Disposable using hardcoded element
    Given I am on CAT Home Page
    When I click to Company top menu link
    Then I navigate to Company page

  @disposable
  Scenario Outline: Disposable select '<language>' from a dropdown list
    Given I am on CAT Home Page
    When I click to Language Icon
    And Select the '<language>'
    Then I navigate to Company page '<url>' accordingly to chosen language

    Examples:
      | language | url                                 |
      | ENGLISH  | https://www.caterpillar.com/en.html |
      | DEUTSCH  | https://www.caterpillar.com/de.html |
      | ESPAÑOL  | https://www.caterpillar.com/es.html |
