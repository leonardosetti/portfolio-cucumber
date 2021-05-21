Feature: Validation of the elements that gives the Caterpillar site identity (Page Title, Page URL)

  @cat-identity
  Scenario: CAT default URL validation
    Given I access the CAT site
    When the CAT home page completely loads
    Then I see the correct default CAT Home Page URL

  @cat-identity
  Scenario: CAT default Page Title validation
    Given I access the CAT site
    When the CAT home page completely loads
    Then I see the correct default CAT Home Page Title

  @cat-identity
  Scenario: CAT default Logo
    Given I access the CAT site
    When the CAT home page completely loads
    Then I see the correct default CAT Home Page Logo