package com.jose.builds;

public class ConcreteHouseBuilder implements HouseBuilder {
  private int walls;
  private int doors;
  private int windows;
  private boolean hasRoof;
  private boolean hasGarage;
  private boolean hasGarden;
  private boolean hasSwimmingPool;
  private int statuesCount;

  public ConcreteHouseBuilder() {
    this.reset();
  }

  @Override
  public HouseBuilder setWalls(int walls) {
    this.walls = walls;
    return this;
  }

  @Override
  public HouseBuilder setDoors(int doors) {
    this.doors = doors;
    return this;
  }

  @Override
  public HouseBuilder setWindows(int windows) {
    this.windows = windows;
    return this;
  }

  @Override
  public HouseBuilder setRoof(boolean hasRoof) {
    this.hasRoof = hasRoof;
    return this;
  }

  @Override
  public HouseBuilder setGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
    return this;
  }

  @Override
  public HouseBuilder setGarden(boolean hasGarden) {
    this.hasGarden = hasGarden;
    return this;
  }

  @Override
  public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
    this.hasSwimmingPool = hasSwimmingPool;
    return this;
  }

  @Override
  public HouseBuilder setStatuesCount(int count) {
    this.statuesCount = count;
    return this;
  }

  @Override
  public House build() {
    House house = new House(walls, doors, windows, hasRoof, hasGarage, hasGarden, hasSwimmingPool, statuesCount);

    this.reset();
    return house;
  }

  @Override
  public void reset() {
    this.walls = 0;
    this.doors = 0;
    this.windows = 0;
    this.hasRoof = false;
    this.hasGarage = false;
    this.hasGarden = false;
    this.hasSwimmingPool = false;
    this.statuesCount = 0;
  }
}
