package com.jose.builds;

import org.junit.jupiter.api.BeforeEach;

public class HouseBuilderTest {
  private HouseBuilder builder;

  @BeforeEach
  void setUp() {
    builder = new ConcreteHouseBuilder();
  }
}
