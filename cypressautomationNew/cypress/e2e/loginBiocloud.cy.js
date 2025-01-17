import MainPage from "../pageObjects/dahboard"; // Class name corrected to PascalCase

// Utility Functions
function generateRandomString(length) {
  const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
  let result = '';
  for (let i = 0; i < length; i++) {
    result += characters.charAt(Math.floor(Math.random() * characters.length));
  }
  return result;
}

function generateRandom10DigitNumber() {
  return Math.floor(1000000000 + Math.random() * 9000000000);
}



  const randomName = generateRandomString(10);
  let testData;
  let existingCompnayName = "digimax";
  let firstname=generateRandomString(10);
  let lastname=generateRandomString(10);
  let email=generateRandomString(10)+"@gmail.com";
  const phone=generateRandom10DigitNumber();
  let invalidemail="dsfsd";
  let existingemail="hemanth@zktecodev.com"
  let accountFirstname = "hemanth"
  let adminaccountUN = "khairic32@machunu.com"
  let adminaccountPW = "Root@123"
  let trialrequestUrl = "https://biocloud.minervaiot.com/";
  let username = "hemantharya001@gmail.com";


  before(() => {
    // Load test data before the test suite starts
    cy.fixture('example.json').then((data) => {
      testData = data;
    });
  });

  beforeEach(() => {
    // Log into the application before each test
    cy.loginapplication(testData.username, testData.password, testData.url);
  });

  afterEach(() => {
    // Log out of the application after each test
   // cy.logoutFromApplication();
  });



  // Test Suite
  describe('User Management - API Key Creation', () => {
    const ln = new MainPage(); // Instantiate MainPage class
    
  it('should allow the user to add an API key with all mandatory fields', () => {
    ln.createApiKey();
  });
  it('verify user is receiving proper error messages for mandatory fields', () => {
      ln.Validatetheerrormessages();
  });
  it('verify user is abel to search the API keys  based on email in the search field', () => {
    ln.searchTheApikeybasedonEmail();
  });
  it('verify user is able to navigate to the next page when API key list records is more', () => {
    ln.navigateToNextpage();
  });
  it('verify user able to regenrate the API secret key and user recive the new mail with regenrated api secret', () => {
    ln.regenarateTheApikey();
  });
  it('verify user is able to change the status of api key from disable to enable or visavarsa with proper message', () => {
    ln.disableTheApiKey();
  });
  it('verify user is able to see the status of the API key as disabled or enabled', () => {
    ln.checkthestatus();
  });
  it('verify user is able to edit the API key Rate,burst,quota,description and status with "api key updated successfully" message', () => {
    ln.editTheApiKey();
  });
});

  describe('Tenant - tenant Creation', () => {
    const ln = new MainPage();
    it('verify user able to create the tenant by passing all the required filed with tenant created successfully message', () => {
      ln.createTenent();
    });
    it('verify user is receiving proper error messages for mandatory fields', () => {
      ln.errorMessageForCompany();
    });
    it('verify user will get "company name already exist error message" when user try to create the company with existing name', () => {
      ln.companyNameExist();
    });

    it('verify user is abel to search the company based on name', () => {
      ln.searchcompanyOnName(existingCompnayName);
    });
    
    it('verify user will get "no records found error message" when user search based on invalid company name', () => {
      ln.searchcompanyOninvalidName();
    });
    it('verify user is able to navigate to the next page when the company records are more', () => {
      ln.navigateToNextpage();
    });
    it('verify user able to edit the company with success message', () => {
      ln.editCompany();
    });  
    it('verify user is able to make it as a test company false while creating the company', () => {
      ln.createcompnywithfalse();
    });
    it('verify user is able to search the company based on company type test company,formal company,all by selecting from the dropdown', () => {
      ln.searchCompanyType();
    });   
});

