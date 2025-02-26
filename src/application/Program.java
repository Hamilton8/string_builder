package application;

import model.entities.Comment;
import model.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static void main(String[] args) throws ParseException {
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome");
        Date date = new Date();
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland","I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);
        System.out.println(p1);
    }
}
