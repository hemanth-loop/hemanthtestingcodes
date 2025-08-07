Feature: login to the cockpit


  Background: login to the application
    Given navigate to the cockpit page
    When enter the username and password
    Then verify user is in main dashboard page

  @Beforelogin
  Scenario: verify user is receiving proper error messages in login page
    Given navigate to the cockpit page
    When without entering username and password text fields
    And  entering invalid email format in email text field
    Then verify the error messages

  @Beforelogin
  Scenario: verify user is receiving proper error messages in login page for invalid password or invalid username and invalid user
    Given navigate to the cockpit page
    When entering valid-username and invalid-password in text fields verify
    And  entering both invalid email and password in text field
    Then verify the error messages for fields

  @login
  Scenario: verify the dates in main dashboard page
    Then verify the application counts in the dashboard
  @login
  Scenario: verify and get the count of all the data in the main dashboard
    Then verify all the counts in the main dashboard
  @login
  Scenario: verify the preregistered device is same in main page and device page and global page
    Then get the data from the maindashboard and device dashboard
  @login
  Scenario: verify the device is same in main page and device page and global page
    Then get the data from the maindashboard and device dashboard for normal devices
  @login
  Scenario: verify the tenents and user is same in main page and global page
    Then get the data from the maindashboard and global dashboard and compare




  @login
  Scenario: verify the date range in device trends main dashboard by default data in 30 days
    Given click on enlarge in device trends chart
    Then verify the for 30 days data
  @login
  Scenario: verify the date range in tenant trends main dashboard by default data in 30 days
    Given click on enlarge in tenant trends charts
    Then verify the for 30 days data
  @login
  Scenario: verify the date range in user trends main dashboard by default data in 30 days
    Given click on enlarge in user trends charts
    Then verify the for 30 days data
  @login
  Scenario: verify the date range in cumulative devices chart in main dashboard by default data in 30 days
    Given click on enlarge in cumulative devices trends charts
    Then verify the for 30 days data
  @login
  Scenario: verify the date range in cumulative tenants chart in main dashboard by default data in 30 days
    Given click on enlarge in cumulative tenants trends charts
    Then verify the for 30 days data
  @login
  Scenario: verify the date range in cumulative users chart in main dashboard by default data in 30 days
    Given click on enlarge in cumulative users trends charts
    Then verify the for 30 days data





  @login6576
  Scenario: verify the date range in device trends main dashboard for 90 days
    Given click on enlarge in device trends chart for three months
    Then verify the for 3 months and 4 months latest data
  @login
  Scenario: verify the date range in tenant trends main dashboard for 90 days
    Given click on enlarge in tenant trends chart
    Then verify the for 3 months and 4 months latest data
  @login
  Scenario: verify the date range in user trends main dashboard for 90 days
    Given click on enlarge in user trends chart for three months
    Then verify the for 3 months and 4 months latest data
  @login
  Scenario: verify the date range in cumulative devices chart main dashboard for 90 days
    Given click on enlarge in user cumulative devices chart for three months
    Then verify the for 3 months and 4 months latest data
  @login
  Scenario: verify the date range in cumulative tenants chart main dashboard for 90 days
    Given click on enlarge in user cumulative tenants chart for three months
    Then verify the for 3 months and 4 months latest data
  @login
  Scenario: verify the date range in cumulative users chart main dashboard for 90 days
    Given click on enlarge in user cumulative users chart for three months
    Then verify the for 3 months and 4 months latest data




  @login
  Scenario: verify the date range in device trends main dashboard for 180 days
    Given click on enlarge in device trends chart for six months
    Then verify the for 6 months and 7 months latest data
  @login
  Scenario: verify the date range in tenant trends main dashboard for 180 days
    Given click on enlarge in tenant trends chart for six months
    Then verify the for 6 months and 7 months latest data
  @login
  Scenario: verify the date range in user trends main dashboard for 180 days
    Given click on enlarge in user trends chart for six months
    Then verify the for 6 months and 7 months latest data
  @login
  Scenario: verify the date range in cumulative devices main dashboard for 180 days
    Given click on enlarge in cumulative devices main chart for six months
    Then verify the for 6 months and 7 months latest data
  @login
  Scenario: verify the date range in cumulative tenants main dashboard for 180 days
    Given click on enlarge in cumulative tenants main chart for six months
    Then verify the for 6 months and 7 months latest data
  @login
  Scenario: verify the date range in cumulative users main dashboard for 180 days
    Given click on enlarge in cumulative users main chart for six months
    Then verify the for 6 months and 7 months latest data




  @login
  Scenario: verify the date range in device trends main dashboard for 1 year
    Given click on enlarge in device trends chart for one year
    Then verify the for 12 or 13 months latest data means one year
  @login
  Scenario: verify the date range in tenant trends main dashboard for 1 year
    Given click on enlarge in tenant trends chart for one year
    Then verify the for 12 or 13 months latest data means one year
  @login
  Scenario: verify the date range in user trends main dashboard for 1 year
    Given click on enlarge in user trends chart for one year
    Then verify the for 12 or 13 months latest data means one year
  @login
  Scenario: verify the date range in cumulative devices main dashboard for 1 year
    Given click on enlarge in cumulative devices chart for one year
    Then verify the for 12 or 13 months latest data means one year
  @login
  Scenario: verify the date range in cumulative tenants main dashboard for 1 year
    Given click on enlarge in cumulative tenants chart for one year
    Then verify the for 12 or 13 months latest data means one year
  @login
  Scenario: verify the date range in cumulative users main dashboard for 1 year
    Given click on enlarge in cumulative users chart for one year
    Then verify the for 12 or 13 months latest data means one year
  @login
  Scenario: verify the date range in device trends main dashboard for 1 year
    Given click on enlarge in device trends chart for one year
    Then verify the for 12 or 13 months latest data means one year




  @login
  Scenario: verify the date range in device trends main dashboard for current month
    Given click on enlarge in device trends chart for current month
    When get the today date
    Then verify for all the back dates from current date for a month
  @login
  Scenario: verify the date range in tenant trends main dashboard for current month
    Given click on enlarge in tenant trends chart for current month
    When get the today date
    Then verify for all the back dates from current date for a month
  @login
  Scenario: verify the date range in user trends main dashboard for current month
    Given click on enlarge in user trends chart for current month
    When get the today date
    Then verify for all the back dates from current date for a month
  @login
  Scenario: verify the date range in cumulative devices main dashboard for current month
    Given click on enlarge in user cumulative devices for current month
    When get the today date
    Then verify for all the back dates from current date for a month
  @login
  Scenario: verify the date range in cumulative tenants main dashboard for current month
    Given click on enlarge in user cumulative tenants for current month
    When get the today date
    Then verify for all the back dates from current date for a month
  @login
  Scenario: verify the date range in cumulative users main dashboard for current month
    Given click on enlarge in user cumulative users for current month
    When get the today date
    Then verify for all the back dates from current date for a month



  @login
  Scenario: verify the date range in device trends main dashboard for current year
    Given click on enlarge in device trends chart for current year
    When get the today month
    Then verify for all the back dates from current month for a year
  @login
  Scenario: verify the date range in tenant trends main dashboard for current year
    Given click on enlarge in tenant trends chart for current year
    When get the today month
    Then verify for all the back dates from current month for a year
  @login
  Scenario: verify the date range in user trends main dashboard for current year
    Given click on enlarge in user trends chart for current year
    When get the today month
    Then verify for all the back dates from current month for a year
  @login
  Scenario: verify the date range in cumulative devices main dashboard for current year
    Given click on enlarge in cumulative devices chart for current year
    When get the today month
    Then verify for all the back dates from current month for a year
  @login
  Scenario: verify the date range in cumulative tenants main dashboard for current year
    Given click on enlarge in cumulative tenants chart for current year
    When get the today month
    Then verify for all the back dates from current month for a year
  @login
  Scenario: verify the date range in cumulative users main dashboard for current year
    Given click on enlarge in cumulative users chart for current year
    When get the today month
    Then verify for all the back dates from current month for a year



  @login989
  Scenario: verify the date range in device trends main dashboard for 1st Quarter
    Given click on enlarge in device trends chart for First Quarter
    When get the today month
    Then verify for all the back dates from first Quarter for a current month