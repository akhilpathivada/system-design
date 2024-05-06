/**
 * author: akhilpathivada
 * time: 06/05/24 12:14
 */
package model;

import model.actor.Member;

import javax.xml.stream.events.Comment;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Entity {

    int id;

    Member creator;

    Map<VoteType, Integer> votes;

    Date creationDate;

    List<Comment> comments;

    public boolean flagEntity(Member member) {

    }

    public boolean voteEntity(VoteType voteType) {

    }

    public boolean addComment(Comment comment) {

    }
}
