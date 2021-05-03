package Entity;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private int Id;
    private double TcNo;
    private String name;
    private String surname;
    private int birthDate;
    private int ownMoney;
    private Set<Game> ownGames = new HashSet<>();

    public Player(int id, double tcNo, String name, String surname, int birthDate) {
        Id = id;
        TcNo = tcNo;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getTcNo() {
        return TcNo;
    }

    public void setTcNo(double tcNo) {
        TcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(int ownMoney) {
        this.ownMoney = ownMoney;
    }

    public Set<Game> getOwnGames() {
        return ownGames;
    }

    public void setOwnGames(Set<Game> ownGames) {
        this.ownGames = ownGames;
    }
}
