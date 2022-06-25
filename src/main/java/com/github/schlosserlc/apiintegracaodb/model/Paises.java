package com.github.schlosserlc.apiintegracaodb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "countries")
public class Paises {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int population;

    public Paises() {
    }

    public Paises(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paises paises = (Paises) o;
        return population == paises.population &&
                Objects.equals(id, paises.id) &&
                Objects.equals(name, paises.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, population);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();
    }
}
