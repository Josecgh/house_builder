package com.jose.builds;

public class House {
  private final int walls;
  private final int doors;
  private final int windows;
  private final boolean hasRoof;
  private final boolean hasGarage;
  private final boolean hasGarden;
  private final boolean hasSwimmingPool;
  private final int statuesCount;

  House(int walls, int doors, int windows, boolean hasRoof,
      boolean hasGarage, boolean hasGarden, boolean hasSwimmingPool, int statuesCount) {
    this.walls = walls;
    this.doors = doors;
    this.windows = windows;
    this.hasRoof = hasRoof;
    this.hasGarage = hasGarage;
    this.hasGarden = hasGarden;
    this.hasSwimmingPool = hasSwimmingPool;
    this.statuesCount = statuesCount;
  }
}
