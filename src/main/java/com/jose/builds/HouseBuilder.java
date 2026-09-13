package com.jose.builds;

public interface HouseBuilder {
  HouseBuilder setWalls(int walls);
  HouseBuilder setDoors(int doors);
  HouseBuilder setWindows(int windows);
  HouseBuilder setRoof(boolean hasRoof);
  HouseBuilder setGarage(boolean hasGarage);
  HouseBuilder setGarden(boolean hasGarden);
  HouseBuilder setSwimmingPool(boolean hasSwimmingPool);
  HouseBuilder setStatuesCount(int count);
  House build();
  void reset();
}