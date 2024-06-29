/**
 * author: akhilpathivada
 * time: 20/06/24 15:10
 */
package model;

import lombok.Data;

@Data
public class Account {

    int accountId;

    double balance;

    AccountStatus accountStatus;

    User user;

    CardDetails cardDetails;

}
