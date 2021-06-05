$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataTableWithExample.feature");
formatter.feature({
  "line": 1,
  "name": "This is the login feature for Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "This is login scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Proceed to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "users enters \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicked button",
  "keyword": "And "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9,
      "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 10,
      "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario;;2"
    },
    {
      "cells": [
        "Admin",
        "admin13"
      ],
      "line": 11,
      "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "This is login scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Proceed to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "users enters \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicked button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTableWithExample.proceed_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 14
    },
    {
      "val": "admin123",
      "offset": 26
    }
  ],
  "location": "DataTableWithExample.users_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWithExample.clicked_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "This is login scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Proceed to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "users enters \"Admin\" and \"admin13\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicked button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTableWithExample.proceed_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 14
    },
    {
      "val": "admin13",
      "offset": 26
    }
  ],
  "location": "DataTableWithExample.users_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWithExample.clicked_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("DataTableWithHeader.feature");
formatter.feature({
  "line": 1,
  "name": "This is the login feature for Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "This is login scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Go to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter the below credentials",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 5
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTableWithHeaderDef.go_to_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWithHeaderDef.enter_the_below_credentials(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWithHeaderDef.click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("DataTableWithoutHeader.feature");
formatter.feature({
  "line": 1,
  "name": "This is the login feature for Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "This is login scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "You are on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "You enter the below credentials",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "DataTableWithoutHeaderDef.you_are_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWithoutHeaderDef.you_enter_the_below_credentials(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTableWithoutHeaderDef.click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Expressions.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file is to explaain expressions",
  "description": "",
  "id": "this-feature-file-is-to-explaain-expressions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "This is an expression scenario",
  "description": "",
  "id": "this-feature-file-is-to-explaain-expressions;this-is-an-expression-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have 1 laptop",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I have 7.5 CGPA",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "\"Arya\" is elder to \"Agni\" and \"Riya\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "ExpressionStepDef.I_have_1_laptop(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "7.5",
      "offset": 7
    }
  ],
  "location": "ExpressionStepDef.i_have_CGPA(float)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("LoginWithData.feature");
formatter.feature({
  "line": 1,
  "name": "This is the login feature for Orange HRM",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "This is login scenario",
  "description": "",
  "id": "this-is-the-login-feature-for-orange-hrm;this-is-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user enters the valid credentials \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "the user should see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefWithData.user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 39
    },
    {
      "val": "admin123",
      "offset": 51
    }
  ],
  "location": "LoginStepDefWithData.the_user_enters_the_valid_credentials_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefWithData.clicks_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefWithData.the_user_should_see_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("OpenGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test google search",
  "description": "",
  "id": "this-is-to-test-google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Google search scenario",
  "description": "",
  "id": "this-is-to-test-google-search;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is entering google.co.in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is typing the search term\t\"Saravanan\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enters the return key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenGoogleDefinitions.user_is_entering_google_co_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Saravanan",
      "offset": 32
    }
  ],
  "location": "OpenGoogleDefinitions.user_is_typing_the_search_term(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpenGoogleDefinitions.enters_the_return_key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpenGoogleDefinitions.the_user_should_see_the_search_results()"
});
formatter.result({
  "status": "skipped"
});
});