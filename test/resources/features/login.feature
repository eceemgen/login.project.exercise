Feature: Kullanıcı girişi
  Kullanıcıların web uygulamasına giriş yapmasını test edelim.

  Scenario: Başarılı giriş
    Given Kullanıcı uygulamanın giriş sayfasında
    When Kullanıcı geçerli kullanıcı adı "john.doe" ve şifre "sifre123" ile giriş yapmaya çalışır
    Then Kullanıcı başarılı bir şekilde sisteme giriş yapar ve ana sayfada yönlendirilir

  Scenario: Hatalı giriş
    Given Kullanıcı uygulamanın giriş sayfasında
    When Kullanıcı hatalı kullanıcı adı "jane.smith" ve şifre "yanlis123" ile giriş yapmaya çalışır
    Then Kullanıcı hata mesajı alır ve giriş yapamaz
