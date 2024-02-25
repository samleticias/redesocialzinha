package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public Program() throws ParseException {
    }
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Comment c1 = new Comment("Tenha uma boa viagem!");
    Comment c2 = new Comment("Que legal!");
    Post p1 = new Post(sdf.parse(
            "21/06/2018 13:05:44"),
            "Viajando para a Nova Zelândia",
            "Vou visitar esse país maravilhoso!",
            12);

    /*p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);

     */
}
