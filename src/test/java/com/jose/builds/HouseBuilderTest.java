package com.jose.builds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HouseBuilderTest {
  private HouseBuilder builder;

  @BeforeEach
  void setUp() {
    builder = new ConcreteHouseBuilder();
  }

  @Test
  void testBuildSimpleHouse() {
    House house = builder.setWalls(4)
        .setDoors(1)
        .setWindows(2)
        .setRoof(true)
        .build();

    assertEquals(4, house.getWalls());
    assertEquals(1, house.getDoors());
    assertEquals(2, house.getWindows());
    assertTrue(house.hasRoof());
    assertFalse(house.hasGarage());
    assertFalse(house.hasGarden());
    assertFalse(house.hasSwimmingPool());
    assertEquals(0, house.getStatuesCount());
  }
}
