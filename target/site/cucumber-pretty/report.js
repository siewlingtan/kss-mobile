$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateNotification.feature");
formatter.feature({
  "line": 1,
  "name": "Create Notification",
  "description": "",
  "id": "create-notification",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3422531828,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create notification",
  "description": "",
  "id": "create-notification;create-notification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am logged in to KSS with correct \"\u003cstring\u003e\" and \"\u003cstring\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Create Notification link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I input title and content",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click Next",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I input MID",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Next",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I check on Email option",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Send Now",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see notification created successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cstring\u003e",
      "offset": 36
    },
    {
      "val": "\u003cstring\u003e",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1294208305,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 420876097,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnCreateNotificationLink()"
});
formatter.result({
  "duration": 1883061737,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iInputTitleAndContent()"
});
formatter.result({
  "duration": 1160979579,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iClickNext()"
});
formatter.result({
  "duration": 1148248960,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iInputMID()"
});
formatter.result({
  "duration": 457077627,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iClickNext()"
});
formatter.result({
  "duration": 446716269,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iCheckOnEmailOption()"
});
formatter.result({
  "duration": 305145249,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iClickOnSendNow()"
});
formatter.result({
  "duration": 272545028,
  "status": "passed"
});
formatter.match({
  "location": "CreateNotification.iShouldSeeNotificationCreatedSuccessfully()"
});
formatter.result({
  "duration": 6927311199,
  "status": "passed"
});
formatter.after({
  "duration": 146565,
  "status": "passed"
});
formatter.uri("SelfServicesModule.feature");
formatter.feature({
  "line": 1,
  "name": "Self Services Module",
  "description": "",
  "id": "self-services-module",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2688063500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Access Self Services Module",
  "description": "",
  "id": "self-services-module;access-self-services-module",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should be directed to Self-Services module",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1066877523,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 316878242,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToSelfServicesModule()"
});
formatter.result({
  "duration": 48643125,
  "status": "passed"
});
formatter.after({
  "duration": 65687,
  "status": "passed"
});
formatter.before({
  "duration": 2743343101,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "View Notifications Link",
  "description": "",
  "id": "self-services-module;view-notifications-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on View Notifications link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be directed to Notifications Listing Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1520452783,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 361366231,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnViewNotificationsLink()"
});
formatter.result({
  "duration": 1818905312,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToNotificationsListingPage()"
});
formatter.result({
  "duration": 56284206,
  "status": "passed"
});
formatter.after({
  "duration": 55834,
  "status": "passed"
});
formatter.before({
  "duration": 2702161648,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Create Notification Link",
  "description": "",
  "id": "self-services-module;create-notification-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on Create Notification link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be directed to Create Notification Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1104027004,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 354797086,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnCreateNotificationLink()"
});
formatter.result({
  "duration": 1744324716,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToCreateNotificationPage()"
});
formatter.result({
  "duration": 57594258,
  "status": "passed"
});
formatter.after({
  "duration": 48034,
  "status": "passed"
});
formatter.before({
  "duration": 2801193949,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Academic Checklists Link",
  "description": "",
  "id": "self-services-module;academic-checklists-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on Academic Checklists link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should be directed to Academic Checklists Listing Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1110918428,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 409069206,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnAcademicChecklistsLink()"
});
formatter.result({
  "duration": 849405591,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToAcademicChecklistsListingPage()"
});
formatter.result({
  "duration": 46995194,
  "status": "passed"
});
formatter.after({
  "duration": 53371,
  "status": "passed"
});
formatter.before({
  "duration": 3766559473,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Create Checklist Group Link",
  "description": "",
  "id": "self-services-module;create-checklist-group-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on Create Checklist Group link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I should be directed to Create Checklist Group Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1456882618,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 345503557,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnCreateChecklistGroupLink()"
});
formatter.result({
  "duration": 792524862,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToCreateChecklistGroupPage()"
});
formatter.result({
  "duration": 54001161,
  "status": "passed"
});
formatter.after({
  "duration": 44750,
  "status": "passed"
});
formatter.before({
  "duration": 3789347236,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "View Requests Link",
  "description": "",
  "id": "self-services-module;view-requests-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I click on View Requests link",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I should be directed to View Requests Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1124356418,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 639579256,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnViewRequestsLink()"
});
formatter.result({
  "duration": 1333470866,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToViewRequestsPage()"
});
formatter.result({
  "duration": 46354331,
  "status": "passed"
});
formatter.after({
  "duration": 53371,
  "status": "passed"
});
formatter.before({
  "duration": 3763385953,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "View Leaves Link",
  "description": "",
  "id": "self-services-module;view-leaves-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I click on View Leaves link",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should be directed to View Leaves Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1163773345,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 337314808,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnViewLeavesLink()"
});
formatter.result({
  "duration": 1382488409,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToViewLeavesPage()"
});
formatter.result({
  "duration": 61902938,
  "status": "passed"
});
formatter.after({
  "duration": 58297,
  "status": "passed"
});
formatter.before({
  "duration": 2810213644,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "View Reports Link",
  "description": "",
  "id": "self-services-module;view-reports-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "I am logged in to KSS with correct \"username\" and \"password\"",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I click on Self-Services link",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "I click on View Reports link",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I should be directed to View Reports Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 36
    },
    {
      "val": "password",
      "offset": 51
    }
  ],
  "location": "SelfServicesModule.iAmLoggedInToKSSWithCorrectAnd(String,String)"
});
formatter.result({
  "duration": 1237076733,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnSelfServicesLink()"
});
formatter.result({
  "duration": 476307600,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iClickOnViewReportsLink()"
});
formatter.result({
  "duration": 1734566039,
  "status": "passed"
});
formatter.match({
  "location": "SelfServicesModule.iShouldBeDirectedToViewReportsPage()"
});
formatter.result({
  "duration": 44696136,
  "status": "passed"
});
formatter.after({
  "duration": 41465,
  "status": "passed"
});
});