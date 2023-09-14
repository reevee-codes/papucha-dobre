package com.papuzki.papuchaservice.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "papugi")
public class Papuga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private int weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "color")
    private Color Color;

    public Papuga(long id, String name, int weight, com.papuzki.papuchaservice.model.Color color) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        Color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public com.papuzki.papuchaservice.model.Color getColor() {
        return Color;
    }

    public void setColor(com.papuzki.papuchaservice.model.Color color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Papuga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", Color=" + Color +
                '}';
    }
}