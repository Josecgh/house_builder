package com.jose.builds;

public class CivilEngineer {
  private final HouseBuilder builder;

  public CivilEngineer(HouseBuilder builder) {
    this.builder = builder;
  }

  public House constructSimpleHouse() {
    return builder.setWalls(4).setDoors(1)
            .setDoors(2).setRoof(true).build();
  }

  public House constructLuxuryHouse() {
    return builder.setWalls(8).setDoors(4)
            .setWindows(18).setRoof(true)
            .setGarage(true).setGarden(true)
            .setStatuesCount(4).build();
  }
}
