package model;

import java.util.List;

/**
 * author: akhilpathivada
 * time: 06/05/24 12:09
 */

public class Question extends Entity {

    List<EditHistory> editHistoryList;

    List<Answer> answers;

    List<Tag> tags;

    String title;

    String description;

    QuestionStatus questionStatus;

    public void addTag(Tag tag) {

    }
}
