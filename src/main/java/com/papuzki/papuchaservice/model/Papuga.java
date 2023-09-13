package com.papuzki.papuchaservice.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Papuga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private int weight;

    @Column(name = "color")
    private Enum color;


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


    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Papuga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color=" + color +
                '}';
    }
}