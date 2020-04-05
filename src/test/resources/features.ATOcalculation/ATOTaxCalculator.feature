Feature: ATO Tax calculation


  Scenario: Tax calculation for the current year in current year with 100K salary being a resident
    Given a user is on the ATO page
    When user selects "2019" as the financial year with taxable income of "100000" and status as "resident"
    Then user should see "24,497" as the taxable amount

  Scenario: Tax calculation for the current year in 2018 year with 200K salary being a resident
    Given a user is on the ATO page
    When user selects "2018" as the financial year with taxable income of "200000" and status as "resident"
    Then user should see "63,232" as the taxable amount

  Scenario: Tax calculation for the current year in 2018 year with 200K salary being a Partyear resident
    Given a user is on the ATO page
    When user selects "2018" as the financial year with taxable income of "200000" and status as "Partyear resident"
    Then user should see "63,981.74" as the taxable amount
