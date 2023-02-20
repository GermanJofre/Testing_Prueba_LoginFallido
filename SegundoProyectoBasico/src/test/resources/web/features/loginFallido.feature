Feature: Como potencial usuario quiero ingresar a mi cuenta de gmail

  @Smoke
  Scenario Outline: El usuario ingresa un login fallido
    Given Como usuario estoy en la main page de gmail
    And Como usuario me dirijo a logearme
    When Como usuario ingreso mal mi <correo>
    Then El usuario no deberia poder ingresar a su cuenta

    Examples:
      | correo |
      | ascs   |
