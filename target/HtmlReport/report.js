$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feats/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Feature",
  "description": "Validate HomePage Functionalities",
  "id": "homepage-feature",
  "keyword": "Feature"
});
formatter.befformatter.before({
  "duration": 14183659050,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Valid Login",
  "description": "",
  "id": "login-featute;valid-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in CRMPro Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user provides valid username and password and logs-in to Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user validates the title and username in HomePage",
  "keyword": "And formatter.result({
  "duration": 7205521079,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdefs.user_should_be_able_to_see_username_at_the_upper_left_corner()"
});
formatter.result({
  "duration": 431322209,
  "status": "passed"
});
formatter.after(formatter.result({
  "duration": 6376984592,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_validates_the_title_and_username_in_HomePage()"
});
formatter.result({
  "dformatter.result({
  "duration": 10946650596,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefs.user_enters_the_below_details(DataTable)"
});
formatter.result({
  "duration": 3140742858,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefs.a_new_contact_with_the_entered_details_should_be_created()"
});
formatter.result({
  "duration": 50842,
  "status": "passed"
});
formatter.after({
  "duration": 114296,
  "status": "passed"
});
formatter.after({
  "duration": 151535119,
  "status": "passed"
});
});