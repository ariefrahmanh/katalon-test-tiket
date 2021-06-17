$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/arief.hakim/git/katalon-web-automation/./Include/features/RequestDemo/rctiPlusLogin.feature");
formatter.feature({
  "name": "loginRCTI",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "loginRCTI",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "login page rcti",
  "keyword": "Given "
});
formatter.match({
  "location": "rctiPlusLogin.request_demo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input username",
  "keyword": "When "
});
formatter.match({
  "location": "rctiPlusLogin.user_input_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input password",
  "keyword": "Then "
});
formatter.match({
  "location": "rctiPlusLogin.user_input_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user klik login",
  "keyword": "And "
});
formatter.match({
  "location": "rctiPlusLogin.user_klik_login()"
});
formatter.result({
  "status": "passed"
});
});