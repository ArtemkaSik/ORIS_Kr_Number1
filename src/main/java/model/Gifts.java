package model;

import lombok.Setter;
import lombok.Getter;

import java.util.Date;

@Setter@Getter
public class Gifts {
    private Long id;
    private String title;
    private String giver;
    private String receiver;
    private Date date;

    public Gifts() {}

    public Gifts(Long id, String title, String giver, String receiver, Date date) {
        this.id = id;
        this.title = title;
        this.giver = giver;
        this.receiver = receiver;
        this.date = date;
    }
}
