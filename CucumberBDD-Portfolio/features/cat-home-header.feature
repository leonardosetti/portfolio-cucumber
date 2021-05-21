Feature: Validation aof the available links and symbols at top menu head bar

  @cat-header-menu
  Scenario Outline: CAT top menu main links validation
    Given I access the CAT site
    When I click to top menu '<link>'
    Then I navigate to page on '<url>' and page '<title>'

    Examples:
      | link      | url                                                     | title                                                    |
      | COMPANY   | https://www.caterpillar.com/en/company.html             | Caterpillar \| Company \| About Us                       |
      | BRANDS    | https://www.caterpillar.com/en/brands.html              | Caterpillar \| Brands                                    |
      | INVESTORS | https://investors.caterpillar.com/overview/default.aspx | Caterpillar Inc. - Overview                              |
      | NEWS      | https://www.caterpillar.com/en/news.html                | Caterpillar \| News                                      |
      | CAREERS   | https://www.caterpillar.com/en/carrers.html             | Caterpillar \| Caterpillar Careers \| Build What Matters |


