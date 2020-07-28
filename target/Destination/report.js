$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12899497600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to register successfully.",
  "description": "So that user can use all the user functionality on the website.",
  "id": "registration-feature;user-should-able-to-register-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is already on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on register-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsAlreadyOnHomePage()"
});
formatter.result({
  "duration": 393470300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnRegisterButton()"
});
formatter.result({
  "duration": 3834459100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEntersAllRequiredRegistrationDetails()"
});
formatter.result({
  "duration": 2951035900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClicksOnRegisterSubmitButton()"
});
formatter.result({
  "duration": 3905679600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeRegisterSuccessfully()"
});
formatter.result({
  "duration": 847885800,
  "status": "passed"
});
formatter.after({
  "duration": 525813200,
  "status": "passed"
});
});