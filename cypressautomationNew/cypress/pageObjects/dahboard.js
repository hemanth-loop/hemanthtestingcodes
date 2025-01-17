function generateRandomString(length) {
  const characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
  let result = '';
  for (let i = 0; i < length; i++) {
    result += characters.charAt(Math.floor(Math.random() * characters.length));
  }
  return result;
}

function getRandomInt(min, max) {
  min = Math.ceil(min);
  max = Math.floor(max);
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

const randomName = generateRandomString(10);

class MainPage {
  // Selectors for login
  emailfield = "//*[@name='email']";
  passwordfield = "//*[@name='password']";
  signin = "//*[@type='submit']";
  logouticon = "//*[local-name()='svg' and @data-testid='AccountCircleIcon']/*[local-name()='path']";
  logoutclickon = "//*[text()='Log Out']";
  logouterrormessage = "//*[text()='Logged out successfully']";

  // API key module selectors
  apikeytab = "(//*[@role='button'])[5]";
  apikeyaddicon = "//*[@data-testid='HealthAndSafetyIcon']";
  apikeyname = "//*[@name='name']";
  apikeyrate = "//*[@name='rate']";
  apikeyburst = "//*[@name='burst']";
  apikeyquota = "//*[@name='quota']";
  apikeydescription = "//*[@id=':r3i:']";
  savebutton = "//*[text()='Save']";
  searchemail = "//*[@name='emailId']";
  search = "//*[text()='Search']";
  searchedemail = "//*[@aria-label='hemanth@zktecodev.com']";
  nextpageicon = "//*[local-name()='svg' and @data-testid='KeyboardArrowRightIcon']/*[local-name()='path']";
  secondpage15 = "//*[text()='1–16 of 30']";
  editapikey = "(//*[text()='Edit'])[1]";
  refreshIcon = "//*[@data-testid='RefreshIcon']";
  disableAndEnable = "//*[@ml='6']";
  statusenable = "//*[text()='Enable']";


    // tenant module selectors
   tenantTab = "//*[text()='Tenant']";
   addtenantIcon = "//*[@aria-label='upload picture']"
   tenantName = "(//*[@name='name'])[2]"
   tenantwebsite = "//*[@name='website']"
   industryDropdown = "(//*[@aria-haspopup='listbox'])[2]"
   companysize = "(//*[@aria-haspopup='listbox'])[3]"
   countryDropdown = "(//*[@aria-haspopup='listbox'])[4]"
   BiometricTypeDropdown = "(//*[@aria-haspopup='listbox'])[5]"
   tanentState = "//*[@name='state']";
   tanentCity = "//*[@name='city']";
   tanentzipcode = "//*[@name='zipcode']";
   tanentaddress = "//*[@name='address']";
   testcompanyTrue = "//*[@value='true']";
   testcompanyFalse = "//*[@value='false']";
   tenantsearchfield ="//*[@name='name']";
   companytypeDropdown = "//*[@id='mui-component-select-testCompany']";
   computerindustry = "//*[@data-value='Computer Industry']";
   biometrictypeface ="//*[@data-value='Face']";
   editCompanyicon = "(//button[text()='Edit'])[1]";
   compantType = "//*[@id='mui-component-select-testCompany']";
   testcomp = "Test Company";
   formalcomp = "Formal Company";

   // account module selectors
   useraccountTab ="//*[text()='Account']";
   useradd = "//*[@aria-label='add user']";
   userfirstname = "(//*[@name='firstName'])[2]";
   trailrequestfirstname = "//*[@name='firstName']";
   userlastname = "//*[@name='lastName']";
   useremail = "//*[@name='email']";
   userphone = "//*[@name='phone']";
   usertenentid = "//*[@id='tenantId']";
   userrole = "//*[@aria-labelledby='roleCode']";
   userstatusfalse = "//*[@value='false']";
   usersearchname = "//*[@name='firstName']";
   usersearchrole= "//*[@role='combobox']";
   adminrole="//li[text()='Admin']";
   adminAftersearch = "//td[text()='Admin']";
   ownerrole="//li[text()='Owner']";
   ownersAftersearch = "//td[text()='Owner']";
   devloperrole="//li[text()='Developer']";
   devloperroleaftersearch = "//td[text()='developer']";
   creationsuccessmessaeg="User added and membership assigned successfully";
   userApikey="//div[@id='apiKeyId']";
   apikeyfirstelement ="(//li[@role='option'])[1]";
   edituserfirstaccount ="(//button[text()='Edit'])[1]"
   userdelete ="(//button[text()='Delete'])[1]";
   tenantNameforSearch = "//*[@name='name']";
   tenantnameafterSearch = "//*[text()='digimax']";
   confirm ="(//button[text()='Confirm'])[1]";

 // monitor xpaths
   monitortab = "//span[text()='Monitor']";
   loginsubtab = "//span[text()='Login History']";
   mailsubtab = "//span[text()='Mail History']";
   apihistorysubtab = "//span[text()='API History']";
   searchloginhistory= "//input[@name='account']";
   searchmailinrecipient="//input[@name='recipient']";
   loginhistoryaftersearch="//td[text()='hemantharya001@gmail.com']";
   mailhistoryaftersearch="//td[text()='hemanth@zktecodev.com']";
   apihistoryaftersearch ="//span[text()='hemanth@zktecodev.com']";
   apiStatusDropdown ="//*[@aria-labelledby='mui-component-select-status']";
   successdropdown ="//li[text()='Success']";
   successaftersearch="//p[text()='Success']";
   Faileddropdown ="//li[text()='Failed']";
   failedaftersearch="//p[text()='Failed']";


   // Error messages while creating the api key

  nameisrequirederrormessage = "Name is required";
  rateisrequired = "Rate is required";
  burstisrequired = "Burst is required";
  quotaisrequired = "Quota is required";
  descriptionisrequired = "Description is required";
  secretKeyGenaratedSuccesfully = "Secret Key generated successfully";
  apiKeyUpdatedSuccesfully = "Api key status updated";
  apikeyinfoupdatedsuccesfully = "APiI Key info updated successfully"
  companycreatedsuccessfully = "Company created successfully"
  companynamealreadyexist = "Company name already exists."
  companyUpdatedSucessfully = "Company updated successfully."

  // Error messages while creating the company

  tenantnameerror = "name is a required field";
  tenantwebsiteerror = "website is a required field";
  tenentindustryerror = "industry is a required field";
  tenentsizeerror = "size is a required field";
  tenantcountryerror = "country is a required field";
  tenentstateerror = "state is a required field";
  tenentcityerror = "city is a required field";
  tenantBiometricerror = "biometricType is a required field";
  tenantZipcodeerror = "zipcode is a required field";
  tenentAdresserror = "address is a required field";
  existingCompnayName = "digimax";
  norecordsmessage = "No data available";
  

  //account creation error messages
  invalidemail ="Invalid email format";
  tenantisrequired ="tenantId is required";
  apikeyisrequired ="API Key is required";
  useralreadyexist ="User already exist";
  deleteusererrormessage ="User and membership deleted successfully";
  updateusermessage ="User updated and membership updated successfully";
  apikeyassignedtoanotherdevloper = "The selected API key is already assigned to another developer.";
  

   //common xpaths
   dashboardmodule ="//*[text()='Dashboard']";
   apihistorymodule ="//*[text()='API History']";
   changepasword ="//p[text()='Change Password']";
   orignalpassword="//input[@name='oldPassword']";
   newpassword="//input[@name='newPassword']";
   confirmpassword="//input[@name='confirmPassword']";
   pleaseenterpassword="//p[text()='Please enter a new password']";
   pleaseconfirmyourpassword="//p[text()='Please confirm your password']";
   newpasswordmustbeatlest8  ="//p[text()='New Password must be at least 8 characters']";
   confirmpassworddoesnmatch  ="//p[text()='Confirm Password does not match']";
   passwordchangedmessage ="Password changed successfully";
   oldpassworddoesmatch ="Old password does not match.";
   confirmpassworddoesnmatch ="Confirm Password does not match";
   passwordstrength = "New Password must be at least 8 characters";
   confirmpasswordmessage = "Please confirm your password";
   startfreetrial = "(//div[text()='START YOUR FREE TRIAL'])[1]";
   nextbutton= "(//button[text()='Next'])[1]";
   companyinfonext ="(//button[text()='Next'])[2]";
   submit = "//button[text()='Submit']";

   
   //trial request 
   trialrequestcompany = "//*[@name='company']";
   trialrequestcompanysize = "//*[@id='companySize']";
   trialrequestindustry = "//*[@name='industry']";
   trialrequestcountry = "//*[@name='country']";
   trialrequestaddress = "//*[@name='address']";
   trialrequestcity = "//*[@name='city']";
   trialrequeststate = "//*[@name='state']";
   captachverificationfailed = "Failed to verify captcha image";
      
   trialrequestfirstnameerror ="Please fill in the First Name";
   trialrequestlastnamenameerror = "Please fill in the Last Name";
   trialrequestemailerror="Please enter a valid email";
   trialrequestemailalreadyexist="Email already exists.";
   trialrequestphoneerror="Please enter a valid phone number";

   trialrequestcompanyerror = "Please fill in the company name";
   trialrequestcompanysize ="please enter the valid company size";
   trialrequestindustry ="Please fill in the Industry";
   trialrequestaddress ="Please fill the Address";
   trialrequestcity ="Please fill in the City";
   trialrequeststate ="Please fill in the State";
   trialrequestcountry ="Please fill in the Country";




  // XPath for error message validations
  nameisreq = `//*[text()='${this.nameisrequirederrormessage}']`;
  rateisreq = `//*[text()='${this.rateisrequired}']`;
  burstisreq = `//*[text()='${this.burstisrequired}']`;
  quotaisreq = `//*[text()='${this.quotaisrequired}']`;
  descriptionisreq = `//*[text()='${this.descriptionisrequired}']`;

  // charts in the dashboard
  apirequestration="API Request Ratio";
  top10apirequest="Top 10 API Requests";
  totaltrends="Total Trends";
  apitrends="API Trends";
  top10activedevlopers ="Top 10 Active Developer";
  top10errrorcountbyapi="Top 10 Error Count By API";
  emailid = "hemanth@zktecodev.com";



  createApiKey() {
    cy.xpath(this.apikeytab).click();
    cy.xpath(this.apikeyaddicon).click();
    cy.xpath(this.apikeyname).type(randomName);
    cy.xpath(this.apikeyrate).type("10");
    cy.xpath(this.apikeyburst).type("10");
    cy.xpath(this.apikeyquota).type("100");
    cy.xpath(this.apikeydescription).type("this is created api key");
    cy.xpath(this.savebutton).click();
  }

 
  Validatetheerrormessages() {
    cy.xpath(this.apikeytab).click();
    cy.xpath(this.apikeyaddicon).click();
    cy.xpath(this.savebutton).click();
    cy.xpath(this.nameisreq).should("be.visible");
    cy.xpath(this.rateisreq).should("be.visible");
    cy.xpath(this.burstisreq).should("be.visible");
    cy.xpath(this.quotaisreq).should("be.visible");
    cy.xpath(this.descriptionisreq).should("be.visible");
  }

 
  searchTheApikeybasedonEmail() {
    cy.xpath(this.apikeytab).click();
    cy.xpath(this.searchemail).type(this.emailid);
    cy.xpath(this.search).click();
    cy.xpath(this.searchedemail).should("be.visible");
  }


  navigateToNextpage() {
    cy.xpath(this.apikeytab).click();
    cy.wait(2000);
    cy.xpath(this.nextpageicon)
      .scrollIntoView()
      .should('be.visible')
      .and('not.be.disabled')
      .click({ force: true });
    cy.scrollTo('bottom');
    cy.wait(2000);
    cy.contains("16");
  }

 
  regenarateTheApikey() {
    cy.xpath(this.apikeytab).click();
    cy.xpath(this.searchemail).type(this.emailid);
    cy.xpath(this.search).click();
    cy.xpath(this.editapikey).click();
    cy.xpath(this.refreshIcon).click();
    cy.contains(this.secretKeyGenaratedSuccesfully).should('be.visible');
  }

  
  disableTheApiKey() {
    cy.xpath(this.apikeytab).click();
    cy.xpath(this.searchemail).type(this.emailid);
    cy.xpath(this.search).click();
    cy.xpath(this.disableAndEnable).click();
    cy.contains(this.apiKeyUpdatedSuccesfully).should("be.visible");
  }

  checkthestatus() {
    cy.xpath(this.apikeytab).click();
    cy.xpath(this.searchemail).type(this.emailid);
    cy.xpath(this.search).click();
    cy.xpath(this.disableAndEnable)
      .invoke('text')
      .then((text) => {
        cy.log('The text is:', text);
        console.log(text);

        if (text == "Disable") {
          cy.xpath(this.disableAndEnable).click();
          console.log("Changed from disable to enable");
        } else {
          cy.xpath(this.disableAndEnable).click();
        }
        cy.wait(2000);
        cy.xpath(this.disableAndEnable)
          .invoke('text')
          .then((sectext) => {
            cy.log('The text is:', sectext);
            console.log(sectext);
            expect(sectext).to.not.equal(text);
       });
      }); 

  }

 
  editTheApiKey() {
    cy.xpath(this.apikeytab).click(); 
    cy.xpath(this.searchemail).type(this.emailid); 
    cy.xpath(this.search).click(); 
  
    cy.xpath(this.disableAndEnable)
      .invoke('text')
      .then((statusText) => {
        if (statusText.includes("Enable")) {
          cy.xpath(this.disableAndEnable).click();
        } else {
          cy.xpath(this.editapikey).click();
          cy.xpath(this.apikeyrate).click().clear().type("300");
          cy.xpath(this.apikeyburst).click().clear().type("300");
          cy.xpath(this.apikeyquota).click().clear().type("1000");
          cy.xpath(this.savebutton).click();
          cy.contains(this.apikeyinfoupdatedsuccesfully).should("be.visible");
        }
      });
    }
  createTenent() {
    cy.xpath(this.tenantTab).click();
    cy.xpath(this.addtenantIcon).click();
    cy.xpath(this.tenantName).type("Tenant " + randomName);
    cy.xpath(this.tenantwebsite).type("https://example.com");
    cy.xpath(this.industryDropdown).click();
    cy.xpath(this.computerindustry).click({force: true});
    cy.xpath(this.companysize).click({ force: true });
    cy.contains("1 - 20 employess").click(); // Example company size option
    cy.xpath(this.countryDropdown).click();
    cy.contains("India").click(); // Example country
    cy.xpath(this.BiometricTypeDropdown).click();
    cy.xpath(this.biometrictypeface).click({ force: true });
    cy.xpath(this.tanentState).type("California");
    cy.xpath(this.tanentCity).type("Los Angeles");
    cy.xpath(this.tanentzipcode).type("90001");
    cy.xpath(this.tanentaddress).type("123 Example Street");
    cy.xpath(this.testcompanyTrue).click();
    cy.xpath(this.savebutton).click();
    cy.contains(this.companycreatedsuccessfully).should("be.visible");
  }
  errorMessageForCompany(){
    cy.xpath(this.tenantTab).click();
    cy.xpath(this.addtenantIcon).click();
    cy.xpath(this.savebutton).click();
    cy.contains(this.tenantnameerror).should("be.visible");
    cy.contains(this.tenantwebsiteerror).should("be.visible");
    cy.contains(this.tenentindustryerror).should("be.visible");
    cy.contains(this.tenentsizeerror).should("be.visible");
    cy.contains(this.tenantcountryerror).should("be.visible");
    cy.contains(this.tenentstateerror).should("be.visible");
    cy.contains(this.tenentcityerror).should("be.visible");
    cy.contains(this.tenantBiometricerror).should("be.visible");
    cy.contains(this.tenantZipcodeerror).should("be.visible");
    cy.contains(this.tenentAdresserror).should("be.visible");
  }
  companyNameExist() {
    cy.xpath(this.tenantTab).click();
    cy.xpath(this.addtenantIcon).click();
    cy.xpath(this.tenantName).type(this.existingCompnayName); // Enter existing company name
    cy.xpath(this.tenantwebsite).type("https://example.com");
    cy.xpath(this.industryDropdown).click();
    cy.xpath(this.computerindustry).click({force: true});
    cy.xpath(this.companysize).click({ force: true });
    cy.contains("1 - 20 employess").click(); // Example company size option
    cy.xpath(this.countryDropdown).click();
    cy.contains("India").click(); // Example country
    cy.xpath(this.BiometricTypeDropdown).click();
    cy.xpath(this.biometrictypeface).click({ force: true });
    cy.xpath(this.tanentState).type("California");
    cy.xpath(this.tanentCity).type("Los Angeles");
    cy.xpath(this.tanentzipcode).type("90001");
    cy.xpath(this.tanentaddress).type("123 Example Street");
    cy.xpath(this.testcompanyTrue).click();
    cy.xpath(this.savebutton).click();
    cy.contains(this.companynamealreadyexist).should("be.visible");
}
searchcompanyOnName(existingCompnayName){
  cy.xpath(this.tenantTab).click();
  cy.xpath(this.tenantNameforSearch).click().type(existingCompnayName);
  cy.xpath(this.search).click();
  cy.xpath(this.tenantnameafterSearch).should("be.visible");
}
searchcompanyOninvalidName(){
  cy.xpath(this.tenantTab).click();
  cy.xpath(this.tenantNameforSearch).click().type(randomName);
  cy.xpath(this.search).click();
  cy.contains(this.norecordsmessage).should("be.visible");
}
navigateToNextpage(){
  cy.xpath(this.tenantTab).click();
  cy.wait(2000);
    cy.xpath(this.nextpageicon)
      .scrollIntoView()
      .should('be.visible')
      .and('not.be.disabled')
      .click({ force: true });
    cy.scrollTo('bottom');
    cy.wait(2000);
    cy.contains("16");
}
editCompany(){
  cy.xpath(this.tenantTab).click();
  cy.xpath(this.editCompanyicon).click();
  cy.xpath(this.tenantwebsite).clear().type("https://example.com");
  cy.xpath(this.industryDropdown).click();
  cy.xpath(this.computerindustry).click({force: true});
  cy.xpath(this.tanentState).clear().type("California");
  cy.xpath(this.tanentCity).clear().type("Los Angeles");
  cy.xpath(this.tanentzipcode).clear().type("90001");
  cy.xpath(this.tanentaddress).clear().type("123 Example Street");
  cy.xpath(this.testcompanyTrue).click();
  cy.xpath(this.savebutton).click();
  cy.contains(this.companyUpdatedSucessfully).should("be.visible");
}
createcompnywithfalse(){
  cy.xpath(this.tenantTab).click();
  cy.xpath(this.addtenantIcon).click();
  cy.xpath(this.tenantName).type("Tenant " + randomName);
  cy.xpath(this.tenantwebsite).type("https://example.com");
  cy.xpath(this.industryDropdown).click();
  cy.xpath(this.computerindustry).click({force: true});
  cy.xpath(this.companysize).click({ force: true });
  cy.contains("1 - 20 employess").click(); // Example company size option
  cy.xpath(this.countryDropdown).click();
  cy.contains("India").click(); // Example country
  cy.xpath(this.BiometricTypeDropdown).click();
  cy.xpath(this.biometrictypeface).click({ force: true });
  cy.xpath(this.tanentState).type("California");
  cy.xpath(this.tanentCity).type("Los Angeles");
  cy.xpath(this.tanentzipcode).type("90001");
  cy.xpath(this.tanentaddress).type("123 Example Street");
  cy.xpath(this.testcompanyFalse).click();
  cy.xpath(this.savebutton).click();
  cy.contains(this.companycreatedsuccessfully).should("be.visible");
}
searchCompanyType(){
  cy.xpath(this.tenantTab).click();
  cy.xpath(this.compantType).click();
  cy.contains("Test Company ").click();
  cy.xpath(this.search).click();
  cy.contains(this.testcomp).should("be.visible");
  cy.xpath(this.compantType).click();
  cy.contains("Formal Company").click();
  cy.xpath(this.search).click();
  cy.contains(this.formalcomp).should("be.visible");
}
createAdmin(firstname,lastname,email,phone,existingCompnayName){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.useradd).click();
  cy.xpath(this.userfirstname).type(firstname);
  cy.xpath(this.userlastname).type(lastname);
  
  cy.xpath(this.useremail).type(email);
  cy.xpath(this.userphone).type(phone);
  cy.xpath(this.usertenentid).click();
  cy.contains(existingCompnayName).click();
  cy.xpath(this.userrole).click();
  cy.xpath(this.adminrole).click({ force: true });
  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.creationsuccessmessaeg).should("be.visible");
}
createOwner(firstname,lastname,email,phone,existingCompnayName){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.useradd).click();
  cy.xpath(this.userfirstname).type(firstname);
  cy.xpath(this.userlastname).type(lastname);
  cy.xpath(this.useremail).type(email);
  cy.xpath(this.userphone).type(phone);
  cy.xpath(this.usertenentid).click();
  cy.contains(existingCompnayName).click();
  cy.xpath(this.userrole).click();
  cy.xpath(this.ownerrole).click({ force: true });
  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.creationsuccessmessaeg).should("be.visible");
}
createDevloper(firstname,lastname,email,phone,existingCompnayName){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.useradd).click();
  cy.xpath(this.userfirstname).type(firstname);
  cy.xpath(this.userlastname).type(lastname);
  cy.xpath(this.useremail).type(email);
  cy.xpath(this.userphone).type(phone);
  cy.xpath(this.usertenentid).click();
  cy.contains(existingCompnayName).click();
  cy.xpath(this.userrole).click();
  cy.xpath(this.devloperrole).click({ force: true });


  cy.xpath(this.userApikey).click();
  cy.xpath(this.apikeyfirstelement).click();
  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.creationsuccessmessaeg).should("be.visible");
}
errorMesCreatingUser(firstname,lastname,invalidemail,phone){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.useradd).click();
  cy.xpath(this.userfirstname).type(firstname);
  cy.xpath(this.userlastname).type(lastname);
  cy.xpath(this.useremail).type(invalidemail);
  cy.xpath(this.userphone).type(phone);
  cy.xpath(this.userrole).click({ force: true });
  cy.xpath(this.devloperrole).click({ force: true });
  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.invalidemail).should("be.visible");
  cy.contains(this.tenantisrequired).should("be.visible");
  cy.contains(this.apikeyisrequired).should("be.visible");
}
existEmailmessage(firstname,lastname,existingemail,phone,existingCompnayName){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.useradd).click();
  cy.xpath(this.userfirstname).type(firstname);
  cy.xpath(this.userlastname).type(lastname);
  cy.xpath(this.useremail).type(existingemail);
  cy.xpath(this.userphone).type(phone);
  cy.xpath(this.userrole).click({ force: true });
  cy.xpath(this.adminrole).click({ force: true });
  cy.xpath(this.usertenentid).click();
  cy.contains(existingCompnayName).click();
  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.useralreadyexist).should("be.visible");
}
searchOnName(accountFirstname){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.usersearchname).type(accountFirstname);
  cy.xpath(this.search).click();
 cy.contains(accountFirstname).should("be.visible");
}
searchOnInvalid(firstname){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.usersearchname).type(firstname);  
  cy.xpath(this.search).click();
  cy.contains(this.norecordsmessage).should("be.visible");
}
navigateToNextpageinAcount(){
  cy.xpath(this.useraccountTab).click();
  cy.wait(2000);
    cy.xpath(this.nextpageicon)
      .scrollIntoView()
      .should('be.visible')
      .and('not.be.disabled')
      .click({ force: true });
    cy.scrollTo('bottom');
    cy.wait(2000);
    cy.contains("16");
}
deleteUser(){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.userdelete).click();
  cy.xpath(this.confirm).click();
  cy.contains(this.deleteusererrormessage).should("be.visible");
}
editTheuser(firstname,lastname,phone){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.edituserfirstaccount).click();
  const firstnamedata =firstname
  const lastnamedata =lastname
  const phonenumberdata =phone
  
  cy.xpath(this.userfirstname).clear().type(firstnamedata);
  cy.xpath(this.userlastname).clear().type(lastnamedata);
  cy.xpath(this.userphone).clear().type(phonenumberdata);

  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.updateusermessage).should("be.visible");
  
  cy.xpath(this.edituserfirstaccount).click();
  cy.xpath(this.userfirstname)
  .invoke('val') // Use 'val' for input fields
  .then((value) => {
    expect(value.trim()).to.equal(firstnamedata);
  });
  cy.xpath(this.userlastname)
  .invoke('val') // Use 'val' for input fields
  .then((value) => {
    expect(value.trim()).to.equal(lastnamedata);
  });
  cy.xpath(this.userphone)
  .invoke('val')
  .then((value) => {
    expect(value===phonenumberdata);
  });
}
apiKeyAssignedtoanotherUser(firstname,lastname,email,phone,existingCompnayName) {
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.useradd).click();
  cy.xpath(this.userfirstname).type(firstname);
  cy.xpath(this.userlastname).type(lastname);
  cy.xpath(this.useremail).type(email);
  cy.xpath(this.userphone).type(phone);
  cy.xpath(this.usertenentid).click();
  cy.contains(existingCompnayName).click();
  cy.xpath(this.userrole).click();
  cy.xpath(this.devloperrole).click({ force: true });
  cy.xpath(this.userApikey).click();
  cy.xpath(this.apikeyfirstelement).click();
  cy.xpath(this.savebutton).click({ force: true });
  cy.contains(this.apikeyassignedtoanotherdevloper).should("be.visible");
 }
 filterBasedonRole(){
  cy.xpath(this.useraccountTab).click();
  cy.xpath(this.usersearchrole).click();
  cy.xpath(this.adminrole).click();
  cy.xpath(this.search).click();
  cy.xpath(this.adminAftersearch).should("be.visible");
  cy.xpath(this.usersearchrole).click();
  cy.xpath(this.ownerrole).click();
  cy.xpath(this.search).click();
  cy.xpath(this.ownersAftersearch).should("be.visible");
  cy.xpath(this.usersearchrole).click();
  cy.xpath(this.devloperrole).click({ force: true });
  cy.xpath(this.search).click();
  cy.xpath(this.devloperroleaftersearch).should("be.visible");
 }
 adminLogin(adminaccountUN,adminaccountPW){
  cy.xpath(this.logouticon).click({ force: true});
  cy.xpath(this.logoutclickon).click({ force: true});
  cy.wait(2000)
  cy.xpath(this.emailfield).should('be.visible').type(adminaccountUN);
    cy.xpath(this.passwordfield).should('be.visible').type(adminaccountPW);
        cy.xpath(this.signin).click();
 }