describe('account - account Creation', () => {
  const ln = new MainPage();
  it('verify user is able to create the admin by assigning  the role and the parent company to the user', () => {
    ln.createAdmin(firstname,lastname,email,phone,existingCompnayName);
  });
  it('verify user is able to create the owner by assigning  the role and the parent company to the user', () => {
    ln.createOwner(firstname,lastname,email,phone,existingCompnayName);
  });
  it('verify user is able to create the devlpoer by assigning  the role and the parent company and api key to the user', () => {
    ln.createDevloper(firstname,lastname,email,phone,existingCompnayName);
  });
  it('verify user is able to see the proper error messages while creating the user', () => {
    ln.errorMesCreatingUser(firstname,lastname,invalidemail,phone,existingCompnayName);
  });
  it('verify user is able to see user already exist error message when user try to create the user with already exist email', () => {
    ln.existEmailmessage(firstname,lastname,existingemail,phone,existingCompnayName);
  });

  it('verify user is able to search the user based on name', () => {
    ln.searchOnName(accountFirstname);
  });
  it(' verify user will get "no records found error message" when user search based on invalid name', () => {
    ln.searchOnInvalid(firstname);
  });
  it('verify user is able to navigate to the next page when the user records is more', () => {
    ln.navigateToNextpageinAcount();
  });
  it('verify user is able to delete the user by clicking delete icon with user deleted successfully message', () => {
    ln.deleteUser();
  });
  it('verify user able to edit the user and able to see the edited data', () => {
    ln.editTheuser(firstname,lastname,phone);
  });
  it('verify user is able to see proper error message when user try to the assign the same API key to the another devloper again', () => {
    ln.apiKeyAssignedtoanotherUser(firstname,lastname,email,phone,existingCompnayName);
  });
  it('verify user is able to filter the user accounts based on roles selecting from the dropdown and get the proper data', () => {
    ln.filterBasedonRole();
  });
  it('verify admin login is able to see the dashboard and api history tabs', () => { 
    ln.adminLogin(adminaccountUN,adminaccountPW);
  });
});

describe('dashboard - charts', () => {
  const ln = new MainPage();
it('verify user is able to see ,Top 10 Error Count By API,Top 10 Active Developer,API Trends,Total Trends,Top 10 API Requests,API Request Ratio', () => {
    ln.checkTheChartsinDashboard();
  });
});

describe('monitor - historys', () => {
  const ln = new MainPage();
it('verify user is able to search the login details by passing account email', () => {
  ln.searchLoginbasedonEmail();
});
it('verify user is able to navigate to the next page when records is more by clicking on next page in login history page', () => {
  ln.navigateToNextpageinloginhistory();
});
it('verify user is able to search the mail history details by passing recipient mail', () => {
  ln.searchMailHistorybasedonrecipient(existingemail);
});
it('verify user is able to search the API history details by passing account email', () => {
  ln.searchApiHistorybasedonAccount(existingemail);
});
it('verify user is able to navigate to the next page when records is more by clicking on next page in api history page', () => {
  ln.navigateToNextpageinApihistory(existingemail);
});

it('verify user is able to search the API history details by passing status', () => {
  ln.searchBasedOnStatus();
});
});

describe('profile - change password', () => {
  const ln = new MainPage();
it('verify user is able to update the current user password by clicking on change password with password updated successfully message', () => {
  ln.changeThePassword(adminaccountPW);
});
it('verify user is able to see old passworddoes match error messages while changeing the password', () => {
  ln.errorMessageswhileChangingthepassword(invalidemail,adminaccountPW);
});
it('verify user is able to see Confirm Password does not match messages while changeing the password', () => {
  ln.confirmpassworddoesnmatchErrorMessages(invalidemail,adminaccountPW);
});
it('verify password strength message while changeing the password', () => {
  ln.passwordStrengthMessage(invalidemail,adminaccountPW);
});

});

 describe('trailrequest - user trial request', () => {
 const ln = new MainPage();
 it('verify user is able to see please verify the captcha error message while creating trial request', () => {
     Cypress.on('uncaught:exception', (err, runnable) => {
     if (err.message.includes("Cannot set properties of undefined")) {
      return false;
     }
     return true;
     });   
     ln.addTheUserThroughTrialRequest(trialrequestUrl,firstname,lastname,email,phone);
     });
 it('verify user is able to see error messages while creating trial request', () => {
     Cypress.on('uncaught:exception', (err, runnable) => {
     if (err.message.includes("Cannot set properties of undefined")) {
     return false;
     }
     return true;
     });   
     ln.errormessagewhiletrialrequest(trialrequestUrl,username);
     });
 it('verify user is able to see error messages in second page while creating trial request', () => {
     Cypress.on('uncaught:exception', (err, runnable) => {
      if (err.message.includes("Cannot set properties of undefined")) {
      return false;
      }
      return true;
      });   
      ln.errormessagewhiletrialrequestincompanypage(trialrequestUrl,firstname,lastname,email,phone);
      });
  });
