$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeaturesFolder/fbLogin.feature");
formatter.feature({
  "name": "Facebook Login Funtion Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@e2e"
    }
  ]
});
formatter.scenario({
  "name": "User Test Valid Login credintial scenario one",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@e2e"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter url",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter userName and password",
  "rows": [
    {
      "cells": [
        "name",
        "id",
        "emailid"
      ]
    },
    {
      "cells": [
        "vel",
        "kj87",
        "Vel@gmail.com"
      ]
    },
    {
      "cells": [
        "Raj",
        "987yh",
        "Raj@gmail.com"
      ]
    },
    {
      "cells": [
        "Saran",
        "kjh987",
        "saran@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_userName_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate test",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_validate_test()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User Test Valid Login credintial scenario two",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@e2e"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter url",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter userName and password",
  "rows": [
    {
      "cells": [
        "name",
        "id",
        "emailid"
      ]
    },
    {
      "cells": [
        "vel",
        "kj87",
        "Vel@gmail.com"
      ]
    },
    {
      "cells": [
        "Raj",
        "987yh",
        "Raj@gmail.com"
      ]
    },
    {
      "cells": [
        "Saran",
        "kjh987",
        "saran@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_userName_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate test scenario two",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_validate_test_scenario_two()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.steps.StepDefinition.user_validate_test_scenario_two(StepDefinition.java:99)\r\n\tat ✽.user validate test scenario two(file:src/test/resources/FeaturesFolder/fbLogin.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});