checkTheChartsinDashboard(){
cy.contains(this.apirequestration).should('be.visible')
cy.contains(this.top10apirequest).should('be.visible')
cy.contains(this.totaltrends).should('be.visible')
cy.contains(this.apitrends).should('be.visible')
cy.contains(this.top10activedevlopers).should('be.visible')
cy.contains(this.top10errrorcountbyapi).should('be.visible')
}
searchLoginbasedonEmail(){
cy.xpath(this.monitortab).click();
cy.xpath(this.loginsubtab).click();
cy.xpath(this.searchloginhistory).type("hemantharya001@gmail.com");
cy.xpath(this.search).click();
cy.xpath(this.loginhistoryaftersearch).should('be.visible');
}
navigateToNextpageinloginhistory(){
  cy.xpath(this.monitortab).click();
  cy.xpath(this.loginsubtab).click();
  cy.wait(2000);
    cy.xpath(this.nextpageicon)
      .scrollIntoView()
      .should('be.visible')
      .and('not.be.disabled')
      .click({ force: true });
    cy.scrollTo('bottom');
    cy.wait(2000);
    cy.contains("16");
}
searchMailHistorybasedonrecipient(existingemail){
  cy.xpath(this.monitortab).click();
  cy.xpath(this.mailsubtab).click();
  cy.xpath(this.searchmailinrecipient).type(existingemail);
  cy.xpath(this.search).click();
  cy.xpath(this.mailhistoryaftersearch).should('be.visible');
}
searchApiHistorybasedonAccount(existingemail){
  cy.xpath(this.monitortab).click();
  cy.xpath(this.apihistorysubtab).click();
  cy.xpath(this.searchloginhistory).type(existingemail);
  cy.xpath(this.search).click();
  cy.xpath(this.apihistoryaftersearch).should('be.visible');
}
navigateToNextpageinApihistory(){
  cy.xpath(this.monitortab).click();
  cy.xpath(this.apihistorysubtab).click();
  cy.wait(2000);
    cy.xpath(this.nextpageicon)
      .scrollIntoView()
      .should('be.visible')
      .and('not.be.disabled')
      .click({ force: true });
    cy.scrollTo('bottom');
    cy.wait(2000);
    cy.contains("16");
}
searchBasedOnStatus(){
  cy.xpath(this.monitortab).click();
  cy.xpath(this.apihistorysubtab).click();
  cy.xpath(this.apiStatusDropdown).click();
  cy.xpath(this.successdropdown).click();
  cy.xpath(this.search).click();
  cy.xpath(this.successaftersearch).should('be.visible');
  cy.xpath(this.apiStatusDropdown).click();
  cy.xpath(this.Faileddropdown).click();
  cy.xpath(this.search).click();
  cy.xpath(this.failedaftersearch).should('be.visible');
}
changeThePassword(adminaccountPW){
  cy.xpath(this.logouticon).click({force:true});
  cy.xpath(this.changepasword).click();
  cy.xpath(this.orignalpassword).type(adminaccountPW);
  cy.xpath(this.newpassword).type(adminaccountPW);
  cy.xpath(this.confirmpassword).type(adminaccountPW);
  cy.xpath(this.submit).click();
  cy.contains(this.passwordchangedmessage).should('be.visible');
}

