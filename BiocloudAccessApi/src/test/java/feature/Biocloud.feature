Feature: face register identify and liveness delete endpoints


  Scenario: verify user is able to create the visitor
    Given create the visitor by passing the payload
    When user calls the create api with post http request
    Then validate the status code and success message