// ***********************************************************
// This example support/e2e.js is processed and
// loaded automatically before your test files.
//
// This is a great place to put global configuration and
// behavior that modifies Cypress.
//
// You can change the location of this file or turn off
// automatically serving support files with the
// 'supportFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/configuration
// ***********************************************************

// Import commands.js using ES2015 syntax:
import './commands'

// Alternatively you can use CommonJS syntax:
// require('./commands')

require('cypress-xpath')

Cypress.on('uncaught:exception', (err) => {
    if (err.message.includes('googleCaptcha is not defined')) {
      return false; // Prevent Cypress from failing the test
    }
    return true; // Let other errors fail the test
  });
  
  Cypress.on('window:before:load', (win) => {
    win.googleCaptcha = {
      ready: (callback) => callback(),
      execute: () => Promise.resolve('mock-token'),
      render: () => 'mock-render-id',
    };
  });
   