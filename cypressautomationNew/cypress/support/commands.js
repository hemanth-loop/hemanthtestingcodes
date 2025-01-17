// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })

import MainPage from "../pageObjects/dahboard"
///<reference types ="cypress"/>
///<reference types ="cypress-xpath"/>

Cypress.Commands.add("loginapplication",(email,password,url)=>{

    const ln = new MainPage();
    cy.viewport(1920, 1080);
    cy.visit(url)
    cy.xpath(ln.emailfield).should('be.visible').type(email);
    cy.xpath(ln.passwordfield).should('be.visible').type(password);
        cy.xpath(ln.signin).click();  
})

Cypress.Commands.add("logoutFromApplication",()=>{

    const ln = new MainPage();
     cy.xpath(ln.logouticon).click({ force: true });
     cy.xpath(ln.clickonlogout).click({ force: true });
    cy.xpath(ln.logouterrormessage).should('be.visible')

})