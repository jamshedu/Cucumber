$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee with first and lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees \"John\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_enters_employees_first_name_and_last_name(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"John Smith\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.employee_is_added_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add Employee with first and lastname");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee without employee id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees first name and last name",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_enters_employees_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes employee id",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_deletes_employee_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.employee_is_added_successfully()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[James Smith]\u003e but was:\u003c[-- Select --\nAlbanian\nAlgerian\nAmerican\nAndorran\nAngolan\nAntiguans\nArgentinean\nArmenian\nAustralian\nAustrian\nAzerbaijani\nBahamian\nBahraini\nBangladeshi\nBarbadian\nBarbudans\nBatswana\nBelarusian\nBelgian\nBelizean\nBeninese\nBhutanese\nBolivian\nBosnian\nBrazilian\nBritish\nBruneian\nBulgarian\nBurkinabe\nBurmese\nBurundian\nCambodian\nCameroonian\nCanadian\nCape Verdean\nCentral African\nChadian\nChilean\nChinese\nColombian\nComoran\nCongolese\nCosta Rican\nCroatian\nCuban\nCypriot\nCzech\nDanish\nDjibouti\nDominican\nDutch\nEast Timorese\nEcuadorean\nEgyptian\nEmirian\nEquatorial Guinean\nEritrean\nEstonian\nEthiopian\nFijian\nFilipino\nFinnish\nFrench\nGabonese\nGambian\nGeorgian\nGerman\nGhanaian\nGreek\nGrenadian\nGuatemalan\nGuinea-Bissauan\nGuinean\nGuyanese\nHaitian\nHerzegovinian\nHonduran\nHungarian\nI-Kiribati\nIcelander\nIndian\nIndonesian\nIranian\nIraqi\nIrish\nIsraeli\nItalian\nIvorian\nJamaican\nJapanese\nJordanian\nKazakhstani\nKenyan\nKittian and Nevisian\nKuwaiti\nKyrgyz\nLaotian\nLatvian\nLebanese\nLiberian\nLibyan\nLiechtensteiner\nLithuanian\nLuxembourger\nMacedonian\nMalagasy\nMalawian\nMalaysian\nMaldivan\nMalian\nMaltese\nMarshallese\nMauritanian\nMauritian\nMexican\nMicronesian\nMoldovan\nMonacan\nMongolian\nMoroccan\nMosotho\nMotswana\nMozambican\nNamibian\nNauruan\nNepalese\nNew Zealander\nNicaraguan\nNigerian\nNigerien\nNorth Korean\nNorthern Irish\nNorwegian\nOmani\nPakistani\nPalauan\nPanamanian\nPapua New Guinean\npapua yeni\nParaguayan\nPeruvian\nPolish\nPortuguese\nQatari\nRomanian\nRussian\nRwandan\nSaint Lucian\nSalvadoran\nSamoan\nSan Marinese\nSao Tomean\nSaudi\nScottish\nSenegalese\nSerbian\nSeychellois\nSierra Leonean\nSingaporean\nSlovakian\nSlovenian\nSolomon Islander\nSomali\nSouth African\nSouth Korean\nSpanish\nSri Lankan\nSudanese\nSurinamer\nSwazi\nSwedish\nSwiss\nSyrian\nTaiwanese\nTajik\nTanzanian\nThai\nTogolese\nTongan\nTrinidadian or Tobagonian\nTunisian\nTurkish\nTuvaluan\nUgandan\nUkrainian\nUruguayan\nUzbekistani\nVenezuelan\nVietnamese\nWelsh\nYemenite\nZambian\nZimbabwean]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat com.hmrs.steps.AddEmployeeSteps.employee_is_added_successfully(AddEmployeeSteps.java:49)\n\tat ✽.employee is added successfully(file:///Users/dzhamshedumarov/eclipse-workspace/Hrms/src/test/resources/features/AddEmployee.feature:19)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "Add Employee without employee id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "AddEmployee and create Login Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees first name and last name",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_enters_employees_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on create login checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_on_create_login_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters login credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_enters_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.employee_is_added_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#personal_cmbNation\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Dzhamsheds-MacBook-Pro.local\u0027, ip: \u00272605:e000:a8c3:7700:0:0:0:6%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/fk/4kt1l4x124g...}, goog:chromeOptions: {debuggerAddress: localhost:52870}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7427a4e6349042f818a730001c307c5e\n*** Element info: {Using\u003did, value\u003dpersonal_cmbNation}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\n\tat com.hmrs.steps.AddEmployeeSteps.employee_is_added_successfully(AddEmployeeSteps.java:47)\n\tat ✽.employee is added successfully(file:///Users/dzhamshedumarov/eclipse-workspace/Hrms/src/test/resources/features/AddEmployee.feature:27)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", "AddEmployee and create Login Credentials");
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employees \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\" and \"\u003cLastName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.step({
  "name": "\"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\" and \"\u003cLastName\u003e\" is added successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "James",
        "J",
        "Smith"
      ]
    },
    {
      "cells": [
        "Faisal",
        "F",
        "Sakhi"
      ]
    },
    {
      "cells": [
        "Sohil",
        "S",
        "Instuctor"
      ]
    },
    {
      "cells": [
        "Yunus",
        "Emre",
        "Yakut"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employees \"James\", \"J\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.enteringEmployee(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"James\", \"J\" and \"Smith\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.and_is_added_successfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Adding multiple employees");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employees \"Faisal\", \"F\" and \"Sakhi\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.enteringEmployee(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Faisal\", \"F\" and \"Sakhi\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.and_is_added_successfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Adding multiple employees");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employees \"Sohil\", \"S\" and \"Instuctor\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.enteringEmployee(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Sohil\", \"S\" and \"Instuctor\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.and_is_added_successfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", "Adding multiple employees");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hmrs.steps.LoginSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enter employees \"Yunus\", \"Emre\" and \"Yakut\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.enteringEmployee(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Yunus\", \"Emre\" and \"Yakut\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hmrs.steps.AddEmployeeSteps.and_is_added_successfully(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", "Adding multiple employees");
formatter.after({
  "status": "passed"
});
});