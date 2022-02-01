package com.bridgelabz;

public class StateCensus {

    private String state;
    private String population;
    private String areaInSqKm;
    private String densityPerSqKm;

    public StateCensus() {
        super();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getAreaInSqKm() {
        return areaInSqKm;
    }

    public void setAreaInSqKm(String areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }

    public String getDensityPerSqKm() {
        return densityPerSqKm;
    }

    public void setDensityPerSqKm(String densityPerSqKm) {
        this.densityPerSqKm = densityPerSqKm;
    }

    @Override
    public String toString() {
        return "StateCences [state=" + state + ", population=" + population + ", areaInSqKm=" + areaInSqKm
                + ", densityPerSqKm=" + densityPerSqKm + "]";
    }


}
