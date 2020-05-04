package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Game {
    private String id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private String content;
    private List<Player> oneToMany;

    @GeneratedValue
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Basic
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @OneToMany
    public List<Player> getOneToMany() {
        return oneToMany;
    }

    public void setOneToMany(List<Player> oneToMany) {
        this.oneToMany = oneToMany;
    }
}
