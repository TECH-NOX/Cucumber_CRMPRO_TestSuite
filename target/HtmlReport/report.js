$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Contacts Page Functionality",
  "description": "Validate functionalities in Contacts Page",
  "id": "contacts-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8480092476,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create new contact",
  "description": "",
  "id": "contacts-page-functionality;create-new-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user navigates to New Contacts page by hovering over Contacts tab",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters the below details",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "mobile",
        "email"
      ],
      "line": 7
    },
    {
      "cells": [
        "Henry",
        "Gary",
        "9878734343",
        "henry@gary.com"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "a new contact with the entered details should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefs.user_navigates_to_New_Contacts_page_by_hovering_over_Contacts_tab()"
});
formatter.result({
  "duration": 8924901785,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefs.user_enters_the_below_details(DataTable)"
});
formatter.result({
  "duration": 3483227382,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepDefs.a_new_contact_with_the_entered_details_should_be_created()"
});
formatter.result({
  "duration": 71456,
  "status": "passed"
});
formatter.after({
  "duration": 177095,
  "status": "passed"
});
formatter.after({
  "duration": 267435834,
  "status": "passed"
});
formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Feature",
  "description": "Validate HomePage Functionalities",
  "id": "homepage-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6706878550,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validate username in HomePage",
  "description": "",
  "id": "homepage-feature;validate-username-in-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user logs in to CRMPRO site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user should be able to see username at the upper left corner",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.user_logs_in_to_CRMPRO_site()"
});
formatter.result({
  "duration": 3917581921,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdefs.user_should_be_able_to_see_username_at_the_upper_left_corner()"
});
formatter.result({
  "duration": 292510362,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cUser:[]tech nox\u003e but was:\u003cUser:[ ]tech nox\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat stepDefs.HomePageStepdefs.user_should_be_able_to_see_username_at_the_upper_left_corner(HomePageStepdefs.java:31)\n\tat ✽.Then user should be able to see username at the upper left corner(HomePage.feature:6)\n",
  "status": "failed"
});
formatter.after({
  "duration": 409883590,
  "status": "passed"
});
formatter.after({
  "duration": 251126591,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Featute",
  "description": "Description: This feature tests the login functionality",
  "id": "login-featute",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7053275758,
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
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.user_is_in_CRMPro_Url()"
});
formatter.result({
  "duration": 32265074,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_provides_valid_username_and_password_and_logs_in_to_Home_Page()"
});
formatter.result({
  "duration": 3988061574,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.user_validates_the_title_and_username_in_HomePage()"
});
formatter.result({
  "duration": 188064497,
  "status": "passed"
});
formatter.after({
  "duration": 61958,
  "status": "passed"
});
formatter.after({
  "duration": 49123,
  "status": "passed"
});
});