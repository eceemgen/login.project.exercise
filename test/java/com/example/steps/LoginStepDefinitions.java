package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("Kullanıcı uygulamanın giriş sayfasında")
    public void kullanıcı_uygulamanın_giriş_sayfasında() {
        // Giriş sayfasında olduğunu doğrulayacak kodları burada uygulayın
        System.out.println("Kullanıcı uygulamanın giriş sayfasında");
    }

    @When("Kullanıcı hatalı kullanıcı adı {string} ve şifre {string} ile giriş yapmaya çalışır")
    public void kullanıcı_hatalı_kullanıcı_adı_ve_şifre_ile_giriş_yapmaya_çalışır(String invalidUsername, String invalidPassword) {
        // Hatalı kullanıcı adı ve şifre ile giriş yapmayı deneyecek kodları burada uygulayın
        System.out.println("Kullanıcı hatalı kullanıcı adı " + invalidUsername + " ve şifre " + invalidPassword + " ile giriş yapmaya çalışıyor");
    }

    @Then("Kullanıcı hata mesajı alır ve giriş yapamaz")
    public void kullanıcı_hata_mesajı_alır_ve_giriş_yapamaz() {
        // Hata mesajı alındığını ve girişin başarısız olduğunu doğrulayacak kodları burada uygulayın
        System.out.println("Kullanıcı hata mesajı alır ve giriş yapamaz");
    }

    @When("Kullanıcı geçerli kullanıcı adı {string} ve şifre {string} ile giriş yapmaya çalışır")
    public void kullanıcı_geçerli_kullanıcı_adı_ve_şifre_ile_giriş_yapmaya_çalışır(String validUsername, String validPassword) {
        // Geçerli kullanıcı adı ve şifre ile giriş yapmayı deneyecek kodları burada uygulayın
        System.out.println("Kullanıcı geçerli kullanıcı adı " + validUsername + " ve şifre " + validPassword + " ile giriş yapmaya çalışıyor");
    }

    @Then("Kullanıcı başarılı bir şekilde sisteme giriş yapar ve ana sayfada yönlendirilir")
    public void kullanıcı_başarılı_bir_şekilde_sisteme_giriş_yapar_ve_ana_sayfada_yönlendirilir() {
        // Girişin başarılı olduğunu ve ana sayfada yönlendirildiğini doğrulayacak kodları burada uygulayın
        System.out.println("Kullanıcı başarılı bir şekilde sisteme giriş yapar ve ana sayfada yönlendirilir");
    }
}