errorMessageswhileChangingthepassword(invalidemail,adminaccountPW){
  cy.xpath(this.logouticon).click({force:true});
  cy.xpath(this.changepasword).click();
  cy.xpath(this.orignalpassword).type(invalidemail);
  cy.xpath(this.newpassword).type(adminaccountPW);
  cy.xpath(this.confirmpassword).type(adminaccountPW);
  cy.xpath(this.submit).click();
  cy.contains(this.oldpassworddoesmatch).should('be.visible');
}
confirmpassworddoesnmatchErrorMessages(invalidemail,adminaccountPW){
  cy.xpath(this.logouticon).click({force:true});
  cy.xpath(this.changepasword).click();
  cy.xpath(this.orignalpassword).type(adminaccountPW);
  cy.xpath(this.newpassword).type(adminaccountPW);
  cy.xpath(this.confirmpassword).type(invalidemail);
  cy.xpath(this.submit).click();
  cy.contains(this.confirmpassworddoesnmatch).should('be.visible');
}

passwordStrengthMessage(invalidemail,adminaccountPW){
  cy.xpath(this.logouticon).click({force:true});
  cy.xpath(this.changepasword).click();
  cy.xpath(this.orignalpassword).type(adminaccountPW);
  cy.xpath(this.newpassword).type(invalidemail);
  cy.xpath(this.submit).click();
  cy.contains(this.passwordstrength).should('be.visible');
  cy.contains(this.confirmpasswordmessage).should('be.visible');
  
}
logOut(){
  cy.xpath(this.logouticon).click({force:true});
  cy.xpath(this.logoutclickon).click({force:true});
}
addTheUserThroughTrialRequest(trialrequestUrl, firstname, lastname, email, phone) {
  Cypress.on('uncaught:exception', (err, runnable) => {
    // Ignore the specific reCAPTCHA error
    if (err.message.includes("No reCAPTCHA clients exist")) {
      return false;
    }
    
    return true;
  });
  
    cy.wait(5000);
    cy.visit(trialrequestUrl);    
    cy.xpath(this.startfreetrial).click({ force: true }); 
    cy.xpath(this.trailrequestfirstname).type(firstname); 
    cy.xpath(this.userlastname).type(lastname);
    cy.xpath(this.useremail).type(email);
    cy.xpath(this.userphone).type(phone);
    cy.xpath(this.nextbutton).click();

    cy.xpath(this.trialrequestcompany).type(firstname);
   
    cy.xpath(this.trialrequestcompanysize).select('200');
    cy.xpath(this.trialrequestindustry).select('Aerospace Industry');
    cy.xpath(this.trialrequestcountry).select('India');
    cy.xpath(this.trialrequestaddress).type(firstname);
    cy.xpath(this.trialrequestcity).type(firstname);
    cy.xpath(this.trialrequeststate).type(firstname);
    cy.xpath(this.companyinfonext).click();    
    cy.xpath(this.submit).click();
    cy.contains(this.captachverificationfailed).should("be.visible");
   
}
errormessagewhiletrialrequest(trialrequestUrl,username){
  Cypress.on('uncaught:exception', (err, runnable) => {
    // Ignore the specific reCAPTCHA error
    if (err.message.includes("No reCAPTCHA clients exist")) {
      return false;
    }
    
    return true;
  });
    cy.wait(5000);
    cy.visit(trialrequestUrl);    
    cy.xpath(this.startfreetrial).click({ force: true });
    cy.xpath(this.nextbutton).click();
    cy.contains(this.trialrequestfirstnameerror).should("be.visible");
    cy.contains(this.trialrequestlastnamenameerror).should("be.visible");
    cy.contains(this.trialrequestemailerror).should("be.visible");
    cy.contains(this.trialrequestphoneerror).should("be.visible");
    cy.xpath(this.useremail).click();
    cy.xpath(this.useremail).type(username);
    cy.contains(this.trialrequestemailalreadyexist).should("be.visible");
}










