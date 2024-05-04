/**
 * author: akhilpathivada
 * time: 02/05/24 06:18
 */
package org.example.service;

import org.example.model.OwedUser;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class ShareExpenses {

    private List<OwedUser> owedUsers;

    public ShareExpenses() {
        owedUsers = new ArrayList<>();
    }

    public void splitEqualExpenses(User user, List<User> users, double amout) {

    }

    public void splitExactExpenses(User user, List<User> users, double amout) {

    }
}
