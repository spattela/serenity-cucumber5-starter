package AuspostAPITests;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class AusPostCalTests {
    @Test
    public void verifyAUspostAPIcalculation() {
        RestAssured.
                given().header("auth-key", "438d4a46-676d-4bfe-bb1f-c401f8014128")
                .header("Accept", "*/*")
                .header("host", "developers.auspost.com.au")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json")
                .queryParam("country_code", "NZ")
                .queryParam("service_code", "INT_PARCEL_STD_OWN_PACKAGING")
                .queryParam("weight", "5").
                when().post("https://developers.auspost.com.au/backend/proxy/get/pac/postage/parcel/international/calculate.json").
                then().assertThat().statusCode(200).
                and().body("postage_result.costs.cost.item",containsString("Standard"));
    }


    //Parcel cost calculation for ANTIGUA AND BARBUDA with weight being 10Kgs to check total cost in the body
    @Test
    public void verifyAPCforAG() {
        RestAssured.
                given().header("auth-key", "438d4a46-676d-4bfe-bb1f-c401f8014128")
                .header("Accept", "*/*")
                .header("host", "developers.auspost.com.au")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json")
                .queryParam("country_code", "AG")
                .queryParam("service_code", "INT_PARCEL_STD_OWN_PACKAGING")
                .queryParam("weight", "10").
                when().post("https://developers.auspost.com.au/backend/proxy/get/pac/postage/parcel/international/calculate.json").
                then().assertThat().statusCode(200).
                and().body("postage_result.costs.cost.item",containsString("Standard"));
    }

    //Parcel cost calculation for ANTIGUA AND BARBUDA with weight being 15Kgs to check total cost in the body
    @Test
    public void verifyAPCforAS() {
        RestAssured.
                given().header("auth-key", "438d4a46-676d-4bfe-bb1f-c401f8014128")
                .header("Accept", "*/*")
                .header("host", "developers.auspost.com.au")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Connection", "keep-alive")
                .header("Content-Type", "application/json")
                .queryParam("country_code", "AS")
                .queryParam("service_code", "INT_PARCEL_STD_OWN_PACKAGING")
                .queryParam("weight", "15").
                when().post("https://developers.auspost.com.au/backend/proxy/get/pac/postage/parcel/international/calculate.json").
                then().assertThat().statusCode(200).
                and().body("postage_result.costs.cost.item",containsString("Standard"));
    }
}







