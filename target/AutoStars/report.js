$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nopcommerce/ComparingProducts.feature");
formatter.feature({
  "line": 2,
  "name": "Comparing Products",
  "description": "",
  "id": "comparing-products",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8764318841,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Customer should be able to see Products for Comparison",
  "description": "",
  "id": "comparing-products;customer-should-be-able-to-see-products-for-comparison",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Customer on a required Product page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Customer select a product and press on Add to compare list",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Again on required Product Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Customer select another product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "press on Add to compare list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "press on Compare Product list",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Customer should be able to see selected Products on Compare Products page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.customer_on_a_required_Product_page()"
});
formatter.result({
  "duration": 1929312460,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.customer_select_a_product_and_press_on_Add_to_compare_list()"
});
formatter.result({
  "duration": 87311330,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.Again_on_required_Product_Page()"
});
formatter.result({
  "duration": 3110616241,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.Customer_select_another_product()"
});
formatter.result({
  "duration": 1540520058,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.press_on_Add_to_compare_list()"
});
formatter.result({
  "duration": 75421384,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.press_on_Compare_Product_list()"
});
formatter.result({
  "duration": 226060811,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.customer_should_be_able_to_see_selected_Products_on_Compare_Products_page()"
});
formatter.result({
  "duration": 1223117231,
  "status": "passed"
});
formatter.after({
  "duration": 109954486,
  "status": "passed"
});
});