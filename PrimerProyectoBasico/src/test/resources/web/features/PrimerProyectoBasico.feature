Feature: Como potencial usuario quiero buscar juegos en Google

  @Smoke
  Scenario Outline: Busqueda de juegos en Google
    Given Como usuario estoy en la main page de google
    When Como usuario busco referencias a <juegos>
    Then El buscador muestra los siguientes resultados <juegos>

    Examples:
      | juegos           |
      | Zelda            |
      | Xenoblade        |
      | Super Smash bros |