errormessagewhiletrialrequestincompanypage(trialrequestUrl,firstname,lastname,email,phone){
  Cypress.on('uncaught:exception', (err, runnable) => {
    // Ignore the specific reCAPTCHA error
    if (err.message.includes("No reCAPTCHA clients exist")) {
      return false;
    }
    
    return true;
  });
    // cy.wait(5000);
    cy.visit(trialrequestUrl);    
    cy.xpath(this.startfreetrial).click({ force: true }); 
    cy.xpath(this.trailrequestfirstname).type(firstname); 
    cy.xpath(this.userlastname).type(lastname);
    cy.xpath(this.useremail).type(email);
    cy.xpath(this.userphone).type(phone);
    cy.xpath(this.nextbutton).click();
    cy.xpath(this.companyinfonext).click();    
    cy.contains(this.trialrequestcompanyerror).should("be.visible");
    cy.contains(this.trialrequestcompanysize).should("be.visible");
    cy.contains(this.trialrequestindustry).should("be.visible");
    cy.contains(this.trialrequestaddress).should("be.visible");
    cy.contains(this.trialrequestcity).should("be.visible");
    cy.contains(this.trialrequeststate).should("be.visible");
    cy.contains(this.trialrequestcountry).should("be.visible");




    
    
  }
}
export default MainPage;