package com.example.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Senaryo dosyalarının yolu
        glue = "com.example.steps" // Adım tanımlama sınıfının paket yolu
)
public class CucumberRunnerTest {

}
